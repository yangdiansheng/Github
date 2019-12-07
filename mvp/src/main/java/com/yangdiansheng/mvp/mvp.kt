package com.yangdiansheng.mvp

import com.bennyhuo.mvp.ILifecycle

interface IPresenter<out View: IMvpView<IPresenter<View>>> :ILifecycle{
    val view :View
}

interface IMvpView<out Presenter: IPresenter<IMvpView<Presenter>>>: ILifecycle{
    val presenter: Presenter
}