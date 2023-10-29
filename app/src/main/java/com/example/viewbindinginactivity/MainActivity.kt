package com.example.viewbindinginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinginactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val mainBinding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
        mainBinding.button.setOnClickListener{
            if(mainBinding.edTitle.text.toString().isEmpty())
            {
                mainBinding.edTitle.error="Required"
            }
            else if(mainBinding.edDes.text.toString().isEmpty())
            {
                mainBinding.edDes.error="Required"
            }
            else
            {
                mainBinding.title.text=mainBinding.edTitle.text.toString()
                mainBinding.Des.text=mainBinding.Des.text.toString()
            }
        }
    }
}