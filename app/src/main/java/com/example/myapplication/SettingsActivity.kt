package com.example.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import java.security.Key


abstract class SettingsActivity : AppCompatActivity(), SharedPreferences.OnSharedPreferenceChangeListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        PreferenceManager.getDefaultSharedPreferences(baseContext).registerOnSharedPreferenceChangeListener(this)
        setThemeOfApp()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.settings, SettingsFragment())
                    .commit()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    fun SharedPreferences(sharedPreferences: SharedPreferences, Key: String){
        if(Key == "color_options")
            this.recreate()
    }


    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }

    private fun setThemeOfApp()
    {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)

        if(sharedPreferences.getString("color_option", "AZUL").equals("AZUL"))
        {
            setTheme(R.style.RedTheme)
        }
        else
        {
            setTheme(R.style.BlueTheme)
        }
    }

    // -------------- Proves

}