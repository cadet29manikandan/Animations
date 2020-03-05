package com.krm.animations.anim.zooming_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class ZoomInAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 0.45f, 1f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.45f, 1f),
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f)
        )
    }
}