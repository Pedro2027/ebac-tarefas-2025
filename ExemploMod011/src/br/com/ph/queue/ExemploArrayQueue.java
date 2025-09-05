package br.com.ph.queue;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
@author Pedro Henrique Araujo
11/03/2025 
*/
public class ExemploArrayQueue {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("long");
        queue.add("medium");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
