package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Image(
    @Expose
    @SerializedName("medium")
    val medium: String,
    @Expose
    @SerializedName("original")
    val original: String
)