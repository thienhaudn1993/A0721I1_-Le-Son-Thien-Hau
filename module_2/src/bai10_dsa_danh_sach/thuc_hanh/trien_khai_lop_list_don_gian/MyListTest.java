package bai10_dsa_danh_sach.thuc_hanh.trien_khai_lop_list_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInteger = new MyArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
