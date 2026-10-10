package com.magicoxs.aidroid
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "JAMDAN AIDROID V14\nFINAL BUILD ✅"
        tv.textSize = 26f
        tv.setPadding(60, 400, 60, 60)
        setContentView(tv)
    }
}
