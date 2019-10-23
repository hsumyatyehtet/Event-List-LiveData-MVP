package com.padcmyanmar.padc9kotlinbasicdemo.data.vo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user")
data class UserVo(

    @PrimaryKey
    @ColumnInfo(name = "user_id_pk")
    var userIdPK: Int,

    @SerializedName("user_name")
    @ColumnInfo(name = "user_name")
    var userName: String,

    @SerializedName("email")
    @ColumnInfo(name = "email")
    var email: String,

    @SerializedName("phone_number")
    @ColumnInfo(name = "phone_number")
    var phoneNumber: String,

    @SerializedName("photo_url")
    @ColumnInfo(name = "photo_url")
    var phoutUrl: String,

    @SerializedName("cover_url")
    @ColumnInfo(name = "cover_url")
    var coverUrl: String,

    @SerializedName("address")
    @ColumnInfo(name = "address")
    var address: String,

    var eventId: Int
)