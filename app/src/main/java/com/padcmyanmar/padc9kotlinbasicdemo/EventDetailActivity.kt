package com.padcmyanmar.padc9kotlinbasicdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.padcmyanmar.padc9kotlinbasicdemo.adapters.EventDetailImageAdapter
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.presenters.EventDetailPresenter
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.views.EventDetailView
import kotlinx.android.synthetic.main.activity_event_details.*

class EventDetailActivity : BaseActivity(),EventDetailView {

    override fun displayEventData(eventData: EventVo) {

    }

    private lateinit var mPresenter: EventDetailPresenter

    companion object {
        const val EXTRA_EVENT_ID: String = "EventIdExtra"

        fun newIntent(context: Context, eventIdExtra: Int): Intent {
//            val intent = Intent(context, EventDetailActivity::class.java)
//            intent.putExtra(EXTRA_EVENT_ID, eventIdExtra)
//            return intent

            return Intent(context, EventDetailActivity::class.java).apply {
                putExtra(EXTRA_EVENT_ID, eventIdExtra)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_event_details)
        setSupportActionBar(toolbar)

        vpEventDetailImages.adapter = EventDetailImageAdapter()

        mPresenter= EventDetailPresenter()
        mPresenter.initPresenter(this)

        val eventId = intent.getIntExtra(EXTRA_EVENT_ID, 0)
        mPresenter.onUIReady(eventId,this)

        //mPresenter.onUIReady(eventId)
    }

    private fun bindData(eventVO: EventVo) {
        tvEventTitle.text = eventVO.eventName
        tvDate.text = eventVO.eventStartTime
    }


}