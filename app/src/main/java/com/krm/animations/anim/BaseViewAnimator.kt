package com.krm.animations.anim

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Interpolator
import androidx.core.view.ViewCompat

abstract class BaseViewAnimator {
    var animatorAgent: AnimatorSet? = null
        private set
    var duration = DURATION
    private var mRepeatTimes = 0
    private var mRepeatMode = ValueAnimator.RESTART
    protected abstract fun prepare(target: View?)
    fun setTarget(target: View?): BaseViewAnimator {
        reset(target)
        prepare(target)
        return this
    }

    fun animate() {
        start()
    }

    fun restart() {
        animatorAgent = animatorAgent!!.clone()
        start()
    }

    fun reset(target: View?) {
        ViewCompat.setAlpha(target, 1f)
        ViewCompat.setScaleX(target, 1f)
        ViewCompat.setScaleY(target, 1f)
        ViewCompat.setTranslationX(target, 0f)
        ViewCompat.setTranslationY(target, 0f)
        ViewCompat.setRotation(target, 0f)
        ViewCompat.setRotationY(target, 0f)
        ViewCompat.setRotationX(target, 0f)
    }

    private fun start() {
        for (animator in animatorAgent!!.childAnimations) {
            if (animator is ValueAnimator) {
                animator.repeatCount = mRepeatTimes
                animator.repeatMode = mRepeatMode
            }
        }
        animatorAgent!!.duration = duration
        animatorAgent!!.start()
    }

    fun setDuration(duration: Long): BaseViewAnimator {
        this.duration = duration
        return this
    }

    fun setStartDelay(delay: Long): BaseViewAnimator {
        animatorAgent!!.startDelay = delay
        return this
    }

    val startDelay: Long
        get() = animatorAgent!!.startDelay

    fun addAnimatorListener(l: Animator.AnimatorListener?): BaseViewAnimator {
        animatorAgent!!.addListener(l)
        return this
    }

    fun cancel() {
        animatorAgent!!.cancel()
    }

    val isRunning: Boolean
        get() = animatorAgent!!.isRunning

    val isStarted: Boolean
        get() = animatorAgent!!.isStarted

    fun removeAnimatorListener(l: Animator.AnimatorListener?) {
        animatorAgent!!.removeListener(l)
    }

    fun removeAllListener() {
        animatorAgent!!.removeAllListeners()
    }

    fun setInterpolator(interpolator: Interpolator?): BaseViewAnimator {
        animatorAgent!!.interpolator = interpolator
        return this
    }

    fun setRepeatTimes(repeatTimes: Int): BaseViewAnimator {
        mRepeatTimes = repeatTimes
        return this
    }

    fun setRepeatMode(repeatMode: Int): BaseViewAnimator {
        mRepeatMode = repeatMode
        return this
    }

    companion object {
        const val DURATION: Long = 1000
    }

    init {
        animatorAgent = AnimatorSet()
    }
}