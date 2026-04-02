package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ChampionnatRepository;
import tn.esprit.tic.springproj.Repository.CourseRepository;
import tn.esprit.tic.springproj.Repository.DetailChampionnatRepository;
import tn.esprit.tic.springproj.entities.Championnat;
import tn.esprit.tic.springproj.entities.Course;
import tn.esprit.tic.springproj.entities.DetailChampionnat;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ChampionnatService implements IchampionnatService{
    ChampionnatRepository chRep;
    CourseRepository courseRep;
    DetailChampionnatRepository dtRep;
    public Championnat addChampionnat(Championnat ch) {
        return chRep.save(ch);
    }

    public DetailChampionnat ajouterDetailChampionnat(
            DetailChampionnat dc, Long idCh, Long idChampionnat) {

        Championnat ch = chRep.findById(idChampionnat).get();
        DetailChampionnat dt = dtRep.save(dc);

        ch.setChampionnatDetail(dt);
        chRep.save(ch);

        return dt;
    }

    public String affecterCourseAChampionnat(Long idCourse, Long idChampionnat) {

        Course c = courseRep.findById(idCourse).get();
        Championnat ch = chRep.findById(idChampionnat).get();

        List<Course> courses = new ArrayList<>();

        if (ch.getCourses() != null) {
            courses.addAll(ch.getCourses());
        }

        courses.add(c);
        ch.setCourses(courses);

        chRep.save(ch);

        return "success";
    }

}
