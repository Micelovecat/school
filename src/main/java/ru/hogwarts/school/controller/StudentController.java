package ru.hogwarts.school.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Set;

@SuppressWarnings("ConstantConditions")
@RestController
@RequestMapping("student")

public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public Object getStudent(@PathVariable Long id){
        Student student = studentService.findStudent(id);
        if (student == null){
            final HttpStatus notFound = HttpStatus.NOT_FOUND;
            return (HttpStatus.NOT_FOUND);
        }
        return student;
    }

    @GetMapping(params = {"age"})
    public Set<Student> findStudentByAge(@RequestParam(required = false) Integer age){
        return studentService.findByAge(age);
    }

    @GetMapping(params = {"minAge", "maxAge"})
    public Set<Student> findByAgeBetween(@RequestParam(required = false) Integer minAge,
                                         @RequestParam(required = false) Integer maxAge) {
        return studentService.findByAgeBetween(minAge, maxAge);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping
    public ResponseEntity<Student> editStudent(@RequestBody Student student){
        Student foundStudent = studentService.editStudent(student);
        if (foundStudent == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foundStudent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

}
