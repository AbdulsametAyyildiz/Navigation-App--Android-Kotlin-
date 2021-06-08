package com.kalemlisipahi.navgapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bD = arrayOf(1,2,5,10)
        val iD = arrayOf(20,10,40,30)
        val dizi = arrayOf(bD,iD)
        println(dizi[0][2])

        val st = "ornek"
        val nst = st.capitalize()
        println(nst)
    }
}