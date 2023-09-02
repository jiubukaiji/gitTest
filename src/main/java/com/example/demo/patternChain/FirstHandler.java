package com.example.demo.patternChain;

public class FirstHandler extends Handler{


    @Override
    public void handleRequest(String condition) {
        if("FirstHandler".equals(condition)){
            System.out.println("FirstHandler处理");
        }
//        if(getHandler() != null){
//            handler.handleRequest(condition);
//        }
    }
}
