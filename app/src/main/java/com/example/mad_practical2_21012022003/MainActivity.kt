package com.example.mad_practical2_21012022003

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout

class MainActivity : AppCompatActivity() {
    private val TAG="Main Activity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Create:Method is called")
        Toast.makeText(this,"On create:Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Start:Method is called")
        Toast.makeText(this,"On Start :Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Pause:Method is called")
        Toast.makeText(this,"On Pause:Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Resume:Method is called")
        Toast.makeText(this,"On Resume :Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Restart:Method is called")
        Toast.makeText(this,"On Restart:Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Destroy:Method is called")
        Toast.makeText(this,"On Destroy :Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"On Stop:Method is called")
        Toast.makeText(this,"On Stop:Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"Snackbar",Snackbar.LENGTH_LONG).show()
    }
}