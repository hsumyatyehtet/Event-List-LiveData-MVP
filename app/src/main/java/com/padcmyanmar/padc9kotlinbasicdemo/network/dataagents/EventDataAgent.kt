package com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents

import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo

interface EventDataAgent {

    fun getEvents(
        accessToken: String,
        onSuccess: (List<EventVo>) -> Unit,
        onFailure: (String) -> Unit)

}