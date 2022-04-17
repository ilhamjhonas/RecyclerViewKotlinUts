package com.ilham.recyclerviewkotlinuts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LaptopAdapter(private val context: Context, private val laptop: List<Laptop>, val listener: (Laptop) -> Unit)
    : RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder>(){


    class LaptopViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgLaptop = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameLaptop = view.findViewById<TextView>(R.id.tv_item_name)
        val descLaptop = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(laptop: Laptop, listener: (Laptop) -> Unit){
            imgLaptop.setImageResource(laptop.imgLaptop)
            nameLaptop.text = laptop.nameLaptop
            descLaptop.text = laptop.descLaptop
            itemView.setOnClickListener{
                listener(laptop)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopViewHolder {
        return LaptopViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_laptop, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LaptopViewHolder, position: Int) {
        holder.bindView(laptop[position], listener)
    }

    override fun getItemCount(): Int = laptop.size

    }

