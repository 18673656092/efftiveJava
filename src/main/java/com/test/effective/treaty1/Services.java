package com.test.effective.treaty1;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhuran on 2018/11/12 0012
 */
@Data
public class Services {

    private static Services services = null;

    private static final Object lock = new Object();

    private Services() {

    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p) {
        registerDefaultProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerDefaultProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            try {
                throw new IllegalAccessException("No Provider registered with name " + name);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        assert p != null;
        return p.newService();
    }
}
