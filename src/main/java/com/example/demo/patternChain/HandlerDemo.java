package com.example.demo.patternChain;

public class HandlerDemo {
    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.setHandler(secondHandler);
        secondHandler.setHandler(thirdHandler);

        firstHandler.handleRequest("ThirdHandler");
        firstHandler.handleRequest("FirstHandler");
        firstHandler.handleRequest("SecondHandler");
        firstHandler.handleRequest("SecondHandler");
    }




}
