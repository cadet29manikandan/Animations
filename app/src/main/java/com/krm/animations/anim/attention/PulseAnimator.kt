package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class PulseAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "scaleY", 1f, 1.1f, 1f),
            ObjectAnimator.ofFloat(target, "scaleX", 1f, 1.1f, 1f)
        )
    }
}