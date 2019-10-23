package com.padcmyanmar.padc9kotlinbasicdemo.data.model

import android.content.Context
import com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents.RetrofitAgent
import com.padcmyanmar.padc9kotlinbasicdemo.persistence.EventDatabase
import retrofit2.Retrofit

abstract class BaseModel {

    protected val dataAgent= RetrofitAgent

    protected lateinit var database: EventDatabase

    public fun initDatabase(context: Context){
        database= EventDatabase.getInstance(context)
    }
}