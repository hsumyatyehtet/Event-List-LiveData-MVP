package com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents

import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.network.EventsApi
import com.padcmyanmar.padc9kotlinbasicdemo.network.response.GetEventResponse
import com.padcmyanmar.padc9kotlinbasicdemo.utils.BASE_URL
import com.padcmyanmar.padc9kotlinbasicdemo.utils.EM_NULL_EVENT_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitAgent : EventDataAgent {

    private val eventApi: EventsApi

    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        eventApi = retrofit.create(EventsApi::class.java)
    }

    override fun getEvents(
        accessToken: String,
        onSuccess: (List<EventVo>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val call = eventApi.getAllEvents(accessToken)
        call.enqueue(object : Callback<GetEventResponse> {

            override fun onFailure(call: Call<GetEventResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(
                call: Call<GetEventResponse>,
                response: Response<GetEventResponse>
            ) {

                val eventResponse = response.body()
                if (eventResponse != null) {
                    if (eventResponse.data != null) {
                        onSuccess(eventResponse.data)
                    } else {
                        onFailure(eventResponse.message)
                    }
                } else {
                    onFailure(EM_NULL_EVENT_RESPONSE)
                }
            }

        })
    }
}