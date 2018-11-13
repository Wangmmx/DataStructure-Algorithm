package array;

public class TestArray {

    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i =0; i< 10 ;i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.set(1,100);
        System.out.println(arr);

        arr.add(2,43);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.removeElement(5);
        System.out.println(arr);
    }
}
