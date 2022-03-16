package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {

    //var sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
    //val SETINGS_CODE = 234

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setThemeOfApp()

        val aKapon_btn = findViewById<Button>(R.id.aKapon_btn)
        val deKapon_btn = findViewById<Button>(R.id.deKapon_btn)



        aKapon_btn.setOnClickListener() {
            val nxt_activity = Intent(this@MainActivity, aKapon_activity::class.java)
            startActivity(nxt_activity)

        }
        deKapon_btn.setOnClickListener() {
            val nxt_activity = Intent(this@MainActivity, deKapon_activity::class.java)
            startActivity(nxt_activity)

        }
    }

/*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == SETINGS_CODE)
        {
            this.recreate()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.settings)
        {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)

            startActivityForResult(intent, SETINGS_CODE)
        }

        return super.onOptionsItemSelected(item)
    }
    private fun setThemeOfApp()
    {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)

        if(sharedPreferences.getString("color_option", "AZUL").equals("AZUL"))
        {
            setTheme(R.style.RedTheme)
        }
        else
        {
            setTheme(R.style.BlueTheme)
        }
    }*/

}