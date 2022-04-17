package com.ilham.recyclerviewkotlinuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val laptopList = listOf<Laptop>(
            Laptop(
                R.drawable.asus,
                "Laptop Asus",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb "
            ),
            Laptop(
                R.drawable.macbook,
                "Laptop Macbook",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.hp,
                "Laptop HP",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.msi,
                "Laptop MSI",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.rog,
                "Laptop ROG",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.dell,
                "Laptop Dell",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.lenovo,
                "Laptop Lenovo",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(R.drawable.samsung,
                "Laptop Samsung",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.toshiba,
                "Laptop Toshiba",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            ),
            Laptop(
                R.drawable.acer,
                "Laptop Acer",
                "Spesifikasi: Processor AMD SSD 1TB Backlight Keyboard RAM 8 Gb"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_laptop)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LaptopAdapter(this, laptopList){
            val intent = Intent(this, DetailLaptopActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}