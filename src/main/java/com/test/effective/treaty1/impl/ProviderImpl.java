package com.test.effective.treaty1.impl;

import com.test.effective.treaty1.Provider;
import com.test.effective.treaty1.Service;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class ProviderImpl implements Provider {
    @Override
    public Service newService() {
        return new ServiceImpl();
    }
}
