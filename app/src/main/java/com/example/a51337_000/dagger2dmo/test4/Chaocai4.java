package com.example.a51337_000.dagger2dmo.test4;

import javax.inject.Inject;

public class Chaocai4 {
    String name;
    @Inject
    public Chaocai4() {
        name = "黄瓜炒菜";
    }


    public Chaocai4(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
