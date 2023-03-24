package com.example.topic_3

import android.os.Parcel
import android.os.Parcelable


data class DataUser2(val nama: String?, val email:String?, val phone: String?, val address:String?, val age: String?, ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(address)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataUser2> {
        override fun createFromParcel(parcel: Parcel): DataUser2 {
            return DataUser2(parcel)
        }

        override fun newArray(size: Int): Array<DataUser2?> {
            return arrayOfNulls(size)
        }
    }
}