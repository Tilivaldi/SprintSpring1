package bitlab.techorda.g1.springfirst.db;

import bitlab.techorda.g1.springfirst.model.Developer;
import bitlab.techorda.g1.springfirst.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class DbManager {

    @Getter
    private static List<Developer> developers = new ArrayList<>();
    private static Long id = 10L;
    static {
        developers.add(new Developer(1L, "Tilivaldi", 31, "Almaty"));
        developers.add(new Developer(2L, "Daryn", 31, "Astana"));
        developers.add(new Developer(3L, "Daulet", 31, "Almaty"));
        developers.add(new Developer(4L, "Dina", 31, "Almaty"));
        developers.add(new Developer(5L, "Gulshat", 31, "Almaty"));
        developers.add(new Developer(6L, "Assel", 31, "Almaty"));
        developers.add(new Developer(7L, "Azhar", 31, "Almaty"));
        developers.add(new Developer(8L, "Kylyash", 31, "Almaty"));
        developers.add(new Developer(9L, "Zhansaya", 31, "Almaty"));
    }

    public static void createDeveloper(Developer developer) {
        developer.setId(id);
        id++;
        developers.add(developer);
    }

}
