package setAndMap.map;

public class TestLinkedListMap {
    public static void main(String[] args) {
        LinkedListMap<String, Integer> map = new LinkedListMap<>();
        for (int i = 0; i <10 ; i++) {
            map.add("aa"+i, i);
        }
        System.out.println(map);
        System.out.println(map.get("aa3"));

        map.remove("aa2");
        System.out.println(map);
    }
}
