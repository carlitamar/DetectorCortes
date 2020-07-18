package com.example.diego.DetectorCortes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val uid: String, val username: String):Parcelable{
    constructor() : this("","")
}