package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class StandUpAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val x =
            ((target!!.width - target.paddingLeft - target.paddingRight) / 2
                    + target.paddingLeft).toFloat()
        val y = target.height - target.paddingBottom.toFloat()
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y, y, y, y),
            ObjectAnimator.ofFloat(target, "rotationX", 55f, -30f, 15f, -15f, 0f)
        )
    }
}