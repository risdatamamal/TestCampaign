package com.tamam.testcampaign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamam.testcampaign.adapter.ShowsAdapter
import com.tamam.testcampaign.model.ShowResponse
import com.tamam.testcampaign.model.ShowResponseItem
import com.tamam.testcampaign.services.NetworkConfig
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val listshowAdapter = ShowsAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_show.layoutManager = LinearLayoutManager(this@MainActivity)
        rv_show.adapter = listshowAdapter

        getDataListShow()
    }

    private fun getDataListShow() {
        // List Shows
        NetworkConfig.getServiceShowList()
            .getShowsList()
            .enqueue(object : Callback<ShowResponse> {

                // Jika API listshow dapat diterima
                override fun onResponse(
                    call: Call<ShowResponse>,
                    response: Response<ShowResponse>
                ) {
                    if (response.isSuccessful) {
                        viewListShow(response.body()!!)
                        val show = response.body()!!.shows
//                        for (item in show) {
//                            detailShow(item.id)
//                        }
                    } else {
                        Toast.makeText(this@MainActivity, "Response Gagal", Toast.LENGTH_LONG).show()
                    }
                }

                // Jika API listmovie gagal diterima
                override fun onFailure(call: Call<ShowResponse>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Reponse Gagal : $t", Toast.LENGTH_LONG).show()
                }
            })
    }

    fun viewListShow(data: ShowResponse) {
        val show = data.shows
        listshowAdapter.setData(show as List<ShowResponseItem>)
    }

}