package com.test.effective.treaty1.run;

import com.test.effective.treaty1.Services;
import com.test.effective.treaty1.impl.ProviderImpl;
import com.test.effective.treaty1.impl.ServiceImpl;

/**
 * Created by zhuran on 2018/11/12 0012
 * 考虑用静态工厂方法代替构造器
 */
public class Test {
    public static void main(String[] args) {
        Services.registerDefaultProvider(new ProviderImpl());
        ServiceImpl service = (ServiceImpl) Services.newInstance();
        service.addService();
        service.deleteService();
    }
}
