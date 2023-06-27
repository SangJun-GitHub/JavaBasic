package Ch12.Annotation;

import java.util.Arrays;

/**
 * Created by Sang Jun Park on 6/27/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class AnnotationEx4 {
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1","2","3");

        System.out.println(list);
    }
}
class MyArrayList<T>{
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    //@SuppressWarnings("unchecked")
    MyArrayList(T...arr){
        this.arr = arr;
    }

    @SafeVarargs
    //@SuppressWarnings("unchecked")
    public static <T>MyArrayList<T> asList(T...a){
        return new MyArrayList<>(a);
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
