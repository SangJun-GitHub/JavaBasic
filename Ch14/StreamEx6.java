package Ch14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sang Jun Park on 7/15/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StreamEx6 {
    public static void main(String[] args) {
        Student3[] stuArr = {
                new Student3("AAA", 3, 300),
                new Student3("BBB", 1, 200),
                new Student3("CCC", 2, 100),
                new Student3("DDD", 2, 150),
                new Student3("EEE", 1, 200),
                new Student3("FFF", 3, 290),
                new Student3("GGG", 3, 180),
        };

        List<String> names = Stream.of(stuArr).map(Student3::getName).collect(Collectors.toList());
        System.out.println(names);

        //Stream -> Array
        Student3[] stuArr2 = Stream.of(stuArr).toArray(Student3[]::new);

        for(Student3 s : stuArr2)
            System.out.println(s);

        //Stream -> Map<String, Student3>, name : key
        Map<String, Student3> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));

        for(String name : stuMap.keySet())
            System.out.println(name + " - " + stuMap.get(name));

        long count = Stream.of(stuArr).collect(Collectors.counting());
        long totalScore = Stream.of(stuArr).collect(Collectors.summingInt(Student3::getTotalScore));

        System.out.println("count       = " + count);
        System.out.println("totalScore  = " + totalScore);

        totalScore = Stream.of(stuArr).collect(Collectors.reducing(0, Student3::getTotalScore, Integer::sum));
        System.out.println("totalScore  = " + totalScore);

        Optional<Student3> topStudent = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparingInt(Student3::getTotalScore)));
        System.out.println("topStudent  = " + topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr).collect(Collectors.summarizingInt(Student3::getTotalScore));
        System.out.println(stat);

        String stuNames = Stream.of(stuArr).map(Student3::getName).collect(Collectors.joining(",", "{", "}"));
        System.out.println(stuNames);

    }
}
class Student3 implements Comparable<Student>{
    String name;
    int classNum;
    int totalScore;

    Student3(String name, int classNum, int totalScore){
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
