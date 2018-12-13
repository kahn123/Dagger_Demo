package com.example.a51337_000.dagger2dmo.test3;

import javax.inject.Inject;

public class Chaocai3 {
    String name;
    @Inject
    public Chaocai3() {
        name = "黄瓜炒菜";
    }


    public Chaocai3(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
