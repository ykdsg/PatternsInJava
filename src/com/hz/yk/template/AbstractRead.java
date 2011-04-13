package com.hz.yk.template;

public abstract  class AbstractRead {
	protected String resource;
    public final void getContent() { // Template Method
        if(open()) {
            readContent();
            close();
        }
    }
    public void setResource(String s) {
        resource = s;
    }
    protected abstract boolean open();
    protected abstract void readContent();
    protected abstract void close();
}
