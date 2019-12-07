package com.yangdiansheng.github.utils

import com.yangdiansheng.common.sharedpreferences.Preference
import com.yangdiansheng.github.AppContext
import kotlin.reflect.jvm.jvmName

inline fun <reified R, T> R.pref(default: T) = Preference(AppContext, R::class.jvmName, default)