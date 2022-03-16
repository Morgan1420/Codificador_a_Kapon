package com.example.myapplication

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class aKapon_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akapon)

        val text1 = findViewById<TextView>(R.id.text1)
        val button1 = findViewById<Button>(R.id.Button1)
        val copy_btn = findViewById<Button>(R.id.copy_btn)
        val home_btn = findViewById<Button>(R.id.home_btn)

        text1.visibility = View.INVISIBLE
        button1.setOnClickListener(){

            val inputText = findViewById<EditText>(R.id.editText1).text
            val dim = inputText.length
            var i = dim - 1
            var str = ""
            var a = ""
            text1.text = ""

            while(i >= 0){
                if(inputText.get(i).isLetter()){
                    if (inputText.get(i).isLowerCase()){
                        if(inputText.get(i) == 'a'){
                            str = text1.text.toString()
                            text1.text = "i$str"
                        }
                        else if(inputText.get(i) == 'b'){
                            str = text1.text.toString()
                            text1.text = "h$str"
                        }
                        else if(inputText.get(i) == 'c'){
                            str = text1.text.toString()
                            text1.text = "k$str"
                        }
                        else if(inputText.get(i) == 'd'){
                            str = text1.text.toString()
                            text1.text = "b$str"
                        }
                        else if(inputText.get(i) == 'e'){
                            str = text1.text.toString()
                            text1.text = "æ$str"
                        }
                        else if(inputText.get(i) == 'f'){
                            str = text1.text.toString()
                            text1.text = "j$str"
                        }
                        else if(inputText.get(i) == 'g'){
                            str = text1.text.toString()
                            text1.text = "p$str"
                        }
                        else if(inputText.get(i) == 'h'){
                            str = text1.text.toString()
                            text1.text = "z$str"
                        }
                        else if(inputText.get(i) == 'i'){
                            str = text1.text.toString()
                            text1.text = "ø$str"
                        }
                        else if(inputText.get(i) == 'j'){
                            str = text1.text.toString()
                            text1.text = "f$str"
                        }
                        else if(inputText.get(i) == 'k'){
                            str = text1.text.toString()
                            text1.text = "c$str"
                        }
                        else if(inputText.get(i) == 'l'){
                            str = text1.text.toString()
                            text1.text = "!$str"
                        }
                        else if(inputText.get(i) == 'm'){
                            str = text1.text.toString()
                            text1.text = "ш$str"
                        }
                        else if(inputText.get(i) == 'n'){
                            str = text1.text.toString()
                            text1.text = "ñ$str"
                        }
                        else if(inputText.get(i) == 'o'){
                            str = text1.text.toString()
                            text1.text = "œ$str"
                        }
                        else if(inputText.get(i) == 'p'){
                            str = text1.text.toString()
                            text1.text = "t$str"
                        }
                        else if(inputText.get(i) == 'q'){
                            str = text1.text.toString()
                            text1.text = "v$str"
                        }
                        else if(inputText.get(i) == 'r'){
                            str = text1.text.toString()
                            text1.text = "x$str"
                        }
                        else if(inputText.get(i) == 's'){
                            str = text1.text.toString()
                            text1.text = "m$str"
                        }
                        else if(inputText.get(i) == 't'){
                            str = text1.text.toString()
                            text1.text = "y$str"
                        }
                        else if(inputText.get(i) == 'u'){
                            str = text1.text.toString()
                            text1.text = "ə$str"
                        }
                        else if(inputText.get(i) == 'v'){
                            str = text1.text.toString()
                            text1.text = "r$str"
                        }
                        else if(inputText.get(i) == 'w'){
                            str = text1.text.toString()
                            text1.text = "ç$str"
                        }
                        else if(inputText.get(i) == 'x'){
                            str = text1.text.toString()
                            text1.text = "+$str"
                        }
                        else if(inputText.get(i) == 'y'){
                            str = text1.text.toString()
                            text1.text = "¥$str"
                        }
                        else if(inputText.get(i) == 'z'){
                            str = text1.text.toString()
                            text1.text = "£$str"
                        }
                        else{
                            str = text1.text.toString()
                            a = inputText.get(i).toString()
                            text1.text = "$a$str"
                        }
                    }
                    else{
                        if(inputText.get(i) == 'A'){
                            str = text1.text.toString()
                            text1.text = "I$str"
                        }
                        else if(inputText.get(i) == 'B'){
                            str = text1.text.toString()
                            text1.text = "H$str"
                        }
                        else if(inputText.get(i) == 'C'){
                            str = text1.text.toString()
                            text1.text = "K$str"
                        }
                        else if(inputText.get(i) == 'D'){
                            str = text1.text.toString()
                            text1.text = "B$str"
                        }
                        else if(inputText.get(i) == 'E'){
                            str = text1.text.toString()
                            text1.text = "Æ$str"
                        }
                        else if(inputText.get(i) == 'F'){
                            str = text1.text.toString()
                            text1.text = "J$str"
                        }
                        else if(inputText.get(i) == 'G'){
                            str = text1.text.toString()
                            text1.text = "P$str"
                        }
                        else if(inputText.get(i) == 'H'){
                            str = text1.text.toString()
                            text1.text = "Z$str"
                        }
                        else if(inputText.get(i) == 'I'){
                            str = text1.text.toString()
                            text1.text = "Ø$str"
                        }
                        else if(inputText.get(i) == 'J'){
                            str = text1.text.toString()
                            text1.text = "F$str"
                        }
                        else if(inputText.get(i) == 'K'){
                            str = text1.text.toString()
                            text1.text = "C$str"
                        }
                        else if(inputText.get(i) == 'L'){
                            str = text1.text.toString()
                            text1.text = "!$str"
                        }
                        else if(inputText.get(i) == 'M'){
                            str = text1.text.toString()
                            text1.text = "Ш$str"
                        }
                        else if(inputText.get(i) == 'N'){
                            str = text1.text.toString()
                            text1.text = "Ñ$str"
                        }
                        else if(inputText.get(i) == 'O'){
                            str = text1.text.toString()
                            text1.text = "Œ$str"
                        }
                        else if(inputText.get(i) == 'P'){
                            str = text1.text.toString()
                            text1.text = "T$str"
                        }
                        else if(inputText.get(i) == 'Q'){
                            str = text1.text.toString()
                            text1.text = "V$str"
                        }
                        else if(inputText.get(i) == 'R'){
                            str = text1.text.toString()
                            text1.text = "X$str"
                        }
                        else if(inputText.get(i) == 'S'){
                            str = text1.text.toString()
                            text1.text = "M$str"
                        }
                        else if(inputText.get(i) == 'T'){
                            str = text1.text.toString()
                            text1.text = "Y$str"
                        }
                        else if(inputText.get(i) == 'U'){
                            str = text1.text.toString()
                            text1.text = "Ə$str"
                        }
                        else if(inputText.get(i) == 'V'){
                            str = text1.text.toString()
                            text1.text = "R$str"
                        }
                        else if(inputText.get(i) == 'W'){
                            str = text1.text.toString()
                            text1.text = "Ç$str"
                        }
                        else if(inputText.get(i) == 'X'){
                            str = text1.text.toString()
                            text1.text = "+$str"
                        }
                        else if(inputText.get(i) == 'Y'){
                            str = text1.text.toString()
                            text1.text = "¥$str"
                        }
                        else if(inputText.get(i) == 'Z'){
                            str = text1.text.toString()
                            text1.text = "£$str"
                        }
                        else{
                            str = text1.text.toString()
                            a = inputText.get(i).toString()
                            text1.text = "$a$str"
                        }
                    }
                }
                else{
                    str = text1.text.toString()
                    a = inputText.get(i).toString()
                    text1.text = "$a$str"
                }
                i--
            }

            text1.visibility = View.VISIBLE
        }

        copy_btn.setOnClickListener() {

            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("EditText", text1.text.toString())

            clipboard.setPrimaryClip(clip)

            Toast.makeText(this,"Text Copyed", Toast.LENGTH_SHORT).show()

        }

        home_btn.setOnClickListener() {
            val nxt_activity = Intent(this@aKapon_activity, MainActivity::class.java)
            startActivity(nxt_activity)

        }
    }
}

