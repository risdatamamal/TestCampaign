package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ShowResponse (
    @Expose
    @SerializedName("")
    val shows: List<ShowResponseItem>
)