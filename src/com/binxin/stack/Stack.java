package com.binxin.stack;

/**
 * @author chen bin
 * @date 2021/4/20
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();
}
