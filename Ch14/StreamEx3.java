package Ch14;

/**
 * Created by Sang Jun Park on 7/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StreamEx3 {
    public static void main(String[] args) {

    }
}
class Student2 implements Comparable<Student2>{
    String name;
    int classNum;
    int totalScore;

    Student2(String name, int classNum, int totalScore){
        this.name = name;
        this.classNum = classNum;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, classNum, totalScore).toString();
    }
    String getName(){
        return name;
    }
    int getClassNum(){
        return classNum;
    }
    int getTotalScore(){
        return totalScore;
    }
    public int compareTo(Student2 s){
        return s.totalScore - this.totalScore;
    }
}
