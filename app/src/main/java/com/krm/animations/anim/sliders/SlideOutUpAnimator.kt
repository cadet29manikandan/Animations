package com.krm.animations.anim.sliders

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class SlideOutUpAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(target, "translationY", 0f, -target!!.bottom.toFloat())
        )
    }
}