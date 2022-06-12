package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Externals(
    @Expose
    @SerializedName("imdb")
    val imdb: String,
    @Expose
    @SerializedName("thetvdb")
    val thetvdb: Int,
    @Expose
    @SerializedName("tvrage")
    val tvrage: Int
)