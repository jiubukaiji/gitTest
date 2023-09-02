package com.example.demo.patternChain;

public class SecondHandler extends Handler{
    @Override
    public void handleRequest(String condition) {
        if("SecondHandler".equals(condition)){
            System.out.println("SecondHandler处理");

            // 校验通过,往下一级校验
            if(handler != null){
                handler.handleRequest(condition);
            }
        }else {
            // 校验没通过
            System.out.println();
        }

    }
}
