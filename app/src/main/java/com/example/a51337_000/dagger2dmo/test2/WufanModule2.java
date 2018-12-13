package com.example.a51337_000.dagger2dmo.test2;

import dagger.Module;
import dagger.Provides;

@Module
public class WufanModule2 {


    @Provides
    Chaocai2 providesChaocai(){

        return new Chaocai2("大白菜炒菜");
    }
    @Provides
    Mifan2 providesMifan(){

        return new Mifan2();
    }
}
