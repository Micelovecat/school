package ru.hogwarts.school.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("faculty")
public class FacultyController {
//
//    private final FacultyService facultyService;
//
//    public FacultyController(FacultyService facultyService) {
//        this.facultyService = facultyService;
//    }


//    @GetMapping("{id}")
//    public Object getStudent(@PathVariable Long id){
//        Student student = studentService.findStudent(id);
//        if (student == null){
//            final HttpStatus notFound = HttpStatus.NOT_FOUND;
//            return (HttpStatus.NOT_FOUND);
//        }
//        return student;
//    }
}
