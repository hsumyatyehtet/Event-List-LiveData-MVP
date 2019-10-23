package com.padcmyanmar.padc9kotlinbasicdemo.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents.EventDataAgent
import com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents.RetrofitAgent
import com.padcmyanmar.padc9kotlinbasicdemo.persistence.EventDatabase

abstract class BaseWorker(context: Context,workerParams: WorkerParameters): Worker(context,workerParams)
{
    protected val dataAgent: EventDataAgent= RetrofitAgent

    protected val database: EventDatabase = EventDatabase.getInstance(context)
}