package com.yangdiansheng.github.view

import android.os.Bundle
import com.yangdiansheng.github.R
import com.yangdiansheng.github.Setting
import com.yangdiansheng.github.presenter.LoginPresenter
import com.yangdiansheng.mvp.impl.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity<LoginPresenter>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)


        email.setText(Setting.email)
        password.setText(Setting.password)

        email_sign_in_button.setOnClickListener {
            Setting.email = email.text.toString().trim()
            Setting.password = password.text.toString().trim()
        }
    }

}