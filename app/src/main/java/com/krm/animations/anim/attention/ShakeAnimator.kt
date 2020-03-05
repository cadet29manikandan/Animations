package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class ShakeAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(
                target,
                "translationX",
                0f,
                25f,
                -25f,
                25f,
                -25f,
                15f,
                -15f,
                6f,
                -6f,
                0f
            )
        )
    }
}