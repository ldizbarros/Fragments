package com.dam18.project.pruebas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Añadimos una activity nueva (activity_main -- New -- Layout Resource File)
        // Al cambiar a horizontal sale un toast
        if (txtHorizontal != null) {
            toast("Horizontal")
        }

        // Hacemos que cada vez que cliquemos el boton cambiemos de activity
        btnChange.setOnClickListener {
            startActivity(intentFor<New>("id" to 5).singleTop())
        }
    }
}
