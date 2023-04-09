package com.example.makanankhasjawa

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Makanankhasjawa(
    val imgMakanankhasjawa: Int,
    val nameMakanankhasjawa: String,
    val descMakanankhasjawa: String

) : Parcelable
