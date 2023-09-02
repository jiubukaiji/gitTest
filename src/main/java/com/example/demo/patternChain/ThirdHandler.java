package com.example.demo.patternChain;

public class ThirdHandler extends Handler{
    @Override
    public void handleRequest(String condition) {
        if("ThirdHandler".equals(condition)){
            System.out.println("ThirdHandler处理");
        }
//        if(getHandler() != null){
//            handler.handleRequest(condition);
//        }
    }
}
