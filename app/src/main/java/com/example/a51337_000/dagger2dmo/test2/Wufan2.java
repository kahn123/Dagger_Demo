package com.example.a51337_000.dagger2dmo.test2;

import javax.inject.Inject;

public class Wufan2 {
    @Inject
    Mifan2 mifan;
    @Inject
    Chaocai2 chaocai;
    @Inject
    public Wufan2() {
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
