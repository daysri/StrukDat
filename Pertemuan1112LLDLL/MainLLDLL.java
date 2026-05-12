package Pertemuan1112LLDLL;

public class MainLLDLL {
    public static void main(String[] args) {
        // demonstrasi perbedaan antara tipe data primitif dan tipe data objek
        int a = 5;
        int b = a; // b menyimpan nilai yang sama dengan a
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        b = 10; // Mengubah nilai b
        System.out.println("Setelah mengubah nilai b:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        ContohObjek obj1 = new ContohObjek(10);
        ContohObjek obj2 = obj1;
        System.out.println("Nilai data pada obj1: " + obj1.data);
        System.out.println("Nilai data pada obj2: " + obj2.data);
        obj2.data = 20;
        System.out.println("Setelah mengubah nilai data pada obj2:");
        System.out.println("Nilai data pada obj1: " + obj1.data);
        System.out.println("Nilai data pada obj2: " + obj2.data);
/* 
        // demonstrasi Single Linked List
        SingleLL list = new SingleLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println();
        System.out.println("Setelah menambah elemen:");
        list.printList();
        System.out.println("Size: " + list.size());
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Contains 15? " + list.contains(15));

        list.remove(20);
        System.out.println();
        System.out.println("Setelah menghapus nilai 20:");
        list.printList();
        System.out.println("Size: " + list.size());

        int first = list.removeFirst();
        System.out.println();
        System.out.println("Setelah menghapus elemen pertama (" + first + "):");
        list.printList();
        System.out.println("Size: " + list.size());

        // demonstrasi Double Linked List
        DoubleLL doubleList = new DoubleLL();
        doubleList.addLast(100);
        doubleList.addLast(200);
        doubleList.addFirst(50);
        doubleList.addLast(300);
        System.out.println();
        System.out.println("Double Linked List setelah penambahan elemen:");
        doubleList.printForward();
        doubleList.printBackward();
        System.out.println("Size: " + doubleList.size());

        doubleList.remove(200);
        System.out.println();
        System.out.println("Setelah menghapus nilai 200:");
        doubleList.printForward();
        doubleList.printBackward();
        System.out.println("Size: " + doubleList.size());

        int last = doubleList.removeLast();
        System.out.println();
        System.out.println("Setelah menghapus elemen terakhir (" + last + "):");
        doubleList.printForward();
        System.out.println("Size: " + doubleList.size());
        */
    }
}
