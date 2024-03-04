package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.myapplication.adapter.ProductAdapter
import com.example.myapplication.databinding.HomeLayoutBinding
import com.example.myapplication.model.Product

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: HomeLayoutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var productList = arrayListOf(
            Product("@drawable/icecream", "Ice Cream", "$5"),
            Product("@drawable/lemonade", "Lemonade", "$5"),
            Product("@drawable/milkshake", "Milkshake", "$10"),
            Product("@drawable/coffee", "Coffee", "$5"),
            Product("@drawable/tea", "Tea", "$5"),

            )

        binding = HomeLayoutBinding.inflate(layoutInflater)


        setContentView(binding.root)

        val adapter = ProductAdapter(this, productList)
        val productListView : ListView = findViewById(R.id.list_item)
        productListView.adapter = adapter
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}