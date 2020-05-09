package com.LeetCode;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/9 23:27
 */
public class _1116_打印零与奇偶数 {
    public static void main(String[] args) {

    }

}
class ZeroEvenOdd {
    private int n;
    private Semaphore Even;
    private Semaphore Odd;
    private Semaphore Zero;

    public ZeroEvenOdd(int n) {
        this.n = n;
        Even = new Semaphore(0);
        Odd = new Semaphore(0);
        Zero = new Semaphore(1);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            Zero.acquire();
            printNumber.accept(0);
            if (i % 2 == 0){
                Even.release();
            }else {
                Odd.release();
            }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            Even.acquire();
            printNumber.accept(i);
            Zero.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            Odd.acquire();
            printNumber.accept(i);
            Zero.release();
        }
    }
}