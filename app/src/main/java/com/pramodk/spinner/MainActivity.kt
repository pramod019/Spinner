package com.pramodk.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var spinner2: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        spinner2 = findViewById(R.id.spinner2)

        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this, R.array.city_list, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter
    }
    fun getValues(view: View) {
       Toast.makeText(this, "Spinner 1 " + spinner.selectedItem.toString() +
                "\nSpinner 2 " + spinner2.selectedItem.toString(), Toast.LENGTH_LONG).show()
        //to select where specific options and perform task
        if(spinner.selectedItem == "Dubai" ){
            Toast.makeText(this,"you have selected Dubai",Toast.LENGTH_LONG).show()
        }
        if(spinner.selectedItem == "Hong Kong" ){
            Toast.makeText(this,"you have selected Hong Kong",Toast.LENGTH_LONG).show()
        }
        if(spinner.selectedItem == "Paris" ){
            Toast.makeText(this,"you have selected Paris",Toast.LENGTH_LONG).show()
        }
    }

}