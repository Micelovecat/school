package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Faculty;

import java.util.Optional;
import java.util.Set;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

//    Optional<Object> findById(long id);

      Set<Faculty> findByNameIgnoreCase(String name);



//    Set<Faculty> findFacultyByColor(String color);

//    Set<Faculty> findByFaculty(Long id);
//
//    Faculty getAllFaculty();
//    Faculty findFacultyById(Long id);

//    Set<Faculty> findById(long id);
//    Set<Faculty> findAll(String color, String name);
//    Set<Faculty> findAll(String color);
//
}
