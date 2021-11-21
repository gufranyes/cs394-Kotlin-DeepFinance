package com.deeplabstudio.deepfinance.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deeplabstudio.deepfinance.Flags
import com.deeplabstudio.deepfinance.R
import com.squareup.picasso.Picasso

class DataAdapter (val dataList: ArrayList<Data>): RecyclerView.Adapter<DataAdapter.ViewHodler>() {

    fun update(newList:ArrayList<Data>){
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()
    }

    class ViewHodler(itemView:View): RecyclerView.ViewHolder(itemView) {
        val mFlag = itemView.findViewById<ImageView>(R.id.mFlag)
        val mTitle = itemView.findViewById<TextView>(R.id.mTitle)
        val mBuy = itemView.findViewById<TextView>(R.id.mBuy)
        val mSell = itemView.findViewById<TextView>(R.id.mSell)
        val mChange = itemView.findViewById<TextView>(R.id.mChange)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHodler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ic_recyler_item, parent, false)
        return ViewHodler(view)
    }

    override fun onBindViewHolder(holder: ViewHodler, position: Int) {
        holder.mTitle.setText(dataList[position].title)
        holder.mBuy.setText(DoubleToString(dataList[position].buy))
        holder.mSell.setText(DoubleToString(dataList[position].sell))
        holder.mChange.setText(dataList[position].change)
        try {
            Picasso.get().load(Flags().getFlags(dataList[position].title)).centerCrop().fit().into(holder.mFlag)
        }catch (e: Exception){
            e.localizedMessage
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun DoubleToString(price:Double):String{
        return price.toBigDecimal().toPlainString()
    }

}