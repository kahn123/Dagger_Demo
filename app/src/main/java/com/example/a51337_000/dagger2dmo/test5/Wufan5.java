package com.example.a51337_000.dagger2dmo.test5;

import javax.inject.Inject;

public class Wufan5 {
    @Inject
    Mifan5 mifan;
    @Inject
    Chaocai5 chaocai;
    @Inject
    public Wufan5() {
    }
    @Inject
    String restaurantName;

    public String eat(){
        StringBuilder sb = new StringBuilder();
        sb.append("我从 ");
        sb.append(restaurantName.toString());
        sb.append("订的外卖，");
        sb.append("我吃的是 ");
        if ( mifan != null ) {
            sb.append(mifan.toString());
        }

        if (chaocai != null) {
            sb.append("  ");
            sb.append(chaocai.toString());
        }
        return sb.toString();

    }
}
