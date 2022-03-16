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

class deKapon_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_de_kapon)

        val text1 = findViewById<TextView>(R.id.text1)
        val button1 = findViewById<Button>(R.id.Button1)
        val copy_btn = findViewById<Button>(R.id.copy_btn)
        val home_btn = findViewById<Button>(R.id.home_btn)

        button1.setOnClickListener() {

            val inputText = findViewById<EditText>(R.id.editText1).text
            val dim = inputText.length
            var i = dim - 1
            var str = ""
            var a = ""
            text1.text = ""

            while(i >= 0){
                if (inputText.get(i).isLetter()) {
                    if (inputText.get(i).isLowerCase()) {
                        if (inputText.get(i) == 'i') {
                            str = text1.text.toString()
                            text1.text = "a$str"
                        }
                        else if (inputText.get(i) == 'h') {
                            str = text1.text.toString()
                            text1.text = "b$str"
                        } else if (inputText.get(i) == 'k') {
                            str = text1.text.toString()
                            text1.text = "c$str"
                        } else if (inputText.get(i) == 'b') {
                            str = text1.text.toString()
                            text1.text = "d$str"
                        } else if (inputText.get(i) == 'æ') {
                            str = text1.text.toString()
                            text1.text = "e$str"
                        } else if (inputText.get(i) == 'j') {
                            str = text1.text.toString()
                            text1.text = "f$str"
                        } else if (inputText.get(i) == 'p') {
                            str = text1.text.toString()
                            text1.text = "g$str"
                        } else if (inputText.get(i) == 'z') {
                            str = text1.text.toString()
                            text1.text = "h$str"
                        } else if (inputText.get(i) == 'ø') {
                            str = text1.text.toString()
                            text1.text = "i$str"
                        } else if (inputText.get(i) == 'f') {
                            str = text1.text.toString()
                            text1.text = "j$str"
                        } else if (inputText.get(i) == 'c') {
                            str = text1.text.toString()
                            text1.text = "k$str"
                        }else if(inputText.get(i) == 'ш'){
                            str = text1.text.toString()
                            text1.text = "m$str"
                        }else if (inputText.get(i) == 'ñ') {
                            str = text1.text.toString()
                            text1.text = "n$str"
                        }else if(inputText.get(i) == 'œ'){
                            str = text1.text.toString()
                            text1.text = "o$str"
                        }else if (inputText.get(i) == 't') {
                            str = text1.text.toString()
                            text1.text = "p$str"
                        } else if (inputText.get(i) == 'v') {
                            str = text1.text.toString()
                            text1.text = "q$str"
                        } else if (inputText.get(i) == 'x') {
                            str = text1.text.toString()
                            text1.text = "r$str"
                        } else if (inputText.get(i) == 'm') {
                            str = text1.text.toString()
                            text1.text = "s$str"
                        } else if (inputText.get(i) == 'y') {
                            str = text1.text.toString()
                            text1.text = "t$str"
                        } else if (inputText.get(i) == 'ə') {
                            str = text1.text.toString()
                            text1.text = "u$str"
                        } else if (inputText.get(i) == 'r') {
                            str = text1.text.toString()
                            text1.text = "v$str"
                        } else if (inputText.get(i) == 'ç') {
                            str = text1.text.toString()
                            text1.text = "w$str"
                        } else {
                            str = text1.text.toString()
                            a = inputText.get(i).toString()
                            text1.text = "$a$str"
                        }
                    }
                    else if(inputText.get(i).isUpperCase()){
                        if(inputText.get(i) == 'I'){
                            str = text1.text.toString()
                            text1.text = "A$str"
                        }
                        else if(inputText.get(i) == 'H'){
                            str = text1.text.toString()
                            text1.text = "B$str"
                        }
                        else if(inputText.get(i) == 'K'){
                            str = text1.text.toString()
                            text1.text = "C$str"
                        }
                        else if(inputText.get(i) == 'B'){
                            str = text1.text.toString()
                            text1.text = "D$str"
                        }
                        else if(inputText.get(i) == 'Æ'){
                            str = text1.text.toString()
                            text1.text = "E$str"
                        }
                        else if(inputText.get(i) == 'J'){
                            str = text1.text.toString()
                            text1.text = "F$str"
                        }
                        else if(inputText.get(i) == 'P'){
                            str = text1.text.toString()
                            text1.text = "G$str"
                        }
                        else if(inputText.get(i) == 'Z'){
                            str = text1.text.toString()
                            text1.text = "H$str"
                        }
                        else if(inputText.get(i) == 'Ø'){
                            str = text1.text.toString()
                            text1.text = "I$str"
                        }
                        else if(inputText.get(i) == 'F'){
                            str = text1.text.toString()
                            text1.text = "J$str"
                        }
                        else if(inputText.get(i) == 'C'){
                            str = text1.text.toString()
                            text1.text = "K$str"
                        }
                        else if(inputText.get(i) == 'Ш'){
                            str = text1.text.toString()
                            text1.text = "M$str"
                        }
                        else if(inputText.get(i) == 'Ñ'){
                            str = text1.text.toString()
                            text1.text = "N$str"
                        }
                        else if(inputText.get(i) == 'Œ'){
                            str = text1.text.toString()
                            text1.text = "O$str"
                        }
                        else if(inputText.get(i) == 'T'){
                            str = text1.text.toString()
                            text1.text = "P$str"
                        }
                        else if(inputText.get(i) == 'V'){
                            str = text1.text.toString()
                            text1.text = "Q$str"
                        }
                        else if(inputText.get(i) == 'X'){
                            str = text1.text.toString()
                            text1.text = "R$str"
                        }
                        else if(inputText.get(i) == 'M'){
                            str = text1.text.toString()
                            text1.text = "S$str"
                        }
                        else if(inputText.get(i) == 'Y'){
                            str = text1.text.toString()
                            text1.text = "T$str"
                        }
                        else if(inputText.get(i) == 'Ə'){
                            str = text1.text.toString()
                            text1.text = "U$str"
                        }
                        else if(inputText.get(i) == 'R'){
                            str = text1.text.toString()
                            text1.text = "V$str"
                        }
                        else if(inputText.get(i) == 'Ç'){
                            str = text1.text.toString()
                            text1.text = "W$str"
                        }
                        else{
                            str = text1.text.toString()
                            a = inputText.get(i).toString()
                            text1.text = "$a$str"
                        }
                    }

                }
                else if(inputText.get(i) == '!'){
                    str = text1.text.toString()
                    text1.text = "l$str"
                }
                else if(inputText.get(i) == '+'){
                    str = text1.text.toString()
                    text1.text = "x$str"
                }
                else if(inputText.get(i) == '¥'){
                    str = text1.text.toString()
                    text1.text = "y$str"
                }
                else if(inputText.get(i) == '£'){
                    str = text1.text.toString()
                    text1.text = "z$str"
                }
                else{
                    str = text1.text.toString()
                    a = inputText.get(i).toString()
                    text1.text = "$a$str"
                }
                i--
            }

        }


        copy_btn.setOnClickListener() {

            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("EditText", text1.text.toString())

            clipboard.setPrimaryClip(clip)

            Toast.makeText(this,"Text Copyed", Toast.LENGTH_SHORT).show()

        }

        home_btn.setOnClickListener() {
            val nxt_activity = Intent(this@deKapon_activity, MainActivity::class.java)
            startActivity(nxt_activity)

        }

    }
}