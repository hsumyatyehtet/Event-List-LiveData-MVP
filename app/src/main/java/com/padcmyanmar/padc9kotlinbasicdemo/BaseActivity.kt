package com.padcmyanmar.padc9kotlinbasicdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.padc9kotlinbasicdemo.data.model.EventModel
import com.padcmyanmar.padc9kotlinbasicdemo.data.model.EventModelImpl

abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var model: EventModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = EventModelImpl
    }
}