package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class BounceAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "translationY", 0f, 0f, -30f, 0f, -15f, 0f, 0f)
        )
    }
}