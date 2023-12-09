import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Student {
    private String name;
    private int age;
    private double GPA;

    // Конструктор, геттеры и сеттеры

    public void serializeToJSON(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), this);
            System.out.println("Object has been serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromJSON(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(fileName), Student.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String jsonFileName = "student.json";
        Student student = new Student("John Doe", 20, 3.5);
        student.serializeToJSON(jsonFileName);

        Student deserializedStudent = Student.deserializeFromJSON(jsonFileName);
        if(deserializedStudent != null) {
            // TODO: Выведите информацию о десериализованном объекте
        }
    }
}
