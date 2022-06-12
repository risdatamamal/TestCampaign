package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Self(
    @Expose
    @SerializedName("href")
    val href: String
)