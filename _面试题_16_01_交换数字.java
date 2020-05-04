package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/4 22:46
 */
public class _面试题_16_01_交换数字 {
    public int[] swapNumbers(int[] numbers) {
        numbers[0] = numbers[1]+numbers[0];
        numbers[1] = numbers[0]-numbers[1];
        numbers[0] = numbers[0]-numbers[1];
        return numbers;
    }
}
