package com.padcmyanmar.padc9kotlinbasicdemo

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.padcmyanmar.padc9kotlinbasicdemo.adapters.EventListAdapter
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.presenters.EventListPresenter
import com.padcmyanmar.padc9kotlinbasicdemo.mvp.views.EventListView
import kotlinx.android.synthetic.main.activity_adapter_based_view.*

class MainActivity : BaseActivity(), EventListView {

    override fun displayError(errorMessage: String) {
        Snackbar.make(rootView, errorMessage, Snackbar.LENGTH_LONG).show()
    }

    override fun displayEventList(eventList: List<EventVo>) {
        mAdapter.setNewData(eventList.toMutableList())
    }

    override fun navigateToDetail(eventId: Int) {
        startActivity(EventDetailActivity.newIntent(applicationContext, eventId))
    }

    private lateinit var mPresenter: EventListPresenter
    private lateinit var mAdapter: EventListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_adapter_based_view)
        setSupportActionBar(toolbar)

        //initialize presenter
        mPresenter = ViewModelProviders.of(this).get(EventListPresenter::class.java)
        mPresenter.initPresenter(this)


        mAdapter = EventListAdapter(mPresenter)

        with(rvEvents) {
            rvEvents.setHasFixedSize(true)
            rvEvents.layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mAdapter
        }

        mPresenter.onUiReady(this)

    }

}
