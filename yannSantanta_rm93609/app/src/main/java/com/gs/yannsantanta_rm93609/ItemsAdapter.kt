package com.gs.yannsantanta_rm93609

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val items: MutableList<ItemModel>) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val beachName: TextView = itemView.findViewById(R.id.text_beach_name)
        val deleteButton: Button = itemView.findViewById(R.id.button_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.beachlayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.beachName.text = currentItem.name
        holder.deleteButton.setOnClickListener {
            removeItem(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addItem(item: ItemModel) {
        items.add(item)
        notifyDataSetChanged()
    }

    fun removeItem(item: ItemModel) {
        val position = items.indexOfFirst { it == item }
        if (position != -1) {
            items.removeAt(position)
            notifyItemRemoved(position)
        }
    }
}
