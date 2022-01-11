package com.mirkamol.recyclerview7.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mirkamol.recyclerview7.R
import com.mirkamol.recyclerview7.model.Member

class CustomAdapter(val members: List<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    inner class CustomAdapter(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
        val tv_phoneNumber = itemView.findViewById<TextView>(R.id.tv_phoneNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout, parent, false)

        return CustomAdapter(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)

        if (holder is CustomAdapter){
            holder.tv_name.setText(member.name)
            holder.tv_phoneNumber.setText(member.phoneNumber)
        }
    }

    override fun getItemCount(): Int {
      return members.size
    }
}