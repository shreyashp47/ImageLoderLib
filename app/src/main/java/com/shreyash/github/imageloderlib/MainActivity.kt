package com.shreyash.github.imageloderlib

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.facebook.drawee.drawable.ProgressBarDrawable
import com.facebook.drawee.view.SimpleDraweeView
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imageview = findViewById<ImageView>(R.id.image) //imageview
        loadImageUsingGlide(imageview)
        var imageViewPicasso = findViewById<ImageView>(R.id.imageViewPicasso) //imageview
        loadImageUsingPicasso(imageViewPicasso)
        var fresco = findViewById<SimpleDraweeView>(R.id.my_image_view) //Fresco
        loadImageUsingFresco(fresco)
    }

    val imageUrl =
        "https://images.pexels.com/photos/1640774/pexels-photo-1640774.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"

    fun loadImageUsingGlide(imageView: ImageView) {
        Glide.with(this)
            .load(imageUrl)
            .into(imageView)
    }

    fun loadImageUsingPicasso(imageView: ImageView) {
        Picasso.get()
            .load(imageUrl)
            .priority(Picasso.Priority.HIGH)
            .into(imageView)

    }

    fun loadImageUsingFresco(imageView: SimpleDraweeView) {
        val imageUri = Uri.parse(imageUrl)
        imageView.setImageURI(imageUri)
    }
}