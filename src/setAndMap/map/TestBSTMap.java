package setAndMap.map;

public class TestBSTMap {
    public static void main(String[] args) {
        BSTMap<Integer, String> map = new BSTMap<>();
        for (int i = 0; i <10 ; i++) {
            map.add(i, "aa"+i);
        }
       // System.out.println(map);
        System.out.println(map.get(9));
        System.out.println("-------inorder--------");
        map.inOrder();
        map.remove(5);
        System.out.println("-------after remove--------");
        map.inOrder();


    }
}
