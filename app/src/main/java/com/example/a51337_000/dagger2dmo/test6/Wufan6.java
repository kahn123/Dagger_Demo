package com.example.a51337_000.dagger2dmo.test6;

import javax.inject.Inject;

public class Wufan6 {
    @Inject
    Mifan6 mifan;
    @Inject
    Chaocai6 chaocai;
    @Inject
    public Wufan6() {
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
