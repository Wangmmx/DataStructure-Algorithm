package setAndMap.set;

public class TestLinkedListSet {
    public static void main(String[] args) {
        LinkedListSet<String> lls = new LinkedListSet<>();
        for (int i = 0; i < 10; i++) {
            lls.add("aaa" +i);
        }
        System.out.println(lls.getSize());

        lls.add("aaa0");
        System.out.println(lls.getSize());

        lls.add("aaa323");
        System.out.println(lls.getSize());

        lls.remove("aaa323");
        System.out.println(lls.getSize());
    }

}
