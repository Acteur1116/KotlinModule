package com.renard.common.injection.module

import android.content.Context
import com.renard.common.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Riven_rabbit on 2019/3/25
 */
@Module
class AppMoudle(private val context: BaseApplication){

    @Singleton
    @Provides
    fun provideContext(): Context {
        return this.context
    }
}