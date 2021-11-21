package com.deeplabstudio.deepfinance.service

import retrofit2.http.GET
import com.deeplabstudio.deepfinance.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call


interface CryptoAPI {

    @GET("prices?key=75ce9dd6e1a56157be212b0664b7d2548f014c65")
    fun getData(): Observable<List<CryptoModel>>

}