package com.liuli.design.demo.singleton;

/**
 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 JDK 版本：JDK1.5 起
 是否 Lazy 初始化：是
 是否多线程安全：是
 实现难度：较复杂
 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 getInstance() 的性能对应用程序很关键。
 */
public class DCLSingleton {
    //为了保证能拿到最新值，在获取到锁时可能其他线程已经创建了实例，需要使用volatile保证可见性。
    private volatile static DCLSingleton singleton;
    private DCLSingleton (){}

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
