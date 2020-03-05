package com.krm.animations.anim.attention

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class SwingAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "rotation", 0f, 10f, -10f, 6f, -6f, 3f, -3f, 0f)
        )
    }
}