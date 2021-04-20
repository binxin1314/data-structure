package com.binxin.queue;

/**
 * @author chen bin
 * @date 2021/4/20
 */
public interface Queue<E> {

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();
}
