package bai10_dsa_danh_sach.bai_tap.linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"hau");
        Student student2 = new Student(2,"phuong");
        Student student3 = new Student(3,"dung");
        Student student4 = new Student(4,"manh");
        Student student5 = new Student(5,"hau1");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2, student4);
//        myLinkedList.remove(student2);
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        /*for (int i = 0; i < cloneLinkedList.size() ; i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }*/
        System.out.println(myLinkedList.constrains(student5));
        System.out.println(myLinkedList.indexOf(student5));
    }
}
