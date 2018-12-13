package com.example.a51337_000.dagger2dmo.test5;

import dagger.Module;
import dagger.Provides;

@Module
public class WufanModule5 {

    @Provides
    Mifan5 procidesMifan(YLMifan5 ylMifan5) {
        return ylMifan5;
    }

    @Provides
    YLMifan5 providesYLMifan() {
        return new YLMifan5();
    }

    @Provides
    Chaocai5 procidesChaocai() {
        return new Chaocai5();
    }

    @Provides
    String procidesRestaurantName() {
        return "小二饭馆";
    }

}
