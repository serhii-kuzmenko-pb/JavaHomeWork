package com.pb.kuzmenko.hw13;

import java.util.LinkedList;

public class ThreadReadWriter {
    public static void main(String[] args) throws InterruptedException {
        final Pekarnya babulya = new Pekarnya();
        Thread t1 = new Thread(() -> {
            try {
                while (true) {
                    babulya.ispekla();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    babulya.prodala();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

    }

    public static class Pekarnya {
        LinkedList<Integer> list = new LinkedList<>();
        int lengthOfList = 4;
        int value = 1;

        public void ispekla() throws InterruptedException {
            synchronized (this) {
                while (list.size() == lengthOfList)
                    wait();
                System.out.println("Испекла - " + value + "й пирожок");
                list.add(value++);
                notify();
                Thread.sleep(1500);
            }
        }

        public void prodala() throws InterruptedException {
            synchronized (this) {
                while (list.size() == 0)
                    wait();
                int val = list.removeFirst();
                System.out.println("Продала - " + val + "й пирожок");
                notify();
                Thread.sleep(1500);
            }
        }
    }
}

