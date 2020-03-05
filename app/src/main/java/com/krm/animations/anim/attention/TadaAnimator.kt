package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class TadaAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(
                target,
                "scaleX",
                1f,
                0.9f,
                0.9f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1f
            ),
            ObjectAnimator.ofFloat(
                target,
                "scaleY",
                1f,
                0.9f,
                0.9f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1.1f,
                1f
            ),
            ObjectAnimator.ofFloat(target, "rotation", 0f, -3f, -3f, 3f, -3f, 3f, -3f, 3f, -3f, 0f)
        )
    }
}