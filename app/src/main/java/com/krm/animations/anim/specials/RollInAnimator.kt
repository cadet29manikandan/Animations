package com.krm.animations.anim.specials

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class RollInAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(
                target,
                "translationX",
                -(target!!.width - target.paddingLeft - target.paddingRight).toFloat(),
                0f
            ),
            ObjectAnimator.ofFloat(target, "rotation", -120f, 0f)
        )
    }
}