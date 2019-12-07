package com.yangdiansheng.github

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.yangdiansheng.mvp.impl.MainFragment
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val mainFragment = MainFragment()
        Log.d("mvp", mainFragment.toString())
        Log.d("mvp", mainFragment.presenter.toString())
        Log.d("mvp", mainFragment.presenter.view.toString())

        mainFragment.onResume()


        email.setText(Setting.email)
        password.setText(Setting.password)

        email_sign_in_button.setOnClickListener {
            Setting.email = email.text.toString().trim()
            Setting.password = password.text.toString().trim()
        }
    }

}