package com.krm.animations

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.krm.animations.anim.Techniques
import com.krm.animations.anim.YoYo

class ExampleActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example)
        val t = findViewById<View>(R.id.notice) as TextView
        t.text = "Please input your Email and Password"
        findViewById<View>(R.id.submit).setOnClickListener {
            YoYo.with(Techniques.Tada)
                .duration(700)
                .playOn(findViewById(R.id.edit_area))
            t.text = "Wrong password!"
        }
        val t2 = findViewById<View>(R.id.notice2) as TextView
        t2.text = "Please input your Email and Password"
        findViewById<View>(R.id.submit2).setOnClickListener {
            YoYo.with(Techniques.Shake).playOn(findViewById(R.id.edit_area2))
            t2.text = "Wrong password!"
        }
    }
}