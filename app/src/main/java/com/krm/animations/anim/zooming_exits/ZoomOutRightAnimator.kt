package com.krm.animations.anim.zooming_exits

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.krm.animations.anim.BaseViewAnimator

class ZoomOutRightAnimator : BaseViewAnimator() {
    override fun prepare(target: View?) {
        val parent = target!!.parent as ViewGroup
        val distance = parent.width - parent.left
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 1f, 0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "scaleY", 1f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "translationX", 0f, -42f, distance.toFloat())
        )
    }
}