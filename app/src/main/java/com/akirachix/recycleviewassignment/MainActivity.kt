package com.akirachix.recycleviewassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.recycleviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val fibonacci = fibonacci()
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val numberAdapter = FibonacciSeriesAdapter(fibonacci())
        binding.rvNumbers.adapter = numberAdapter
    }
    fun fibonacci(): List<Int>{
        var current = 0
        var recurring = 1
        var accumulator = 0
        var fibonacciList = mutableListOf<Int>()

        while(accumulator < 100){

            fibonacciList.add(accumulator)
            current  = recurring
            recurring = accumulator

            accumulator = current + recurring


        }

        return fibonacciList

    }

}