package com.example.makanankhasjawa

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakanankhasjawaAdapter (private val context:Context, private val makanankhasjawa:List<Makanankhasjawa>, val listener:(Makanankhasjawa) -> Unit)
    : RecyclerView.Adapter<MakanankhasjawaAdapter.MakanankhasjawaViewHolder>(){

    class MakanankhasjawaViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgMakanankhasjawa = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMakanankhasjawa = view.findViewById<TextView>(R.id.tv_item_name)
        val descMakanankhasjawa = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(makanankhasjawa: Makanankhasjawa, listener: (Makanankhasjawa) -> Unit){
            imgMakanankhasjawa.setImageResource(makanankhasjawa.imgMakanankhasjawa)
            nameMakanankhasjawa.text = makanankhasjawa.nameMakanankhasjawa
            descMakanankhasjawa.text = makanankhasjawa.descMakanankhasjawa
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakanankhasjawaViewHolder {
        return MakanankhasjawaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makananjawa, parent, false)
        )
    }

    
    override fun onBindViewHolder(holder: MakanankhasjawaViewHolder, position: Int) {
        holder.bindview(makanankhasjawa[position], listener)
    }

    override fun getItemCount(): Int = makanankhasjawa.size

}