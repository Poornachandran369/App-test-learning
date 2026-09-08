package com.poorna.student.Management.mapper;


import com.poorna.student.Management.dto.StudentDto;
import com.poorna.student.Management.model.Student;

public class StudentMapper {

    public static StudentDto toStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(student.getStudentId());
        studentDto.setName(studentDto.getName());
        studentDto.setAge(studentDto.getAge());
        studentDto.setDepartment(studentDto.getDepartment());
        studentDto.setEmail(student.getEmail());
        studentDto.setGender(studentDto.getGender());
        studentDto.setMobileNum(student.getMobileNum());

        return studentDto;
    }
}
