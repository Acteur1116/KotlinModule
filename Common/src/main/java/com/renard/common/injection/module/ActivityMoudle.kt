package com.renard.common.injection.module

import android.app.Activity
import com.renard.common.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by Riven_rabbit on 2019/3/25
 */
@Module
class ActivityMoudle(private val activity:Activity) {
    @ActivityScope
    @Provides
    fun provideActivity():Activity{
        return this.activity
    }
}