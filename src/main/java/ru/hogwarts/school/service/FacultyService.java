package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;

import java.util.Set;

@Service
public class FacultyService {
//
//    private final FacultyRepository facultyRepository;
//
//    public FacultyService(FacultyRepository facultyRepository) {
//        this.facultyRepository = facultyRepository;
//    }
//
//    public Faculty createFaculty(Faculty faculty){
//        return facultyRepository.save(faculty);
//    }
//
//    public Faculty findFaculty(long id){
//
//        return facultyRepository.findById(id).orElseThrow();
//    }
//
//    public Faculty editFaculty(Faculty faculty){
//        return facultyRepository.save(faculty);
//    }
//
//    public void deleteFaculty(long id){
//        facultyRepository.deleteById(id);
//    }
//
//    public Set<Faculty> findByColor(String color) {
//        return facultyRepository.findAll(color);
//    }
//
//    public Set<Faculty> findByColorOrNameIgnoreCase(String color, String name) {
//        return facultyRepository.findAll(color, name);
//    }
}
