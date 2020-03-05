package com.krm.animations.anim.sliders

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.krm.animations.anim.BaseViewAnimator

class SlideOutRightAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val parent = target!!.parent as ViewGroup
        val distance = parent.width - target.left
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(target, "translationX", 0f, distance.toFloat())
        )
    }
}