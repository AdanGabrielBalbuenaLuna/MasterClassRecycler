package com.example.recyclerviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListen:(SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superHeroName
        binding.tvRealName.text = superHeroModel.realName
        binding.tvRealName.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        //Listener on List Item
        itemView.setOnClickListener {
            onClickListen(superHeroModel)
        }
    }
}