package com.example.a51337_000.dagger2dmo.test3;

import dagger.Module;
import dagger.Provides;

@Module
public class WufanModule3 {

    @Provides
    Mifan3 procidesMifan(CLMifan3 clMifan){
        return clMifan;
    }
    @Provides
    Chaocai3 procidesChaocai(){
        return new Chaocai3();
    }
}
