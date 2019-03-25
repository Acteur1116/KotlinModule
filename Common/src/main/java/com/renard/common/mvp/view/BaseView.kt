package com.renard.common.mvp.view

/**
 * Created by Riven_rabbit on 2019/3/25
 */
open interface BaseView {
    /**
     * 显示Loading
     */
    fun showLoading()
    /**
     * 隐藏Loading
     */
    fun hideLoading()
    /**
     * 访问错误
     */
    fun error(){}
    /**
     * 空数据
     */
    fun empty(){}
}