package com.example.cbstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


fun plus(data1 : Int , data2 : Int) : Int{
    return data1 + data2
}
fun some(data1 : Int , data2 : Int) : Int{
    return data1 * data2
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data1 :Int =10
        val data2 :Int =20
        var data3 :Int =0


        data3 = plus(data1, data2)
        println(data3)
        println(some(data1,data3))
    }
}

