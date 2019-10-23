package com.padcmyanmar.padc9kotlinbasicdemo.network.response

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.utils.CODE_RESPONSE_OK

data class GetEventResponse(

    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("data")
    val data: List<EventVo>
) {
    fun isResponseOk():Boolean {
        return code == CODE_RESPONSE_OK && data != null
    }
}

