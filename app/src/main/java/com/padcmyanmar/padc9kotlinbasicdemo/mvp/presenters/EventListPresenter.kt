package com.padcmyanmar.padc9kotlinbasicdemo.mvp.presenters

import androidx.lifecycle.Observer
import com.padcmyanmar.padc9kotlinbasicdemo.BaseActivity
import com.padcmyanmar.padc9kotlinbasicdemo.data.model.EventModelImpl
import com.padcmyanmar.padc9kotlinbasicdemo.delegate.EventItemDelegate
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.views.EventListView

class EventListPresenter : BasePresenter<EventListView>(), EventItemDelegate {

    override fun onTapEventItem(eventId: Int) {
        mView.navigateToDetail(eventId)
    }

    fun onUiReady(activity: BaseActivity) {
        val model: EventModelImpl = EventModelImpl
        model.getEvents { mView.displayError(it) }
            .observe(activity, Observer {
                mView.displayEventList(it)
            })
    }
}
