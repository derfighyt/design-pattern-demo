package com.liuli.design.demo.bridge;

/**
 * 把可能产生扩展或变化的动作从实现类里单独抽离出来
 */
public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}
