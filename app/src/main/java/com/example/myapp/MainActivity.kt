package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.simple_dialog).setOnClickListener {
            simpleDialog()

        }
    }

    private fun simpleDialog() {

        AlertDialog.Builder(this).apply {
            setTitle("Exit")
            setMessage("Do you want to exit?")
            setPositiveButton("Ok") { _, _ ->
                finish()
            }
            setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
        }.create().show()
    }
}