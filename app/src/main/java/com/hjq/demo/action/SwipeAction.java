package com.hjq.demo.action;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2019/12/08
 *    desc   : 界面侧滑意图
 */
public interface SwipeAction {

    /**
     * 是否使用界面侧滑
     */
    default boolean isSwipeEnable() {
        // 默认开启
        return true;
    }
}