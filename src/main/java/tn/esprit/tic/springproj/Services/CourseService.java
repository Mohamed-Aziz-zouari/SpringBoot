package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.CourseRepository;

@Service
@AllArgsConstructor
public class CourseService implements IcourseService {
    CourseRepository courseRepository;
}
