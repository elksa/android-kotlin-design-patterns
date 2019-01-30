package com.elksa.design.patterns.patterns.structural.proxy.structural;

public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy() {
        subject = new ConcreteSubject();
    }

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public String request() {
        return subject.request();
    }
}
