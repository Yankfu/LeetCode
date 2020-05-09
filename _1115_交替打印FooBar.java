package com.LeetCode;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/9 23:09
 */
public class _1115_交替打印FooBar {
    public static void main(String[] args) {

    }
}
class FooBar {
    private int n;
    private Semaphore Foo;
    private Semaphore Bar;
    public FooBar(int n) {
        this.n = n;
        Foo = new Semaphore(0);
        Bar = new Semaphore(1);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // printFoo.run() outputs "foo". Do not change or remove this line.
            Bar.acquire();
            printFoo.run();
            Foo.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            Foo.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            Bar.release();
        }
    }
}
