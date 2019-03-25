package com.renard.common.ui.activity

import com.renard.common.common.BaseApplication
import com.renard.common.injection.component.DaggerActivityComponent
import com.renard.common.injection.module.ActivityMoudle
import com.renard.common.mvp.BasePresenter
import com.renard.common.mvp.view.BaseView
import dagger.Component
import javax.inject.Inject

/**
 * Created by Riven_rabbit on 2019/3/25
 */
abstract class BaseMvpActivity<T:BasePresenter> : BaseActivity() , BaseView {

    @Inject
    lateinit var mPresenter: T

    protected lateinit var mActivityComponent: DaggerActivityComponent

    override fun initOperate() {
        initActivityInjection()
        injectComponent()
    }

    private fun initActivityInjection() {
        mActivityComponent =DaggerActivityComponent.builder()
            .activityMoudle(ActivityMoudle(this))
            .appComponent((application as BaseApplication).appComponent)
            .build() as DaggerActivityComponent
    }

    override fun showLoading() {
        showDialogLoading()
    }

    override fun hideLoading() {
        hideDialogLoading()
    }

    /**
     * 注册依赖对象
     */
    abstract fun injectComponent()
}