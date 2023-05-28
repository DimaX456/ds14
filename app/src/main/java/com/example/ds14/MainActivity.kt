package com.example.ds14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ds14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var nameList = ArrayList<String>()

        nameList.add("1")
        nameList.add("2")
        nameList.add("3")
        nameList.add("4")
        nameList.add("5")
        nameList.add("6")
        nameList.add("7")
        nameList.add("8")
        nameList.add("9")
        nameList.add("10")
        nameList.add("11")
        nameList.add("12")
        nameList.add("13")
        nameList.add("14")
        nameList.add("15")
        nameList.add("16")
        nameList.add("17")
        nameList.add("18")
        nameList.add("19")
        nameList.add("20")
        nameList.add("21")
        nameList.add("22")
        nameList.add("23")
        nameList.add("24")
        nameList.add("25")
        nameList.add("26")
        nameList.add("27")
        nameList.add("28")
        nameList.add("29")
        nameList.add("30")

        var positionList = ArrayList<String>()
        positionList.add("2")
        positionList.add("4")
        positionList.add("6")
        positionList.add("8")
        positionList.add("10")
        positionList.add("12")
        positionList.add("14")
        positionList.add("16")
        positionList.add("18")
        positionList.add("20")
        positionList.add("22")
        positionList.add("24")
        positionList.add("26")
        positionList.add("28")
        positionList.add("30")
        positionList.add("32")
        positionList.add("34")
        positionList.add("36")
        positionList.add("38")
        positionList.add("40")
        positionList.add("42")
        positionList.add("44")
        positionList.add("46")
        positionList.add("48")
        positionList.add("50")
        positionList.add("52")
        positionList.add("54")
        positionList.add("56")
        positionList.add("58")
        positionList.add("60")

        val myAdapter = ArrayAdapter( this, android.R.layout.simple_list_item_1, positionList)
        binding.listView.adapter = myAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Элемент\n${nameList[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}