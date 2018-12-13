package com.example.a51337_000.dagger2dmo.test2;

import javax.inject.Inject;

public class Chaocai2 {
    String name;
    @Inject
    public Chaocai2() {
        name = "黄瓜炒菜";
    }


    public Chaocai2(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
