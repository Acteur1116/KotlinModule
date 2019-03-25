package com.renard.common.injection.component

import android.content.Context
import com.renard.common.injection.module.AppMoudle
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Riven_rabbit on 2019/3/25
 */
@Singleton
@Component(modules = [AppMoudle::class])
interface AppComponent {

    fun context():Context
}