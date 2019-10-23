package com.padcmyanmar.padc9kotlinbasicdemo.network

import com.padcmyanmar.padc9kotlinbasicdemo.network.response.GetEventResponse
import com.padcmyanmar.padc9kotlinbasicdemo.utils.GET_EVENTS
import com.padcmyanmar.padc9kotlinbasicdemo.utils.PARAM_ACCESS_TOKEN
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface EventsApi {

    @POST(GET_EVENTS)
    @FormUrlEncoded
    fun getAllEvents(@Field(PARAM_ACCESS_TOKEN) accessToken: String): Call<GetEventResponse>
}