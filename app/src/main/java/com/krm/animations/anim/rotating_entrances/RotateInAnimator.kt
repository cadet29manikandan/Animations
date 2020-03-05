package com.krm.animations.anim.rotating_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RotateInAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "rotation", -200f, 0f),
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f)
        )
    }
}