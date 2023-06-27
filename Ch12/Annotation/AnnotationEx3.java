package Ch12.Annotation;

import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 6/27/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class AnnotationEx3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass2 nc = new NewClass2();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass2> list = new ArrayList();
        list.add(nc);
    }
}
class NewClass2{
    int newField;
    @Deprecated
    int oldField;
    int getNewField(){
        return newField;
    }
    @Deprecated
    int getOldField(){
        return oldField;
    }

}
