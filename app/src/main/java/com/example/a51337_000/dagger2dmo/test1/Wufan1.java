package com.example.a51337_000.dagger2dmo.test1;

import javax.inject.Inject;

public class Wufan1 {
    @Inject
    Mifan1 mifan;
    @Inject
    Chaocai1 chaocai;
    @Inject
    public Wufan1() {
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
