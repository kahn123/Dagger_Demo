package com.example.a51337_000.dagger2dmo.test4;

import dagger.Module;
import dagger.Provides;

@Module
public class WufanModule4 {

    @Provides
    YLMifan4 procidesMifan(){
        return new YLMifan4();
    }
    @Provides
    Chaocai4 procidesChaocai(){
        return new Chaocai4();
    }
}
