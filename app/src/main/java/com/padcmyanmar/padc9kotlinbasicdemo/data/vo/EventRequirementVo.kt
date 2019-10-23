package com.padcmyanmar.padc9kotlinbasicdemo.data.vo

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName


data class EventRequirementVo(
    @SerializedName("gender")
    @ColumnInfo(name = "gender")
    var gender: Int,

    @SerializedName("age_range")
    @ColumnInfo(name = "age_range")
    var ageRange: String,

    @SerializedName("privacy")
    @ColumnInfo(name = "privacy")
    var privacy: String,

    @SerializedName("max_people_available")
    @ColumnInfo(name = "max_people_available")
    var maxPeopleAvailable: Int
)