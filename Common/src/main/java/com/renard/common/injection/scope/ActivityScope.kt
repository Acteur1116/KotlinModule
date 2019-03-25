package com.renard.common.injection.scope

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME
/**
 * Created by Riven_rabbit on 2019/3/25
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class ActivityScope