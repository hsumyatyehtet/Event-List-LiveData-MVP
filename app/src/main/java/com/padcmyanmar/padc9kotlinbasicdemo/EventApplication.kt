package com.padcmyanmar.padc9kotlinbasicdemo

import android.app.Application
import androidx.work.*
import com.padcmyanmar.padc9kotlinbasicdemo.data.model.EventModelImpl
import com.padcmyanmar.padc9kotlinbasicdemo.workers.GetEventWorker
import java.util.concurrent.TimeUnit

class EventApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        EventModelImpl.initDatabase(applicationContext)
        getEventsOneTime()
        getEventPeriodcally()
        getEventsWhileInDozeMode()
    }

    private fun getEventsOneTime() {
        val getEventsWorkRequest = OneTimeWorkRequest
            .Builder(GetEventWorker::class.java)
            .build()
        WorkManager.getInstance(applicationContext)
            .enqueue(getEventsWorkRequest)
    }

    private fun getEventPeriodcally() {
        val constraints = Constraints
            .Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        val getEventPeriodicallyWorkRewuest= PeriodicWorkRequest
            .Builder(GetEventWorker::class.java,30,TimeUnit.MINUTES)
            .setConstraints(constraints)
            .build()

        //trigger
        WorkManager.getInstance(applicationContext)
            .enqueue(getEventPeriodicallyWorkRewuest)
    }

    private fun getEventsWhileInDozeMode(){
        val constraints : Constraints = Constraints
            .Builder()
            .setRequiresDeviceIdle(true)
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        val getEventWhileInDozeModeWorkRequest: PeriodicWorkRequest = PeriodicWorkRequest
            .Builder(GetEventWorker::class.java,1,TimeUnit.HOURS)
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance(applicationContext)
            .enqueue(getEventWhileInDozeModeWorkRequest)
    }
}