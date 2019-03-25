package com.renard.common.injection.component

import android.app.Activity
import android.content.Context
import com.renard.common.injection.module.ActivityMoudle
import com.renard.common.injection.scope.ActivityScope
import dagger.Component

/**
 * Created by Riven_rabbit on 2019/3/25
 */
@ActivityScope
@Component (dependencies = [AppComponent::class],
    modules = [ActivityMoudle::class])
interface ActivityComponent {
    fun context():Context
    fun activity():Activity
}