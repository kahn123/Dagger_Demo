package com.example.a51337_000.dagger2dmo.test3;

import javax.inject.Inject;

public class Wufan3 {
    @Inject
    Mifan3 mifan;
    @Inject
    Chaocai3 chaocai;
    @Inject
    public Wufan3() {
    }

    public String eat(){
        StringBuilder sb = new StringBuilder();
        sb.append("我吃的是 ");
        if ( mifan != null ) {
            sb.append("==>>");
            sb.append(mifan.toString());
        }

        if (chaocai != null) {
            sb.append("==>>");
            sb.append(chaocai.toString());
        }
        return sb.toString();

    }
}
