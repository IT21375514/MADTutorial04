package com.example.tutorial4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtStudentId: EditText
    lateinit var spnYear: Spinner
    lateinit var spnSemester:Spinner
    lateinit var cbAgree: CheckBox
    lateinit var tvYear: TextView
    lateinit var tvSemester: TextView
    private var count = 0;

    edtStudentId = findViewById(R.id.edtStudentId)

    tvYear = findViewById(R.id.tvYear)
    spnYear = findViewById(R.id.spnYear)
    tvSemester = findViewById(R.id.tvSemester)
    spnSemester = findViewById(R.id.spnSemester)
    cbAgree = findViewById(R.id.cbAgree)

    fun displayAlert(title:String, message:String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, which ->
            // Do something when the "OK" button is clicked }
        val dialog = builder.create()
            dialog.show() }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}