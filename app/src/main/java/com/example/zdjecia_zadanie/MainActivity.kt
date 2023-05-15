package com.example.zdjecia_zadanie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var id=1
        val string1: String = getString(R.string.Zdj1)
        val string2: String = getString(R.string.Zdj2)
        val string3: String = getString(R.string.Zdj3)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)
        findViewById<TextView>(R.id.id_zdjecia).text= string1

        findViewById<Button>(R.id.Button1).setOnClickListener {

            if (id>1){
            id-=1}
            if(id==1){

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)
                findViewById<TextView>(R.id.id_zdjecia).text= string1}

            else if(id==2){

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie2)
                findViewById<TextView>(R.id.id_zdjecia).text= string2}
            else{

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie3)
                findViewById<TextView>(R.id.id_zdjecia).text= string3}
        }

        findViewById<Button>(R.id.Button2).setOnClickListener {

            if (id<3){
                id +=1}
            if(id==1){

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie1)
                findViewById<TextView>(R.id.id_zdjecia).text= string1}
            else if(id==2){

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie2)
                findViewById<TextView>(R.id.id_zdjecia).text= string2
            }
            else{

                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zdjecie3)

                findViewById<TextView>(R.id.id_zdjecia).text= string3}

        }
    }
}