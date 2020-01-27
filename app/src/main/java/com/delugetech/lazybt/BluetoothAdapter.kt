package com.delugetech.lazybt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BluetoothAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<BluetoothAdapter.BluetoothViewHolder>(){

    private val inflater: LayoutInflater  = LayoutInflater.from(context)
  //  private var powers = emptyList()
  val powers: ArrayList<String> = ArrayList()

    inner class BluetoothViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val btTitleView: TextView = itemView.findViewById(R.id.text_view_title)
        val btDescView: TextView = itemView.findViewById(R.id.text_view_description)
        val btPriority: TextView = itemView.findViewById(R.id.text_view_priority)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BluetoothViewHolder {
        val itemView = inflater.inflate(R.layout.item_list, parent, false)
        return  BluetoothViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return powers.size
    }

    override fun onBindViewHolder(holder: BluetoothViewHolder, position: Int) {
        val current = position
        holder.btTitleView.text = current.
    }
}