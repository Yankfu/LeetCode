package com.LeetCode;

import java.util.concurrent.Semaphore;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/9 22:31
 */
public class _1114_按序打印 {
    public static void main(String[] args) {
        Foo foo = new Foo();

    }
}
class Foo {
    private Semaphore second;
    private Semaphore first;
    public Foo() {
        first = new Semaphore(0);
        second = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        first.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        second.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}