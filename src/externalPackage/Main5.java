package externalPackage;

import MyDoublyLinkedList1.MyStack;
import zoohandlung.Loewe;
import zoohandlung.Tier;

public class Main5 {

    public static void main(String[] args) {
        MyStack<Tier> ms = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            ms.push(new Loewe("Leo" + i, Math.random()));
        }

        for (Tier t : ms) {
            System.out.println(t);
        }

        while (!ms.isEmpty()) {
            System.out.println("\nEntfernt: " + ms.pull() + "\n");
            System.out.println("\nRestliche Tiere:");
            for (Tier t : ms) {
                System.out.println(t);
            }
        }
    }
}
