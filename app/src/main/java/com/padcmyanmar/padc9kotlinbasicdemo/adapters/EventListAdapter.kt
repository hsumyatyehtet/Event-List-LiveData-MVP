package com.padcmyanmar.padc9kotlinbasicdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.padcmyanmar.padc9kotlinbasicdemo.R
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.delegate.EventItemDelegate
import com.padcmyanmar.padc9kotlinbasicdemo.viewholders.EventItemViewHolder

class EventListAdapter(private val delegate: EventItemDelegate): BaseRecyclerAdapter<EventItemViewHolder,EventVo> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventItemViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_event,parent,false)
        return EventItemViewHolder(view,delegate)
    }


}