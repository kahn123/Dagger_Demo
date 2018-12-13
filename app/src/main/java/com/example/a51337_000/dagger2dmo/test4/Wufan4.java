package com.example.a51337_000.dagger2dmo.test4;

import javax.inject.Inject;

public class Wufan4 {
    @Inject
    Mifan4 mifan;
    @Inject
    Chaocai4 chaocai;
    @Inject
    public Wufan4() {
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
