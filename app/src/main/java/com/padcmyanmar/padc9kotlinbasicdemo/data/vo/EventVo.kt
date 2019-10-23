package com.padcmyanmar.padc9kotlinbasicdemo.data.vo

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "events")
data class EventVo(

    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    var id: Int,

    @SerializedName("event_name")
    @ColumnInfo(name = "event_name")
    var eventName: String,

    @SerializedName("event_start_time")
    @ColumnInfo(name = "event_start_time")
    var eventStartTime: String,

    @SerializedName("event_location_name")
    @ColumnInfo(name = "event_location_name")
    var eventLocationName: String,

    @SerializedName("event_location_full_address")
    @ColumnInfo(name = "event_location_full_address")
    var eventLocationFullAddress: String,

    @SerializedName("event_organizer")
    @Embedded(prefix = "event_organizer_")
    var eventOrganizerVO: EventOrganizerVO,

    @SerializedName("schedule_status")
    @ColumnInfo(name = "schedule_status")
    var scheduleStatus: Int,

    @SerializedName("event_type")
    @ColumnInfo(name = "event_type")
    var eventType: Int,

    @SerializedName("event_requirements")
    @Embedded(prefix = "event_requirements_")
    var eventRequirementVo: EventRequirementVo,

    @SerializedName("interested_user")
    var interestUser: List<UserVo>,

    @SerializedName("going_user")
    var onGoingUser: List<UserVo>

)