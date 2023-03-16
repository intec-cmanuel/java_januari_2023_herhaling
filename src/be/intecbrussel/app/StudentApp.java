package be.intecbrussel.app;

import be.intecbrussel.enums.AttendenceStatus;
import be.intecbrussel.enums.SchoolDay;
import be.intecbrussel.model.Student;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentApp {
    public static void main(String[] args) {
        Student jean = new Student();
        jean.name = "Jean Jaques";

        Student bob = new Student();
        bob.name = "Bob et Bobette";

        jean.presentOrLateOrAbsent = AttendenceStatus.ABSENT;
        bob.presentOrLateOrAbsent = AttendenceStatus.ABSENT;

        jean.schoolDay = SchoolDay.THURSDAY;
        bob.schoolDay = SchoolDay.FRIDAY;

        System.out.println(String.format("%s is %s and this morning we will do %s",
                jean.name,
                jean.presentOrLateOrAbsent.toString().toLowerCase(),
                jean.schoolDay.getMorningTask()
        ));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        };

        Predicate<String> predicate2 =(String s) -> {
            return s.length() > 3;
        };

        Predicate<String> predicate3 = s -> s.length() > 3;

        System.out.println(predicate.getClass());
        System.out.println(predicate2.getClass());

        Stream.of(new String[]{"bob", "Jean", "Bernadette"})
                .filter(predicate)
                .forEach(System.out::println);
    }
}
