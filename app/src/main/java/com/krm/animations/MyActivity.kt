package com.krm.animations

import android.animation.Animator
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import com.krm.animations.anim.Techniques
import com.krm.animations.anim.YoYo
import com.krm.animations.anim.YoYo.YoYoString

class MyActivity : Activity() {
    private var mListView: ListView? = null
    private var mAdapter: EffectAdapter? = null
    private var mTarget: View? = null
    private var rope: YoYoString? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        mListView = findViewById<View>(R.id.list_items) as ListView
        mTarget = findViewById(R.id.hello_world)
        mAdapter = EffectAdapter(this)
        mListView!!.adapter = mAdapter
        mListView!!.onItemClickListener = OnItemClickListener { _, view, _, _ ->
            if (rope != null) {
                rope!!.stop(true)
            }
            val technique = view.tag as Techniques
            rope = YoYo.with(technique)
                .duration(1200)
                .repeat(YoYo.INFINITE)
                .pivot(YoYo.CENTER_PIVOT, YoYo.CENTER_PIVOT)
                .interpolate(AccelerateDecelerateInterpolator())
                .withListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator) {}
                    override fun onAnimationEnd(animation: Animator) {}
                    override fun onAnimationCancel(animation: Animator) {
                        Toast.makeText(
                            this@MyActivity,
                            "canceled previous animation",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onAnimationRepeat(animation: Animator) {}
                })
                .playOn(mTarget)
        }
        findViewById<View>(R.id.hello_world).setOnClickListener {
            if (rope != null) {
                rope!!.stop(true)
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus) {
            rope = YoYo.with(Techniques.FadeIn).duration(1000)
                .playOn(mTarget) // after start,just click mTarget view, rope is not init
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.my, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_settings) {
            startActivity(Intent(this, ExampleActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}