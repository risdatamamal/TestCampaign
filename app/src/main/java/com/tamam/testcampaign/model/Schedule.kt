package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Schedule(
    @Expose
    @SerializedName("days")
    val days: List<String>,
    @Expose
    @SerializedName("time")
    val time: String
)