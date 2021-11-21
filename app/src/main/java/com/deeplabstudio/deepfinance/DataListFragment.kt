package com.deeplabstudio.deepfinance

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.deeplabstudio.deepfinance.Adapter.Data
import com.deeplabstudio.deepfinance.Adapter.DataAdapter
import org.json.JSONObject

private const val URL_PARAM = "URL"

class DataListFragment : Fragment() {

    private var url_param: String? = null
    lateinit var mRecylerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            url_param = it.getString(URL_PARAM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_data_list, container, false)

        mRecylerView = rootView.findViewById(R.id.mRecylerView)
        mRecylerView.layoutManager = GridLayoutManager(activity,2)

        var adapter = DataAdapter(getData())
        mRecylerView.adapter = adapter

        val handler = Handler()
        val r: Runnable = object : Runnable {
            override fun run() {
                adapter.update(getData())
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(r, 2000)

        return rootView
    }


    fun getData(): ArrayList<Data>{
        val dataList:ArrayList<Data> = ArrayList()
        val result = UrlJson().getJson(url_param)
        val jsonObject = JSONObject(result)
        val keys = jsonObject.keys()
        while (keys.hasNext()){
            var key = keys.next()
            if (key.equals("DVZSP1")) continue
            val data = jsonObject.get(key)
            val jsonParse = JSONObject(data.toString())
            val satis = jsonParse.getDouble("satis")
            val alis = jsonParse.getDouble("alis")
            val degisim = jsonParse.getString("degisim")
            if (url_param?.contains("altin") == true) key = Flags().GetName(key)
            dataList.add(Data(key,satis,alis,degisim))
        }
        return dataList
    }

    companion object {
        @JvmStatic
        fun newInstance(url_param: String) =
            DataListFragment().apply {
                arguments = Bundle().apply {
                    putString(URL_PARAM, url_param)
                }
            }
    }
}