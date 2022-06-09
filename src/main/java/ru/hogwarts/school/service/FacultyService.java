package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;

import java.util.Set;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;
    private Long id;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }
    public Faculty findFaculty(Long id){
        return facultyRepository.findById(id).orElseThrow();
    }

    public Faculty editFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id){
        facultyRepository.deleteById(id);
    }

    public Set<Faculty> findByName(String name){
        return facultyRepository.findByNameIgnoreCase(name);
    }

//    public static Faculty findById(Long id) {
//        return (Faculty) facultyRepository.findFacultyId(id);
//    }

//    public FacultyRepository getFacultyRepository() {
//        return facultyRepository;
//    }
////
//
//    public Faculty findFacultyId(Long id) {
//        return (Faculty) facultyRepository.findById(String.valueOf(id)).orElseThrow();
//    }

//
//        public Faculty findById(Long id) {
//        return facultyRepository.findById(String.valueOf(id)).orElseThrow();
//    }


//
//    public Faculty findFacultyByName(String name){
//        return facultyRepository.findFacultyByName(name);
//    }
//
//    public Set<Faculty> findFacultyByColor(String color){
//        return facultyRepository.findFacultyByColor(color);
//    }
//
//    public Set<Faculty> findAllByColor(String color){
//        return facultyRepository.findAllByColor(color);
//    }
//
//    public Faculty getAllFaculty() {
//        return facultyRepository.getAllFaculty();
//    }
//
//    public Faculty findFaculty(Long id) {
//        return (Faculty) facultyRepository.findFacultyId(id);
//    }

//    public Class<? extends FacultyRepository> getAllFaculties() {
//        return facultyRepository.getClass();
//    }


//    public Set<Faculty> findByColor(String color) {
//        return facultyRepository.findAll(color);
//    }
//
//    public Set<Faculty> findByColorOrNameIgnoreCase(String color, String name) {
//        return facultyRepository.findAll(color, name);
//    }
}
