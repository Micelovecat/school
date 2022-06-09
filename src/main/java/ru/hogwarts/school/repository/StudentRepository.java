package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Student;

import java.util.Optional;
import java.util.Set;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Object> findById(long id);

    void deleteById(long id);

    Set<Student> findStudentsByAgeIs(Integer age);

    Set<Student> findByAgeBetween(Integer minAge, Integer maxAge);
}
