package array;

//创建自定义Array类
public class Array {

    private int[] data;
    private int size;

    /**
     * 构造
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 空参构造
     */
    public Array() {
        this(10);
    }

    /**
     * 获取size
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
}
