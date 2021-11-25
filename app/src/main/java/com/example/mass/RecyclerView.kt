package com.example.mass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mass.Adapter.MyAdapter


class RecyclerView : AppCompatActivity() {
    private lateinit var namesList : androidx.recyclerview.widget.RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val collegeObjects= mutableListOf<College>()
        collegeObjects.add(College(title = "Anubhav1",description = "BIET"))
        collegeObjects.add(College(title = "Anubhav2",description = "MNIT"))
        collegeObjects.add(College(title = "Anubhav3",description = "KNIT"))
        collegeObjects.add(College(title = "Anubhav4",description = "VNIT"))
        collegeObjects.add(College(title = "Anubhav5",description = "MNNIT"))
        collegeObjects.add(College(title = "Anubhav6",description = "SNIT"))
        collegeObjects.add(College(title = "Anubhav7",description = "BIET"))
        collegeObjects.add(College(title = "Anubhav8",description = "AAS"))
        collegeObjects.add(College(title = "Anubhav9",description = "UUT"))
        collegeObjects.add(College(title = "Anubhav",description = "Biet"))
        namesList=findViewById<RecyclerView>(R.id.namesList)
        namesList.adapter= MyAdapter(collegeObjects)
        namesList.layoutManager=LinearLayoutManager(this)
    }
}