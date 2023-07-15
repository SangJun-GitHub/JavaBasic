package Ch14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Sang Jun Park on 7/12/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class StreamEx3 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("AAA", 3, 300),
                new Student2("BBB", 1, 200),
                new Student2("CCC", 2, 100),
                new Student2("DDD", 2, 150),
                new Student2("EEE", 1, 200),
                new Student2("FFF", 3, 290),
                new Student2("GGG", 3, 180)
        };

        Stream<Student2> stuStream = Stream.of(stuArr);


        stuStream.sorted(Comparator.comparing(Student2::getClassNum)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);


        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student2::getTotalScore);
        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();

        System.out.println("count       :   " + stat.getCount());
        System.out.println("sum         :   " + stat.getSum());
        System.out.println("average     :   " + stat.getAverage());
        System.out.println("min         :   " + stat.getMin());
        System.out.println("max         :   " + stat.getMax());

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
