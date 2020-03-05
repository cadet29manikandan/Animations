package com.krm.animations.anim.specials.`in`

import android.animation.ObjectAnimator
import android.view.View
import com.daimajia.easing.Glider
import com.daimajia.easing.Skill
import com.krm.animations.anim.BaseViewAnimator

class LandingAnimator : BaseViewAnimator() {
    override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            Glider.glide(
                Skill.QuintEaseOut,
                duration.toFloat(),
                ObjectAnimator.ofFloat(target, "scaleX", 1.5f, 1f)
            ),
            Glider.glide(
                Skill.QuintEaseOut,
                duration.toFloat(),
                ObjectAnimator.ofFloat(target, "scaleY", 1.5f, 1f)
            ),
            Glider.glide(
                Skill.QuintEaseOut,
                duration.toFloat(),
                ObjectAnimator.ofFloat(target, "alpha", 0f, 1f)
            )
        )
    }
}