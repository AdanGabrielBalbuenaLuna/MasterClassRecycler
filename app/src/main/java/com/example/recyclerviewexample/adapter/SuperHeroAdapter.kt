package com.example.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero
                                                                    //lambda function
class SuperHeroAdapter(private val superHeroList:List<SuperHero>, private val onClickListen:(SuperHero) -> Unit) : RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflador = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflador.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item, onClickListen)
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }
}