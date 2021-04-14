package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person teacher = new Person("Anna", 1, "Teacher");
    Person seniorStudent = new Person("Joe", 2, "Senior Student");
    Person juniorStudent = new Person("Sarah", 3, "Junior Student");

    @Test
    void getName() {
        assert (teacher.getName().equalsIgnoreCase("Anna"));
        assert (seniorStudent.getName().equalsIgnoreCase("Joe"));
        assert (juniorStudent.getName().equalsIgnoreCase("Sarah"));
    }


    @Test
    void getLevel() {
        assert (seniorStudent.getLevel() == 2);
        assert (juniorStudent.getLevel() == 3);
        assert (teacher.getLevel() == 1);
    }


    @Test
    void getRank() {
        assert (seniorStudent.getRank().equalsIgnoreCase("Senior Student"));
        assert (teacher.getRank().equalsIgnoreCase("Teacher"));
        assert (juniorStudent.getRank().equalsIgnoreCase("Junior Student"));



    }
}