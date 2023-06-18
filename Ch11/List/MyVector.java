package Ch11.List;

import java.util.*;

/**
 * Created by Sang Jun Park on 6/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity){
        if(capacity<0)
            throw new IllegalArgumentException("It is not a valid value : " + capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public MyVector(){
        this(10);
    }
    public  void ensureCapacity(int minCapacity){
        if(minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }
    public void trimToSize(){
        setCapacity(size);
    }
    public int capacity(){
        return capacity;
    }
    private void setCapacity(int capacity){
        if(this.capacity == capacity)
            return;
        Object[] tmp = new Object[capacity];
        System.arraycopy(data,0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }
    @Override
    public boolean add(Object obj){
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }
    @Override
    public Object get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("your index is out of range");
        return data[index];
    }
    @Override
    public Object remove(int index){
        Object oldObject = null;
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("your index is out of range");
        oldObject = data[index];

        if(index != size -1)
            System.arraycopy(data, index+1, data, index, size-index-1);
        data[size-1] = null;
        size--;
        return oldObject;
    }
    @Override
    public boolean remove(Object obj){
        for(int i = 0; i < size; i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public void clear(){
        for(int i = 0; i < size; i++)
            data[i] = null;
        size = 0;
    }
    @Override
    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data,0, result, 0, size);
        return result;
    }
    @Override
    public boolean isEmpty(){
        return size ==0;
    }
    @Override
    public int size(){
        return size;
    }

    //Must be implemented methods because of List interface

    public boolean contains(Object o){return false;}
    public Iterator iterator(){return null;}
    public Object[] toArray(Object[] a){return null;}
    public boolean containsAll(Collection c){return false;}
    public boolean addAll(Collection c){return false;}
    public boolean addAll(int index, Collection c){return false;}
    public boolean removeAll(Collection c){return false;}
    public boolean retainAll(Collection c){return false;}
    public boolean equals(Object o){return false;}
    public Object set(int index, Object element){return null;}
    public void add(int index, Object element){}
    public int indexOf(Object o){return -1;}
    public int lastIndexOf(Object o){return -1;}
    public ListIterator listIterator(){return null;}
    public ListIterator listIterator(int index){return null;}
    public List subList(int fromIndex, int toIndex){return null;}

    //default void sort(Comparator c){}                 //Over JDK 1.8 not necessary
    //default Spliterator spliterator(){}               //Over JDK 1.8 not necessary
    //default void replaceAll(UnaryOperator operator){} //Over JDK 1.8 not necessary

    //public boolean add(Object o);
    //public Object get(int index);
    //public boolean remove(int index);
    //public boolean remove(Object o);
    //public void clear();
    //public Object[] toArray();
    //public boolean isEmpty();
    //public int size();

    //public int hashCode();


}
