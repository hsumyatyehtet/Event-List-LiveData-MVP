package com.padcmyanmar.padc9kotlinbasicdemo.data.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.utils.DUMMY_ACCESS_TOKEN

object EventModelImpl : BaseModel(), EventModel {

    override fun getEvents( onFailure: (String) -> Unit): LiveData<List<EventVo>> {
        val eventFromDB = database.eventDao().getAllEvent()

//        dataAgent.getEvents(
//            DUMMY_ACCESS_TOKEN,
//            {
//                database.eventDao().insertEvents(it)
//            },
//            onFailure
//        )


       // return eventFromDB
        return Transformations.distinctUntilChanged(eventFromDB)

    }

    override fun getEventById(eventId: Int): LiveData<EventVo> {
       // return database.eventDao().getEventById(eventId)
        return Transformations.distinctUntilChanged(
            database.eventDao().getEventById(eventId)
        )
    }
}