package com.example.a51337_000.dagger2dmo.test5;

import javax.inject.Inject;

public class Chaocai5 {
    String name;
    @Inject
    public Chaocai5() {
        name = "黄瓜炒菜";
    }


    public Chaocai5(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
