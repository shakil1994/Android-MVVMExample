package com.blackbirds.shakil.kotlinmvvmexample.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.ViewModelProvider
import com.blackbirds.shakil.kotlinmvvmexample.R
import com.blackbirds.shakil.kotlinmvvmexample.ViewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    var edtNumberOne: AppCompatEditText? = null
    var edtNumberTwo: AppCompatEditText? = null
    var btnAdd: AppCompatButton? = null
    var txtResult: TextView? = null
    var mainActivityViewModel: MainActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        edtNumberOne = findViewById(R.id.edtNumberOne)
        edtNumberTwo = findViewById(R.id.edtNumberTwo)
        btnAdd = findViewById(R.id.btnAdd)
        txtResult = findViewById(R.id.txtResult)

        btnAdd!!.setOnClickListener({v: View? ->
            mainActivityViewModel!!.addFunction(
                edtNumberOne!!.text.toString(),
                edtNumberTwo!!.text.toString()
            ).observe(this, {s -> txtResult!!.text = s})
        })
    }
}