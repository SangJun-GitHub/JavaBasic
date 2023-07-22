package Ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

/**
 * Created by Sang Jun Park on 7/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Student4 {
    String name;
    boolean isMale;
    int grade;
    int classNum;
    int score;

    Student4(String name, boolean isMale, int grade, int classNum, int score){
        this.name = name;
        this.isMale = isMale;
        this.grade = grade;
        this.classNum = classNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public boolean isMale() {
        return isMale;
    }
    public int getGrade() {
        return grade;
    }
    public int getClassNum() {
        return classNum;
    }
    public int getScore() {
        return score;
    }

    public String toString(){
        return String.format("[%s, %6s, %d grade, %d class, %3d score]", name, isMale ? "Male" : "Female", grade, classNum, score);
    }
    enum Level{ HIGH, MID, LOW}
}
public class StreamEx7 {
    public static void main(String[] args) {
        Student4[] stuArr = {
                new Student4("AAA", true, 1, 1, 300),
                new Student4("BBB", false, 1, 1, 250),
                new Student4("CCC", true, 1, 1, 200),
                new Student4("DDD", false, 1, 2, 150),
                new Student4("EEE", true, 1, 2, 100),
                new Student4("FFF", false, 1, 2, 50),
                new Student4("GGG", false, 1, 3, 100),
                new Student4("HHH", false, 1, 3, 150),
                new Student4("III", true, 1, 3, 200),

                new Student4("AAA", true, 2, 1, 300),
                new Student4("BBB", false, 2, 1, 250),
                new Student4("CCC", true, 2, 1, 200),
                new Student4("DDD", false, 2, 2, 150),
                new Student4("EEE", true, 2, 2, 100),
                new Student4("FFF", false, 2, 2, 50),
                new Student4("GGG", false, 2, 3, 100),
                new Student4("HHH", false, 2, 3, 150),
                new Student4("III", true, 2, 3, 200),
        };

        System.out.printf("1. Simple Partitioning(By Sex)\n");
        Map<Boolean, List<Student4>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student4::isMale));

        List<Student4> maleStudent      = stuBySex.get(true);
        List<Student4> femaleStudent    = stuBySex.get(false);

        for(Student4 s : maleStudent)
            System.out.println(s);

        for(Student4 s : femaleStudent)
            System.out.println(s);

        System.out.printf("\n2. Simple Partitioning(By Sex) + Statistics(Number of students)\n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student4::isMale, counting()));
        System.out.println("Male Student    : " + stuNumBySex.get(true));
        System.out.println("Female Student  : " + stuNumBySex.get(false));

        System.out.printf("\n3. Simple Partitioning(By Sex) + Statistics(Top of students)\n");
        Map<Boolean, Optional<Student4>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale,
                        maxBy(comparing(Student4::getScore))));

        System.out.println("Top male        : " + topScoreBySex.get(true));
        System.out.println("Top female      : " + topScoreBySex.get(false));


        Map<Boolean, Student4> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale,
                        collectingAndThen(
                                maxBy(comparingInt(Student4::getScore)), Optional::get
                        )));

        System.out.println("Top male        : " + topScoreBySex2.get(true));
        System.out.println("Top female      : " + topScoreBySex2.get(false));

        System.out.println("\n4. Multi-Partitioning(By Sex & By Failed score)");
        Map<Boolean, Map<Boolean, List<Student4>>> failedStuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale,
                        partitioningBy(s -> s.getScore() <= 100)));

        List<Student4> failedMale = failedStuBySex.get(true).get(true);
        List<Student4> failedFemale = failedStuBySex.get(false).get(true);

        for(Student4 s : failedMale)
            System.out.println(s);
        for(Student4 s : failedFemale)
            System.out.println(s);
    }
}
