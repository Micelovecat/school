package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Faculty;

import java.util.Optional;
import java.util.Set;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
//    Set<Faculty> findAll(String color, String name);
//
//    Set<Faculty> findAll(String color);
//
//    Set<Faculty> findById(String name);
}
