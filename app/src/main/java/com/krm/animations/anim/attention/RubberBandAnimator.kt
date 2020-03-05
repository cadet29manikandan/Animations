package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RubberBandAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 1f, 1.25f, 0.75f, 1.15f, 1f),
            ObjectAnimator.ofFloat(target, "scaleY", 1f, 0.75f, 1.25f, 0.85f, 1f)
        )
    }
}