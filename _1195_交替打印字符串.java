package com.LeetCode;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/14 22:59
 */
public class _1195_交替打印字符串 {
    class FizzBuzz {
        private Semaphore sema = new Semaphore(1);

        private int curNum = 1;

        private int n;

        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            for (;;){
                this.sema.acquire(1);
                try {
                    if (this.curNum > n){
                        return;
                    }
                    if ((this.curNum % 3==0) && (this.curNum%5!=0)){
                        printFizz.run();
                        this.curNum++;
                    }
                } finally {
                    this.sema.release(1);
                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            for (;;){
                this.sema.acquire(1);
                try {
                    if (this.curNum > n){
                        return;
                    }
                    if ((this.curNum % 3!=0) && (this.curNum%5==0)){
                        printBuzz.run();
                        this.curNum++;
                    }
                } finally {
                    this.sema.release(1);
                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            for (;;){
                this.sema.acquire(1);
                try {
                    if (this.curNum > n){
                        return;
                    }
                    if ((this.curNum % 3==0) && (this.curNum%5==0)){
                        printFizzBuzz.run();
                        this.curNum++;
                    }
                } finally {
                    this.sema.release(1);
                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            for (;;){
                this.sema.acquire(1);
                try {
                    if (this.curNum > n){
                        return;
                    }
                    if ((this.curNum % 3!=0) && (this.curNum%5!=0)){
                        printNumber.accept(curNum);
                        this.curNum++;
                    }
                } finally {
                    this.sema.release(1);
                }
            }
        }
    }
}
