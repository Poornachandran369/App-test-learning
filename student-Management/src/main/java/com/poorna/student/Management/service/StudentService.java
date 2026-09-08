package com.poorna.student.Management.service;
import com.poorna.student.Management.dto.StudentDto;
import com.poorna.student.Management.mapper.StudentMapper;
import com.poorna.student.Management.model.Student;
import com.poorna.student.Management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<StudentDto> getStudentById(long id) {
        return Optional.of(StudentMapper.toStudentDto(studentRepository.getById(id)));
    }

    public String deleteStudentById(long id){
         studentRepository.deleteById(id);
        return "Deleted successfully";
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
