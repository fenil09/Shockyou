package com.shocker.shockyou

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.photo_picker,menu)
        return super.onCreateOptionsMenu(menu)
        //this method is basically used to show the menu on our activity on which the user would be interacting.
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.item1){
            Toast.makeText(this,"shockyou will surely shockyou",Toast.LENGTH_LONG).show()
        }


        return super.onOptionsItemSelected(item)

        //this method is used to handle the onclick on the menu items here we just match the id of the item clicked and when it matches
        //we perform the desired action.
    }


}