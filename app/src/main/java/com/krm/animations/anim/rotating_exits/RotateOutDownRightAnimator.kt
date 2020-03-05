package com.krm.animations.anim.rotating_exits

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RotateOutDownRightAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val x = target!!.width - target.paddingRight.toFloat()
        val y = target.height - target.paddingBottom.toFloat()
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f),
            ObjectAnimator.ofFloat(target, "rotation", 0f, -90f),
            ObjectAnimator.ofFloat(target, "pivotX", x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y)
        )
    }
}