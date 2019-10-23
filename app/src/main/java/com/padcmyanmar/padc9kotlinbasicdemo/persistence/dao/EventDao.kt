package com.padcmyanmar.padc9kotlinbasicdemo.persistence.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.EventVo

@Dao
abstract class EventDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertEvents(events: List<EventVo>): LongArray

    @Query("SELECT * FROM events")
    abstract fun getAllEvent(): LiveData<List<EventVo>>

    @Query("SELECT * FROM events WHERE id = :id")
    abstract fun getEventById(id: Int): LiveData<EventVo>

}