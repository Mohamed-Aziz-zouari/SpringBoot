package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Course;
import tn.esprit.tic.springproj.entities.Equipe;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
