package com.example.tusks.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tusks.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.container,
                    MainFragment.newInstance(),
                    MainFragment.MAIN_FRAGMENT
                )
                .commit()
        }

    }
}