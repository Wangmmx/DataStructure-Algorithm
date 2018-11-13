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

    /**
     * 在指定index处添加一个元素e
     * @param index
     * @param e
     */
    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("Add failed, Array is full");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, index is out of range");
        for(int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 末尾添加元素
     * @param e
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 第一个位置添加元素
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 通过index获取元素
     * @param index
     */
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed, index is out of range");
        return data[index];
    }

    /**
     * 通过index修改元素
     * @param index
     * @param e
     */
    public void set(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed, index is out of range");
        data[index] = e;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size is %d, capacity is %d \n", size, data.length));
        sb.append("[");
        for (int i = 0; i< size; i++) {
            sb.append(data[i]);
            if (i != size-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
