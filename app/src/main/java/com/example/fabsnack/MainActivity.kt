package com.example.fabsnack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fabsnack.fragments.fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

     lateinit var btn: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag = fragment()

        btn = findViewById(R.id.fab1)

//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fragment_container, frag)
//            commit()
//        }

        btn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, frag)
                addToBackStack(null)
                commit()
            }
            Snackbar.make(it, "Create a Post", Snackbar.LENGTH_LONG).setAction("create post", null).show()
        }
    }
}