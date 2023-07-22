package Ch14;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by Sang Jun Park on 7/17/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class Student5 {
    String name;
    boolean isMale;
    int grade;
    int classNum;
    int score;

    Student5(String name, boolean isMale, int grade, int classNum, int score){
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
public class StreamEx8 {
    public static void main(String[] args) {
        Student5[] stuArr = {
                new Student5("AAA", true, 1, 1, 300),
                new Student5("BBB", false, 1, 1, 250),
                new Student5("CCC", true, 1, 1, 200),
                new Student5("DDD", false, 1, 2, 150),
                new Student5("EEE", true, 1, 2, 100),
                new Student5("FFF", false, 1, 2, 50),
                new Student5("GGG", false, 1, 3, 100),
                new Student5("HHH", false, 1, 3, 150),
                new Student5("III", true, 1, 3, 200),

                new Student5("AAA", true, 2, 1, 300),
                new Student5("BBB", false, 2, 1, 250),
                new Student5("CCC", true, 2, 1, 200),
                new Student5("DDD", false, 2, 2, 150),
                new Student5("EEE", true, 2, 2, 100),
                new Student5("FFF", false, 2, 2, 50),
                new Student5("GGG", false, 2, 3, 100),
                new Student5("HHH", false, 2, 3, 150),
                new Student5("III", true, 2, 3, 200),
        };

        System.out.printf("1. Simple Grouping(By Class Number)\n");
        Map<Integer, List<Student5>> stuByClassNum= Stream.of(stuArr).collect(groupingBy(Student5::getClassNum));

        for(List<Student5> classNumber : stuByClassNum.values()){
            for(Student5 s : classNumber)
                System.out.println(s);
        }


        System.out.printf("\n2. Simple Grouping(By score)\n");
        Map<Student5.Level, List<Student5>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                         if(s.getScore() >= 200) return Student5.Level.HIGH;
                    else if(s.getScore() >= 100) return Student5.Level.MID;
                    else                         return Student5.Level.LOW;
                }));

        TreeSet<Student5.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for(Student5.Level key : keySet){
            System.out.println("[" + key + "]");

            for(Student5 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

        System.out.printf("\n3. Simple Grouping(By score) + Statistics(Number of students)\n");
        Map<Student5.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if(s.getScore() >= 200) return Student5.Level.HIGH;
                    else if(s.getScore() >= 100) return Student5.Level.MID;
                    else                         return Student5.Level.LOW;
                }, counting()));

        for(Student5.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s] - %d,", key, stuCntByLevel.get(key));
        System.out.println();

        /*for(List<Student5> level : stuByLevel.values()){
            System.out.println();
            for(Student5 s : level)
                System.out.println(s);
        }*/

        System.out.printf("\n4. Multi-Grouping(Grade, classNum)");
        Map<Integer, Map<Integer, List<Student5>>> stuByGradeAndClassNum = Stream.of(stuArr)
                .collect(groupingBy(Student5::getGrade, groupingBy(Student5::getClassNum)));

        for(Map<Integer, List<Student5>> grade : stuByGradeAndClassNum.values()){
            for(List<Student5> classNum : grade.values()){
                System.out.println();
                for(Student5 s : classNum)
                    System.out.println(s);
            }
        }

        System.out.printf("\n5. Multi-Grouping + Statistics(Grade, top score in classNum)\n");
        Map<Integer, Map<Integer, Student5>> topStuByGradeAndClassNum = Stream.of(stuArr)
                .collect(groupingBy(Student5::getGrade,
                        groupingBy(Student5::getClassNum,
                                collectingAndThen(
                                        maxBy(comparingInt(Student5::getScore))
                                        , Optional::get
                                ))));

        for(Map<Integer, Student5> classNum : topStuByGradeAndClassNum.values()){
            for(Student5 s : classNum.values())
                System.out.println(s);
        }

        System.out.printf("\n6. Multi-Grouping + Statistics(Grade, Score Group in classNum)\n");
        Map<String, Set<Student5.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getGrade() + "-" + s.getClassNum(),
                        mapping(s -> {
                                 if(s.getScore() >= 200) return Student5.Level.HIGH;
                            else if(s.getScore() >= 100) return Student5.Level.MID;
                            else                         return Student5.Level.LOW;
                        }, toSet())));

        Set<String> ketSet2 = stuByScoreGroup.keySet();
        for(String key : ketSet2)
            System.out.println("[" + key + "]" + stuByScoreGroup.get(key));

    }
}
