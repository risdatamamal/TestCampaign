package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Rating(
    @Expose
    @SerializedName("average")
    val average: Double
)