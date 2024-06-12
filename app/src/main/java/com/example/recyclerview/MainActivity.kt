package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val courseRV = findViewById<RecyclerView>(R.id.idRVCourse)

        // Here, we have created new array list and added data to it
        val courseModelArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()
        courseModelArrayList.add(CourseModel("DSA in Java", 4, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("Java Course", 3, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("C++ Course", 4, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("DSA in C++", 4, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("Kotlin for Android", 4, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("Java for Android", 4, R.drawable.ic_star_foreground))
        courseModelArrayList.add(CourseModel("HTML and CSS", 4, R.drawable.ic_star_foreground))

        // we are initializing our adapter class and passing our arraylist to it.
        val courseAdapter = CourseAdapter(this, courseModelArrayList)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.layoutManager = linearLayoutManager
        courseRV.adapter = courseAdapter

    }
}