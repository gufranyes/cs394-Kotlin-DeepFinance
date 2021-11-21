package com.deeplabstudio.deepfinance

import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


class UrlJson {
    fun getJson(SourceUrl: String?): String? {
        val result = StringBuilder()
        return try {
            val policy = ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
            val url = URL(SourceUrl)
            val urlConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
            val `in`: InputStream = BufferedInputStream(urlConnection.getInputStream())
            val reader = BufferedReader(InputStreamReader(`in`))
            var inputLine: String?
            while (reader.readLine().also { inputLine = it } != null) {
                result.append(inputLine)
            }
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }
}