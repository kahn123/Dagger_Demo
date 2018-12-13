package com.example.a51337_000.dagger2dmo.test6;

import javax.inject.Inject;

public class Chaocai6 {
    String name;
    @Inject
    public Chaocai6() {
        name = "黄瓜炒菜";
    }


    public Chaocai6(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
