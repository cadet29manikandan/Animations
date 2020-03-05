package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class WobbleAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val width = target!!.width.toFloat()
        val one = (width / 100.0).toFloat()
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(
                target,
                "translationX",
                0 * one,
                -25 * one,
                20 * one,
                -15 * one,
                10 * one,
                -5 * one,
                0 * one,
                0f
            ),
            ObjectAnimator.ofFloat(target, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)
        )
    }
}