package com.howroad.yundizhiyi.cal;

import java.lang.instrument.Instrumentation;

/**
 * <p>Title: ObjectSize.java</p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * 
 * @since：2019年7月12日 下午5:20:09
 * 
 */
public class ObjectSize {
    private static volatile Instrumentation instru;
 
    public static void premain(String args, Instrumentation inst) {
        instru = inst;
    }
 
    public static Long getSizeOf(Object object) {
        if (instru == null) {
            throw new IllegalStateException("Instrumentation is null");
        }
        return instru.getObjectSize(object);
    }
}