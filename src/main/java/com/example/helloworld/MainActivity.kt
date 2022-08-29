package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//the kotlin file is where we are going to be handling the user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // show the layout file : activity_main
        setContentView(R.layout.activity_main)
        // Display  customized to show " hello from {name}"
        //user can tap a button to change the text color of the label.
        //1.add a button to our layout
        findViewById<Button>(R.id.button).setOnClickListener {
        // handle button tap
            //2. set up a logic to know whe a user has tapped on a button
        Log.i("tekeste", "tapped on button")
            // 1.get a reference to the text view
            //2.set the text view
    }

        // 3.change the color of the text
        findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_700))
    }
}