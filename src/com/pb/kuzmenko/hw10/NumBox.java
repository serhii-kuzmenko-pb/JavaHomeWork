package com.pb.kuzmenko.hw10;

public class NumBox<T extends Number> {
    private int realNumberInArr = 0;

    public NumBox(int maxLength) {
        this.numbers = (T[]) new Number[maxLength];
    }

    private final T[] numbers;

    public T get(int index) {
        return numbers[index];
    }

    public void set(int index, T num) {
        this.numbers[index] = num;
    }

    void add(int i, T num) throws WrongAddElementException {
        if (this.realNumberInArr >= this.numbers.length) {
            throw new WrongAddElementException("Массив полон");
        }
        this.numbers[this.realNumberInArr] = num;
        this.realNumberInArr++;
    }

    public int length() {
        //return numbers.length;
        int count = 0;
        for (T n : numbers) {
            if (n == null) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }

    double average() {
        double sum = 0;
        for (T i : numbers) {
            if (i == null) {
                break;
            } else sum += i.doubleValue();

        }
        double average = sum / realNumberInArr;
        return average;
    }

    public double sum() {
        double sum = 0;
        for (T i : numbers) {
            if (i == null) {
                break;
            } else sum += i.doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = numbers[0];
        for (T number : numbers) {
            if (number == null) {
                break;
            } else if (number.doubleValue() > max.doubleValue()) {
                max = number;
            }
        }
        return max;
    }

}
