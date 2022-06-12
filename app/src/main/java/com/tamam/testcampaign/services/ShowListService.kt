package com.tamam.testcampaign.services

import com.tamam.testcampaign.model.ShowResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface ShowListService {
    @GET("shows")
    fun getShowsList(): Call<List<ShowResponseItem>>
}