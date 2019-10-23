package com.padcmyanmar.padc9kotlinbasicdemo.data.vo

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class EventOrganizerVO(
    @SerializedName("organizer_name")
    @ColumnInfo(name = "organizer_name")
    var organizerName: String,

    @SerializedName("organizer_photo_url")
    @ColumnInfo(name = "organizer_photo_url")
    var organizerPhotoUrl: String,

    @SerializedName("organizer_role")
    @ColumnInfo(name = "organizer_role")
    var organizerRole: String
)