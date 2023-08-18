package Ch15;

import java.io.Serializable;

/**
 * Created by Sang Jun Park on 8/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class UserInfo implements Serializable {
    String name;
    String password;
    int age;

    public UserInfo(){
        this("Unknown", "1111", 0);
    }

    public UserInfo(String name, String password, int arg){
        this.name = name;
        this.password = password;
        this.age = arg;
    }

    public String toString(){
        return "(" + name + "," + password + "," + age + ")";
    }
}
