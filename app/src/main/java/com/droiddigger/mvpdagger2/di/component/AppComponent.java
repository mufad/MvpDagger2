package com.droiddigger.mvpdagger2.di.component;

import android.app.Application;
import android.content.Context;

import com.droiddigger.mvpdagger2.InitApplication;
import com.droiddigger.mvpdagger2.di.module.AppModule;
import com.droiddigger.mvpdagger2.di.module.ContextModule;
import com.droiddigger.mvpdagger2.di.module.DataModule;
import com.droiddigger.mvpdagger2.model.Model;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();

    Model getFindItemsInteractor();

    Application getApplication();
}
