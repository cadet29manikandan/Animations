package com.krm.animations.anim.specials

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RollOutAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(target, "translationX", 0f, target!!.width.toFloat()),
            ObjectAnimator.ofFloat(target, "rotation", 0f, 120f)
        )
    }
}