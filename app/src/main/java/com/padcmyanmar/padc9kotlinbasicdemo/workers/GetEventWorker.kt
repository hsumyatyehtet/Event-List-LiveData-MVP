package com.padcmyanmar.padc9kotlinbasicdemo.workers

import android.content.Context
import androidx.work.WorkerParameters
import com.padcmyanmar.padc9kotlinbasicdemo.network.dataagents.RetrofitAgent
import com.padcmyanmar.padc9kotlinbasicdemo.utils.DUMMY_ACCESS_TOKEN

class GetEventWorker(context: Context, workerParams: WorkerParameters) : BaseWorker(context, workerParams) {
    override fun doWork(): Result {
        var result: Result = Result.failure()
        RetrofitAgent.getEvents(
            DUMMY_ACCESS_TOKEN,
            onSuccess = {
                database.eventDao().insertEvents(it)
                result = Result.success()
            },
            onFailure = {
                result = Result.failure()
            })
        return result
    }
}