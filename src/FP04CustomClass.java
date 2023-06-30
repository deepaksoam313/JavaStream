import java.sql.SQLOutput;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                name + ", " +
                category + ", " +
                reviewScore +", "+
                noOfStudents +
                '}';
    }
}

public class FP04CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of( new Course("Spring","Framework",98,12000),
                new Course("Spring","MVC",92,11000),
                new Course("AWS","Cloud",92,10000),
                new Course("GCP","Cloud",93,13000),
                new Course("Java","Programming",94,12000),
                new Course("Cpp","Programming",96,10000));

        //noneMatch , anyMatch, allMAtch
        System.out.println(
                courses.stream()
                        .anyMatch(course -> course.getReviewScore() >95)

        );

        System.out.println(
                courses.stream()
                        .noneMatch(course -> course.getReviewScore() > 92)

        );

        System.out.println(
                courses.stream()
                        .allMatch(course -> course.getReviewScore() > 92)

        );

        //sorted and comparator
        //Increasing in review score increment
        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getReviewScore))
                        .toList()
        );

        //Decreasing in review score increment
        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getReviewScore).reversed())
                        .collect(Collectors.toList())
        );
        //[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=12000}, Course{name='Cpp', category='Programming', reviewScore=96, noOfStudents=10000}, Course{name='AWS', category='Cloud', reviewScore=95, noOfStudents=11000}, Course{name='Java', category='Programming', reviewScore=94, noOfStudents=12000}, Course{name='GCP', category='Cloud', reviewScore=93, noOfStudents=13000}, Course{name='Spring', category='MVC', reviewScore=92, noOfStudents=10000}]

        //if reveiw Score is equal then compare with noOfStudents (will come first)
        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getReviewScore).thenComparing(Course::getNoOfStudents))
                        .collect(Collectors.toList())
        );

        //print only first three
        //Increasing in review score increment
        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getReviewScore))
                        .limit(4)
                        .toList()
        );

        //want to skip first three results
        //Increasing in review score increment
        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getReviewScore))
                        .skip(3)
                        .toList()
        );

        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore()>90)
                        .toList()
        );

        //print until the criteria gets meet the condition
        System.out.println(
            courses.stream()
                    .takeWhile(course -> course.getReviewScore()>94)
                    .collect(Collectors.toList()));

        //Opposite to takewhile as well as condition is true it will skip the values
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore()>94)
                        .mapToInt(Course::getNoOfStudents)
                        .average()
                       );

        System.out.println(
                courses.stream()
                    .mapToInt(Course::getReviewScore)
                    .sum());

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));
       // {Cloud=[Course{AWS, Cloud, 92, 10000}, Course{GCP, Cloud, 93, 13000}],
        // Programming=[Course{Java, Programming, 94, 12000}, Course{Cpp, Programming, 96, 10000}],
        // MVC=[Course{Spring, MVC, 92, 11000}],
        // Framework=[Course{Spring, Framework, 98, 12000}]}

        System.out.println(
            courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
        );
        //{Cloud=2, Programming=2, MVC=1, Framework=1}

        System.out.println(
        courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory,
                        Collectors.maxBy(Comparator.comparing(Course::getReviewScore)) ))
        );
        //{Cloud=Optional[Course{GCP, Cloud, 93, 13000}],
        // Programming=Optional[Course{Cpp, Programming, 96, 10000}],
        // MVC=Optional[Course{Spring, MVC, 92, 11000}],
        // Framework=Optional[Course{Spring, Framework, 98, 12000}]}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.mapping(course -> course.getName() , Collectors.toList())))
        );
        //{Cloud=[AWS, GCP], Programming=[Java, Cpp], MVC=[Spring], Framework=[Spring]}

    }//main
}
