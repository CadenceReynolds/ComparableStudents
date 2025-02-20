import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var reverseGrade = new GradeComparator().reversed();
        GradeComparator grade = new GradeComparator();
        AgeComparator age = new AgeComparator();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bobby", 12, 18));
        students.add(new Student("guy", 12, 17));
        students.add(new Student("bob", 11, 17));
        students.add(new Student("Joe", 10, 16));


        students.sort(reverseGrade.thenComparing(age));
        System.out.print(students);


    }
}