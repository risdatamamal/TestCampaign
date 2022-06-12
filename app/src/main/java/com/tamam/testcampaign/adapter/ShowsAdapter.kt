package com.tamam.testcampaign.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tamam.testcampaign.R
import com.tamam.testcampaign.model.ShowResponseItem

class ShowsAdapter(private val listShows: ArrayList<ShowResponseItem>) : RecyclerView.Adapter<ShowsAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name_shows: TextView = itemView.findViewById(R.id.tv_item_name)
        val summary_shows: TextView = itemView.findViewById(R.id.tv_item_summary)
        val rating_shows: TextView = itemView.findViewById(R.id.tv_item_rating)
        val image_path_shows: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row_show, parent, false)
        return ListViewHolder(v)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dataShows = listShows[position]

//        Glide.with(holder.itemView).load(dataShows.image).apply(RequestOptions().override(55, 55)).into(holder.image_path_shows)
        holder.name_shows.text = dataShows.name
        holder.summary_shows.text = dataShows.summary
//        holder.rating_shows.text = dataShows.rating.toString()
//        holder.itemView.setOnClickListener {
//            val intent = Intent(holder.itemView.context, ShowDetailActivity::class.java)
//            intent.putExtra("id", dataShows.id.toString())
//            holder.itemView.context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int = listShows.size

    fun setData(data: List<ShowResponseItem>) {
        listShows.clear()
        listShows.addAll(data)
        notifyDataSetChanged()
    }
}