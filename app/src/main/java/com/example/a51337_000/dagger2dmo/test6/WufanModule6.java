package com.example.a51337_000.dagger2dmo.test6;

import dagger.Module;
import dagger.Provides;

@Module
public class WufanModule6 {
    String restaurantName;

    public WufanModule6(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Provides
    Mifan6 procidesMifan(YLMifan6 ylMifan5) {
        return ylMifan5;
    }

    @Provides
    YLMifan6 providesYLMifan() {
        return new YLMifan6();
    }

    @Provides
    Chaocai6 procidesChaocai() {
        return new Chaocai6();
    }

    @Provides
    String procidesRestaurantName() {
        return restaurantName;
    }

}
