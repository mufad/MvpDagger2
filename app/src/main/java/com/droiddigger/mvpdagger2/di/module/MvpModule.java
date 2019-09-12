package com.droiddigger.mvpdagger2.di.module;

import com.droiddigger.mvpdagger2.MainContract;
import com.droiddigger.mvpdagger2.model.Model;
import com.droiddigger.mvpdagger2.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}
