package com.tech.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var btn1: Button? = null
    var btn2: Button? = null
    var btn3: Button? = null
    var btn4: Button? = null
    var btn5: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        btn1?.setOnClickListener(this)//it expects
        btn2?.setOnClickListener(this)
        btn3?.setOnClickListener(this)
        btn4?.setOnClickListener(this)
        btn5?.setOnClickListener(this)

        var fmanager = supportFragmentManager
        var transacttion = fmanager.beginTransaction()
        transacttion.add(R.id.my_frame, ThirdFrag())//add/replace/ermove
        transacttion.commit()
    }

    private fun init() {
        btn1 = findViewById(R.id.btn_one)
        btn2 = findViewById(R.id.btn_two)
        btn3 = findViewById(R.id.btn_three)
        btn4 = findViewById(R.id.btn_four)
        btn5 = findViewById(R.id.btn_five)

    }

    override fun onClick(v: View?) {
        var fmanager = supportFragmentManager
        var transacttion = fmanager.beginTransaction()
        when (v?.id) {
            R.id.btn_one -> {
                // code  to display our own fragment


                transacttion.replace(R.id.my_frame, FirstFrag())
                transacttion.commit()
            }

            R.id.btn_two -> {

                transacttion.replace(R.id.my_frame, SecondFrag())
                transacttion.commit()
            }
            R.id.btn_three -> {

                transacttion.replace(R.id.my_frame, ThirdFrag())
                transacttion.commit()
            }

            R.id.btn_four -> {

                transacttion.replace(R.id.my_frame, Forthfrag())
                transacttion.commit()
            }


            R.id.btn_five -> {

                transacttion.replace(R.id.my_frame, SecondFrag())
                transacttion.commit()
            }


        }

    }
}