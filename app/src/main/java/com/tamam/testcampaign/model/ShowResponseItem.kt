package com.tamam.testcampaign.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ShowResponseItem(
    @Expose
    @SerializedName("_links")
    val _links: List<Links>,
    @Expose
    @SerializedName("averageRuntime")
    val averageRuntime: Int,
    @Expose
    @SerializedName("dvdCountry")
    val dvdCountry: List<DvdCountry>,
    @Expose
    @SerializedName("ended")
    val ended: String,
    @Expose
    @SerializedName("externals")
    val externals: List<Externals>,
    @Expose
    @SerializedName("genres")
    val genres: List<String>,
    @Expose
    @SerializedName("id")
    val id: Int,
    @Expose
    @SerializedName("image")
    val image: List<Image>,
    @Expose
    @SerializedName("language")
    val language: String,
    @Expose
    @SerializedName("name")
    val name: String,
    @Expose
    @SerializedName("network")
    val network: List<Network>,
    @Expose
    @SerializedName("officialSite")
    val officialSite: String,
    @Expose
    @SerializedName("premiered")
    val premiered: String,
    @Expose
    @SerializedName("rating")
    val rating: List<Rating>,
    @Expose
    @SerializedName("runtime")
    val runtime: Int,
    @Expose
    @SerializedName("schedule")
    val schedule: List<Schedule>,
    @Expose
    @SerializedName("status")
    val status: String,
    @Expose
    @SerializedName("summary")
    val summary: String,
    @Expose
    @SerializedName("type")
    val type: String,
    @Expose
    @SerializedName("updated")
    val updated: Int,
    @Expose
    @SerializedName("url")
    val url: String,
    @Expose
    @SerializedName("webChannel")
    val webChannel: List<WebChannel>,
    @Expose
    @SerializedName("weight")
    val weight: Int
)