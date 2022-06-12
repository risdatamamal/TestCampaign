package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Links(
    @Expose
    @SerializedName("nextepisode")
    val nextepisode: List<Nextepisode>,
    @Expose
    @SerializedName("previousepisode")
    val previousepisode: List<Previousepisode>,
    @Expose
    @SerializedName("self")
    val self: List<Self>
)