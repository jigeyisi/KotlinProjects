package com.xiaoma.kotlindemo

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button1 -> Toast.makeText(this, "show a toast", Toast.LENGTH_LONG).show()
            R.id.button2 -> AlertDialog.Builder(this).setMessage("message").setTitle("title").setPositiveButton("sure", DialogInterface.OnClickListener { dialog: DialogInterface?, _: Int ->
                dialog?.dismiss()
            }).setNeutralButton("cancle", null).create().show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.textSize = 22.0f
        button2.textSize = 15.0f
//        button1.setOnClickListener {
//            Toast.makeText(this, "show a toast", Toast.LENGTH_LONG).show()
//        }
//        button2.setOnClickListener {
//            AlertDialog.Builder(this).setMessage("message").setTitle("title").setPositiveButton("sure", DialogInterface.OnClickListener { dialog: DialogInterface?, _: Int ->
//                dialog?.dismiss()
//            }).setNeutralButton("cancle", null).create().show()
//        }
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }
}
