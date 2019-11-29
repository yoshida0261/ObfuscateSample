package com.stah.obfuscate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stah.obfuscate.test.Test
import com.stah.obfuscate.test.Test2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tt = Test2()
        println(tt.abcedfg22)
        val t = Test(tt.abcedfg22)

        println(t.abcedfg)

    }
}
