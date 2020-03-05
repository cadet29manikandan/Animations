package com.krm.animations.anim.zooming_exits

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class ZoomOutAnimator : BaseViewAnimator() {
    override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f, 0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1f, 0.3f, 0f),
            ObjectAnimator.ofFloat(target, "scaleY", 1f, 0.3f, 0f)
        )
    }
}