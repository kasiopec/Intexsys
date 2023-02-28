package com.example.intexsys.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

class IntexsysApi {

    companion object {
        const val BASE_URL = "https://www.opticsplanet.com/"

        //API KEY SHOULD NOT BE IN THE CODE
        const val API_KEY =
            "38effcdb60d05a3df77e47dd72a81a56c0556d5885c4d5ca9d307bdd50e7afa80d06ca4752c471b3906394a49e45afe6edfc44355340218d8e47e6c9c0c8d320"
        const val API_QUERY_KEY = "x-apikey"
    }


    private val client = OkHttpClient.Builder()
        .apply {
            addInterceptor { chain ->
                val request = chain.request()

                chain.proceed(
                    request
                        .newBuilder()
                        .addHeader(API_QUERY_KEY, API_KEY)
                        .build()
                )
            }
        }
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(service: Class<T>): T = retrofit.create(service)
}