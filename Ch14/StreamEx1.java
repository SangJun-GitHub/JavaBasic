package Ch14;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Sang Jun Park on 7/11/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("AAA", 3, 300),
                new Student("BBB", 1, 200),
                new Student("CCC", 2, 100),
                new Student("DDD", 2, 150),
                new Student("EEE", 1, 200),
                new Student("FFF", 3, 290),
                new Student("GGG", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getClassNum).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}
class Student implements Comparable<Student>{
     String name;
     int classNum;
     int totalScore;
     Student(String name, int classNum, int totalScore){
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
     public int compareTo(Student s){
         return s.totalScore - this.totalScore;
     }
}
