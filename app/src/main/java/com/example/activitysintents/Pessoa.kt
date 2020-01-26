package com.example.activitysintents

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pessoa(var nome: String, var idade: Int) : Parcelable {
}