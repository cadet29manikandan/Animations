package com.krm.animations.anim.specials

import android.animation.ObjectAnimator
import android.view.View
import com.daimajia.easing.Glider
import com.daimajia.easing.Skill
import com.krm.animations.anim.BaseViewAnimator

class HingeAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        val x = target!!.paddingLeft.toFloat()
        val y = target.paddingTop.toFloat()
        animatorAgent!!.playTogether(
            Glider.glide(
                Skill.SineEaseInOut,
                1300f,
                ObjectAnimator.ofFloat(target, "rotation", 0f, 80f, 60f, 80f, 60f, 60f)
            ),
            ObjectAnimator.ofFloat(target, "translationY", 0f, 0f, 0f, 0f, 0f, 700f),
            ObjectAnimator.ofFloat(target, "alpha", 1f, 1f, 1f, 1f, 1f, 0f),
            ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y, y, y, y, y)
        )
        duration = 1300
    }
}