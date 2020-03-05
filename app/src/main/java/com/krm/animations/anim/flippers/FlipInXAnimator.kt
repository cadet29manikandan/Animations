package com.krm.animations.anim.flippers

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class FlipInXAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "rotationX", 90f, -15f, 15f, 0f),
            ObjectAnimator.ofFloat(target, "alpha", 0.25f, 0.5f, 0.75f, 1f)
        )
    }
}