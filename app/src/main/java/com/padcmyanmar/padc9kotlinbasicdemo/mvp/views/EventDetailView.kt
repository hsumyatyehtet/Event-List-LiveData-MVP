package com.padcmyanmar.padc9kotlinbasicdemo.mvp.views

import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo

interface EventDetailView: BaseView{

    fun displayEventData(eventData: EventVo)
}