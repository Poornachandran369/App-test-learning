package com.poorna.student.Management.controller;

import com.poorna.student.Management.dto.StudentDto;
import com.poorna.student.Management.model.Student;
import com.poorna.student.Management.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student s){
        studentService.addStudent(s);
        return "Operation success";
    }

    @GetMapping("/student/{id}")
    public Optional<StudentDto> getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable long id) {
        return studentService.deleteStudentById(id);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
