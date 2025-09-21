package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        this.setFoo(foo);
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo(Foo foo) {
        return this.foo;
    }
}
