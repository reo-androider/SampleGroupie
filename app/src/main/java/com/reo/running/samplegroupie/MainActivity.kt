package com.reo.running.samplegroupie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reo.running.samplegroupie.databinding.ActivityMainBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindig = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindig.root)

        val groupAdapter = GroupAdapter<ViewHolder>()
        bindig.recyclerView.adapter = groupAdapter

        val itemList: List<String> = listOf(
            "get up early",
            "dentifrice",
            "run",
            "morning shower",
            "squat",
            "chew thoroughly",
            "stretch",
            "cleaning",
            "reading a book",
            "look with business eye",
            "abstinence from alcohol",
            "not smoking",
            "take notes",
            "yogurt",
            "natto",
            "kimchi",
            "open a window"
        )

        for (i in itemList) {
            groupAdapter.add(Item(i))
        }
    }
}
