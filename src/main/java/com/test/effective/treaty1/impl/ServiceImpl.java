package com.test.effective.treaty1.impl;

import com.test.effective.treaty1.Service;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class ServiceImpl implements Service {
    @Override
    public boolean addService() {
        System.out.println("ADD");
        return false;
    }

    @Override
    public boolean deleteService() {
        System.out.println("DELETE");
        return false;
    }
}
