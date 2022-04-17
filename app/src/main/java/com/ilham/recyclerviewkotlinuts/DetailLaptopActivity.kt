package com.ilham.recyclerviewkotlinuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailLaptopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_laptop)

        val laptop = intent.getParcelableExtra<Laptop>(MainActivity.INTENT_PARCELABLE)

        val imgLaptop = findViewById<ImageView>(R.id.img_item_photo)
        val nameLaptop = findViewById<TextView>(R.id.tv_item_name)
        val descLaptop = findViewById<TextView>(R.id.tv_item_description)

        imgLaptop.setImageResource(laptop?.imgLaptop!!)
        nameLaptop.text = laptop.nameLaptop
        descLaptop.text = laptop.descLaptop
    }
}