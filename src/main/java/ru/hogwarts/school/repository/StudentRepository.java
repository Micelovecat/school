package ru.hogwarts.school.repository;

import ru.hogwarts.school.model.Student;

import java.util.Optional;

public interface StudentRepository {
    Student save(Student student);

    Optional<Object> findById(long id);

    void deleteById(long id);

    Object findByAgeBetween(Integer age);

    Object findByAgeBetween(Integer minAge, Integer maxAge);
}
