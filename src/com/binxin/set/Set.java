package com.binxin.set;

/**
 * @author chen bin
 * @date 2021/4/22
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
