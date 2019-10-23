package com.padcmyanmar.padc9kotlinbasicdemo.persistence

import android.content.Context
import androidx.room.*
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.UserVo
import com.padcmyanmar.padc9kotlinbasicdemo.persistence.dao.EventDao
import com.padcmyanmar.padc9kotlinbasicdemo.persistence.typeconverters.UserListTypeConverter
import com.padcmyanmar.padc9kotlinbasicdemo.utils.EVENT_DB

@Database(entities = [EventVo::class], version = 1, exportSchema = false)
@TypeConverters(UserListTypeConverter::class)
abstract class EventDatabase : RoomDatabase() {

    abstract fun eventDao(): EventDao

    companion object {
        private var instance: EventDatabase? = null

        fun getInstance(context: Context): EventDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, EventDatabase::class.java, EVENT_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }

            val db= instance!!

            return db
        }
    }

}