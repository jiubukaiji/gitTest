package com.example.demo.patternChain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;



public abstract class Handler {

    Handler handler;

    protected void setNextHandler(){
        this.handler = handler;
    }

    /**
     * 抽象方法，具体处理逻辑
     */
    public abstract void handleRequest(String condition);

}
