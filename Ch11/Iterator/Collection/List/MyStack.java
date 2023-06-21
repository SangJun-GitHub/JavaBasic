package Ch11.Iterator.Collection.List;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Created by Sang Jun Park on 6/20/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class MyStack extends Vector {
    public Object push(Object item){
        addElement(item);
        return item;
    }
    public Object pop(){
        Object obj = peek();
        removeElementAt(size() - 1);
        return obj;
    }
    public Object peek(){
        int len = size();

        if(len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
    public boolean empty(){
        return size() == 0;
    }
    public int search(Object obj){
        int i = lastIndexOf(obj);

        if(i >= 0)
            return size() - i;
        return - 1;
    }
}
