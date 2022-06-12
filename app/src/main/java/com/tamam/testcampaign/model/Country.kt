package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Country(
    @Expose
    @SerializedName("code")
    val code: String,
    @Expose
    @SerializedName("name")
    val name: String,
    @Expose
    @SerializedName("timezone")
    val timezone: String
)