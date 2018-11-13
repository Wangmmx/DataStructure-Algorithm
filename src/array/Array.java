package array;

//创建自定义Array类
public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
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
    public void add(int index, E e) {
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
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 第一个位置添加元素
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 通过index获取元素
     * @param index
     */
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed, index is out of range");
        return data[index];
    }

    /**
     * 通过index修改元素
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed, index is out of range");
        data[index] = e;
    }

    /**
     * 是否包含
     * @param e
     * @return
     */
    public boolean contain(E e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e))return true;
        }
        return false;
    }

    /**
     * 通过元素查找
     * @param e
     * @return
     */
    public int find(E e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e)) return i;
        }
        return -1;
    }

    /**
     * 通过索引删除元素
     * @param index
     * @return 返回元素值
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed, index is out of range");
        E ret = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;//loitering objects != memory leak 闲逛的资源 不等于 内存泄漏
        return ret;
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public E removeLast() {
        return remove(size-1);
    }

    /**
     * 删除第一个元素
     * @return
     */
    public E removeFrist() {
        return remove(0);
    }

    /**
     * 通过元素删除
     * @param e
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) remove(index);
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
