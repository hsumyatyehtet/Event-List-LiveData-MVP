package com.padcmyanmar.padc9kotlinbasicdemo.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padc9kotlinbasicdemo.data.vo.UserVo

class UserListTypeConverter {

    @TypeConverter
    fun toString(list: List<UserVo>): String {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String): List<UserVo> {
        val typeToken = object : TypeToken<List<UserVo>>() {

        }.type
        return Gson().fromJson(json, typeToken)
    }
}