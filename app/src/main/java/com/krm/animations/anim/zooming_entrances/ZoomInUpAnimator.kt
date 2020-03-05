package com.krm.animations.anim.zooming_entrances

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.krm.animations.anim.BaseViewAnimator

class ZoomInUpAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val parent = target!!.parent as ViewGroup
        val distance = parent.height - target.top
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f, 1f),
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1f),
            ObjectAnimator.ofFloat(target, "translationY", distance.toFloat(), -60f, 0f)
        )
    }
}