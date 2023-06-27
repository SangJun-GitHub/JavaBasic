package Ch12.Annotation;

import java.util.ArrayList;

/**
 * Created by Sang Jun Park on 6/27/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.oldField = 10;
        System.out.println(nc.getOldField());

    }
}
class NewClass{
    int newField;

    int getNewField(){
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
