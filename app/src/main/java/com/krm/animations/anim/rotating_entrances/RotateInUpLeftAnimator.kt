package com.krm.animations.anim.rotating_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RotateInUpLeftAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val x = target!!.paddingLeft.toFloat()
        val y = target.height - target.paddingBottom.toFloat()
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "rotation", 90f, 0f),
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(target, "pivotX", x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y)
        )
    }
}