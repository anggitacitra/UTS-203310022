package com.anggitacitra.beritautdi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anggitacitra.beritautdi.R
import com.anggitacitra.beritautdi.model.Affirmation
//membuat class dengan nama adapter yang memanggil recycleview dan memanggil list pada class affirmation
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//memanggil image dari drawble untuk ditampilkan pada item_image di recycle view dan memberikan title
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
//memanggil recycle view baru yang didalamnya memiliki isian item_list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size
}