package com.renard.common.utils

import android.content.Context
import android.widget.Scroller

/**
 * Created by Riven_rabbit on 2019/3/25
 */
class FixedSpeedScroller (context: Context) : Scroller(context) {

    private val mDuration = 100

    override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
        super.startScroll(startX, startY, dx, dy, mDuration)
    }
}