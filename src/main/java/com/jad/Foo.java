package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private List<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public void addBaz(Baz baz) {
        if (this.bazs.contains(baz)) return;
        this.bazs.add(baz);
    }
}
