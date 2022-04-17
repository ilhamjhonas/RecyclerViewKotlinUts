package com.ilham.recyclerviewkotlinuts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Laptop(
    val imgLaptop: Int,
    val nameLaptop: String,
    val descLaptop: String
) : Parcelable
