package com.padcmyanmar.padc9kotlinbasicdemo.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.delegate.EventItemDelegate
import kotlinx.android.synthetic.main.view_item_event.view.*

class EventItemViewHolder(itemView: View, private val delegate: EventItemDelegate) : BaseViewHolder<EventVo>(itemView) {

    init {
        itemView.setOnClickListener {
            val id = data?.id
            data?.id?.let { id ->
                delegate.onTapEventItem(id)
            }
//            if (id!=null){
//                delegate.onTapEventItem(id)
//            }

        }
    }

    override fun bindData(data: EventVo) {
        itemView.tvEventName.text = data.eventName
        itemView.tvTime.text = data.eventStartTime
        itemView.tvEventAgeRange.text = data.eventRequirementVo.ageRange
        itemView.tvLocationName.text = data.eventLocationName
        itemView.tvLocationFullAddress.text = data.eventLocationFullAddress
        itemView.tvOrganizerName.text = data.eventOrganizerVO.organizerName
        itemView.tvEventOwnerRole.text = data.eventOrganizerVO.organizerRole

        Glide.with(itemView)
            .load(data.eventOrganizerVO.organizerPhotoUrl)
            .into(itemView.ivOrganizer)
    }
}
