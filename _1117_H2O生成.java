package com.LeetCode;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/14 22:43
 */
public class _1117_H2O生成 {
    class H2O {
        private Semaphore oxygen;
        private Semaphore hydrogen;
        public H2O() {
            oxygen = new Semaphore(0);
            hydrogen = new Semaphore(2);
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            hydrogen.acquire();
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            oxygen.release();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            oxygen.acquire(2);
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            hydrogen.release(2);
        }
    }
}
