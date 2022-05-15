package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.HashMap;

@Service
public class FacultyService {

    private HashMap<Long, Faculty> faculties = new HashMap<>();

}
