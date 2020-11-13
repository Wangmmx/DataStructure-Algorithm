package array;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name = %s and score = %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("王梦", 100));
        arr.addLast(new Student("笨蛋", 20));
        arr.addLast(new Student("学渣", 60));
        System.out.println(arr);
    }
}
