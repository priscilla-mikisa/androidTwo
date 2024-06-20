package com.akirachix.recycleviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class FibonacciSeriesAdapter(var fibonacciList: List<Int>):RecyclerView.Adapter<FibonacciViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_series, parent, false)
        return FibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        holder.tvNumber.text = fibonacciList[position].toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}






class FibonacciViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}