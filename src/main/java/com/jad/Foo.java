package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
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

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public void setBazs(Baz bazs[]) {
        this.bazs = new ArrayList<>();
    }

    public void setGraults(Grault graults[]) {
        this.graults = new ArrayList<>();
    }

}
