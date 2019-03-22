package com.renard.common.common

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.*

/**
 * Created by Riven_rabbit on 2019/3/22
 */
class AppManager private constructor(){

    private val activityStace: Stack<Activity> = Stack()

    //单例模式
    companion object {
        val instance: AppManager by lazy { AppManager() }
    }

    /**
     * Activity入栈
     */
    fun addActivity(activity: Activity){
        activityStace.add(activity)
    }

    /**
     * Activity出栈
     */
    fun finishActivity(activity: Activity){
        activityStace.remove(activity)
    }

    /**
     * 获取当前栈顶的Activity
     */
    fun currentActivity(): Activity {
        return activityStace.lastElement()
    }

    /**
     * 清除栈
     */
    fun finishAllActivity(){
        for (activity in activityStace) {
            activity.finish()
        }
        activityStace.clear()
    }

    /**
     * 退出应用
     */
    fun exitApp(context: Context){
        finishAllActivity()
        val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.killBackgroundProcesses(context.packageName)
        System.exit(0)
    }


}