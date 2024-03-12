package bitlab.techorda.g1.springfirst.controller;

import bitlab.techorda.g1.springfirst.db.DbManager;
import bitlab.techorda.g1.springfirst.db.DbStudentManager;
import bitlab.techorda.g1.springfirst.model.Developer;
import bitlab.techorda.g1.springfirst.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        List<Student> studentList = DbStudentManager.getStudentList();
        model.addAttribute("studenty", studentList);
        return "home";
    }

    @PostMapping("/students/add")
    public String addStudent(Student student){
        DbStudentManager.createStudent(student);
        return "redirect:/";
    }

    @GetMapping( "/add-student")
    public String addStudent(Model model){
        return "add-student";
    }

    @GetMapping( "/demo")
    public String demoPage(Model model){
        return "demo";
    }
}
