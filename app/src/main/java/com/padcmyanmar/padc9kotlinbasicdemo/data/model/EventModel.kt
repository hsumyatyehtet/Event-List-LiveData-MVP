package com.padcmyanmar.padc9kotlinbasicdemo.data.model

import androidx.lifecycle.LiveData
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo

interface EventModel {

    fun getEvents(onFailure: (String) -> Unit): LiveData<List<EventVo>>

    fun getEventById(eventId: Int): LiveData<EventVo>
}