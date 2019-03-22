package com.renard.common.net.status

import android.view.View

/**
 * Created by Riven_rabbit on 2019/3/22
 */
interface OnStatusLayoutClickListener {

    /**
     * 空布局点击
     * @param view View
     */
    fun onEmptyViewClick(view: View)

    /**
     * 错误布局点击
     * @param view View
     */
    fun onErrorViewClick(view: View)
}