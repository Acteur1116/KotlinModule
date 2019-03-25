package com.renard.common.common

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.renard.common.BuildConfig
import com.renard.common.injection.component.DaggerAppComponent
import com.renard.common.injection.module.AppMoudle
import com.squareup.leakcanary.LeakCanary
import com.tencent.bugly.crashreport.CrashReport

/**
 * Created by Riven_rabbit on 2019/3/21
 */
open class BaseApplication : Application(){
    lateinit var appComponent: DaggerAppComponent

    override fun onCreate() {
        super.onCreate()
        initInjection()
        Logger.addLogAdapter(object : AndroidLogAdapter(){
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
        context =this
        //初始化腾讯Bugly
        CrashReport.initCrashReport(this)
        if (BuildConfig.DEBUG){
            //初始化LeakCanary
            LeakCanary.install(this)
            //打印日志
            ARouter.openLog()
            //开启调试
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

    private fun initInjection() {
        appComponent = DaggerAppComponent.builder()
            .appMoudle(AppMoudle(this))
            .build() as DaggerAppComponent
    }

    companion object {
        lateinit var context: Context
    }
}