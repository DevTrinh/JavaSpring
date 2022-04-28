package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<student> getStudents(){
        return List.of(
                new student("Trinh van manh",
                        "trinhmanhdiv@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,10),
                        19)
        );
    }
}
