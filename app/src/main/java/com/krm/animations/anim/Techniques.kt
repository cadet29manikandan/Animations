package com.krm.animations.anim

import com.krm.animations.anim.attention.*
import com.krm.animations.anim.bouncing_entrances.*
import com.krm.animations.anim.fading_entrances.*
import com.krm.animations.anim.fading_exits.*
import com.krm.animations.anim.flippers.FlipInXAnimator
import com.krm.animations.anim.flippers.FlipInYAnimator
import com.krm.animations.anim.flippers.FlipOutXAnimator
import com.krm.animations.anim.flippers.FlipOutYAnimator
import com.krm.animations.anim.rotating_entrances.*
import com.krm.animations.anim.rotating_exits.*
import com.krm.animations.anim.sliders.*
import com.krm.animations.anim.specials.HingeAnimator
import com.krm.animations.anim.specials.RollInAnimator
import com.krm.animations.anim.specials.RollOutAnimator
import com.krm.animations.anim.specials.`in`.DropOutAnimator
import com.krm.animations.anim.specials.`in`.LandingAnimator
import com.krm.animations.anim.specials.out.TakingOffAnimator
import com.krm.animations.anim.zooming_entrances.*
import com.krm.animations.anim.zooming_exits.*

enum class Techniques(private val animatorClazz: Class<*>) {
    DropOut(DropOutAnimator::class.java), Landing(LandingAnimator::class.java), TakingOff(
        TakingOffAnimator::class.java
    ),
    Flash(FlashAnimator::class.java), Pulse(PulseAnimator::class.java), RubberBand(
        RubberBandAnimator::class.java
    ),
    Shake(ShakeAnimator::class.java), Swing(SwingAnimator::class.java), Wobble(
        WobbleAnimator::class.java
    ),
    Bounce(BounceAnimator::class.java), Tada(TadaAnimator::class.java), StandUp(
        StandUpAnimator::class.java
    ),
    Wave(WaveAnimator::class.java), Hinge(HingeAnimator::class.java), RollIn(
        RollInAnimator::class.java
    ),
    RollOut(RollOutAnimator::class.java), BounceIn(
        BounceInAnimator::class.java
    ),
    BounceInDown(BounceInDownAnimator::class.java), BounceInLeft(
        BounceInLeftAnimator::class.java
    ),
    BounceInRight(BounceInRightAnimator::class.java), BounceInUp(
        BounceInUpAnimator::class.java
    ),
    FadeIn(FadeInAnimator::class.java), FadeInUp(
        FadeInUpAnimator::class.java
    ),
    FadeInDown(FadeInDownAnimator::class.java), FadeInLeft(
        FadeInLeftAnimator::class.java
    ),
    FadeInRight(FadeInRightAnimator::class.java), FadeOut(
        FadeOutAnimator::class.java
    ),
    FadeOutDown(FadeOutDownAnimator::class.java), FadeOutLeft(
        FadeOutLeftAnimator::class.java
    ),
    FadeOutRight(FadeOutRightAnimator::class.java), FadeOutUp(
        FadeOutUpAnimator::class.java
    ),
    FlipInX(FlipInXAnimator::class.java), FlipOutX(
        FlipOutXAnimator::class.java
    ),
    FlipInY(FlipInYAnimator::class.java), FlipOutY(
        FlipOutYAnimator::class.java
    ),
    RotateIn(RotateInAnimator::class.java), RotateInDownLeft(
        RotateInDownLeftAnimator::class.java
    ),
    RotateInDownRight(RotateInDownRightAnimator::class.java), RotateInUpLeft(
        RotateInUpLeftAnimator::class.java
    ),
    RotateInUpRight(RotateInUpRightAnimator::class.java), RotateOut(
        RotateOutAnimator::class.java
    ),
    RotateOutDownLeft(RotateOutDownLeftAnimator::class.java), RotateOutDownRight(
        RotateOutDownRightAnimator::class.java
    ),
    RotateOutUpLeft(RotateOutUpLeftAnimator::class.java), RotateOutUpRight(
        RotateOutUpRightAnimator::class.java
    ),
    SlideInLeft(SlideInLeftAnimator::class.java), SlideInRight(
        SlideInRightAnimator::class.java
    ),
    SlideInUp(SlideInUpAnimator::class.java), SlideInDown(
        SlideInDownAnimator::class.java
    ),
    SlideOutLeft(SlideOutLeftAnimator::class.java), SlideOutRight(
        SlideOutRightAnimator::class.java
    ),
    SlideOutUp(SlideOutUpAnimator::class.java), SlideOutDown(
        SlideOutDownAnimator::class.java
    ),
    ZoomIn(ZoomInAnimator::class.java), ZoomInDown(
        ZoomInDownAnimator::class.java
    ),
    ZoomInLeft(ZoomInLeftAnimator::class.java), ZoomInRight(
        ZoomInRightAnimator::class.java
    ),
    ZoomInUp(ZoomInUpAnimator::class.java), ZoomOut(
        ZoomOutAnimator::class.java
    ),
    ZoomOutDown(ZoomOutDownAnimator::class.java), ZoomOutLeft(
        ZoomOutLeftAnimator::class.java
    ),
    ZoomOutRight(ZoomOutRightAnimator::class.java), ZoomOutUp(
        ZoomOutUpAnimator::class.java
    );

    val animator: BaseViewAnimator
        get() = try {
            animatorClazz.newInstance() as BaseViewAnimator
        } catch (e: Exception) {
            throw Error("Can not init animatorClazz instance")
        }

}