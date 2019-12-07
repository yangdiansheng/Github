package com.yangdiansheng.github

import com.yangdiansheng.common.sharedpreferences.Preference


object Setting {
    var email:String by Preference(AppContext, "email", "")
    var password:String by Preference(AppContext, "password", "")
}