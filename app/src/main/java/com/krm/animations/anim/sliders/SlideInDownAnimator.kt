package com.krm.animations.anim.sliders

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class SlideInDownAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val distance = target!!.top + target.height
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(target, "translationY", -distance.toFloat(), 0f)
        )
    }
}