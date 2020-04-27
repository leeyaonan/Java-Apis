package com.leeyaonan.apis.lang;

/**
 * Java线程相关的Api
 *
 * @author Rot
 * @date 2020/4/27 16:20
 */
public class ThreadApis {

    // 运行测试
    public static void main(String[] args) {

        // 构造方法


        // 静态方法
        // --static Thread currentThread()：获取当前正在执行对象线程的引用
        Thread thread = Thread.currentThread();

        // --获取当前正在执行对象线程的名字
        System.out.println(thread.getName());

        // --返回当前线程的线程组中活动线程的数目
        System.out.println(Thread.activeCount());

        // --测试当前线程是否已经中断
        System.out.println(thread.isInterrupted());


    }

}
