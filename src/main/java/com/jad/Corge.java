package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        this.setFoo(foo);
    }

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
