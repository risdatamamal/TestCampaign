package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Previousepisode(
    @Expose
    @SerializedName("href")
    val href: String
)