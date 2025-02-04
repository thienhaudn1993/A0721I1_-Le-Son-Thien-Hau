package bai10_dsa_danh_sach.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;

public class MyArrayList<E> {
    // độ dài của danh sách
    private int size=0;
    private final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        // check xem độ dài của danh sách có bằng độ dài của mảng ko
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + (size-1) );
        }
        return (E) elements[i];
    }

}
