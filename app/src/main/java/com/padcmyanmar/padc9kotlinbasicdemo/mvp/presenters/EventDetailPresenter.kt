package com.padcmyanmar.padc9kotlinbasicdemo.mvp.presenters

import com.padcmyanmar.padc9kotlinbasicdemo.BaseActivity
import com.padcmyanmar.padc9kotlinbasicdemo.data.model.EventModelImpl
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.views.EventDetailView
import java.util.*

class EventDetailPresenter : BasePresenter<EventDetailView>() {

    fun onUIReady(eventId: Int, activity: BaseActivity) {
        if (eventId != 0) {
            val model: EventModelImpl = EventModelImpl
            model.getEventById(eventId)
                .observe(activity,androidx.lifecycle.Observer {
                    mView.displayEventData(it)
                })
        }
    }

}