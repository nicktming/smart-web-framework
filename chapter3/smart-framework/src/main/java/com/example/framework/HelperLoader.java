package com.example.framework;

import com.example.framework.annotation.Controller;
import com.example.framework.helper.BeanHelper;
import com.example.framework.helper.ClassHelper;
import com.example.framework.helper.ControllerHelper;
import com.example.framework.helper.IocHelper;
import com.example.framework.util.ClassUtil;

public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
