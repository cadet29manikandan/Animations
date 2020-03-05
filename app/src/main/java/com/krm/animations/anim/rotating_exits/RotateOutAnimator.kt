package com.krm.animations.anim.rotating_exits

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RotateOutAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(target, "rotation", 0f, 200f)
        )
    }
}