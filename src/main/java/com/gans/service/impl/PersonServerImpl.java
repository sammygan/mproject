package com.gans.service.impl;

import com.gans.service.PersonServer;

public class PersonServerImpl implements PersonServer {
    @Override
    public void save(String uname,int age) {
//        int a=0;
//        age= age/a;//打开上面两行报错，可触发异常通知
        System.out.println("come in personServerImpl save method...");
    }
}
