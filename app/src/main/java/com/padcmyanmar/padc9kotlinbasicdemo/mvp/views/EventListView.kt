package com.padcmyanmar.padc9kotlinbasicdemo.mvp.views

import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo

interface EventListView: BaseView {

    fun displayEventList(eventList: List<EventVo>)
    fun displayError(errorMessage: String)
    fun navigateToDetail(eventId: Int)
}