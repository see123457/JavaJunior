import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, 3.5);
        try {
            ObjectMapper xmlMapper = new XmlMapper();
            String xmlString = xmlMapper.writeValueAsString(student);
            Files.write(Paths.get("student.xml"), xmlString.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            String jsonString = jsonMapper.writeValueAsString(student);
            Files.write(Paths.get("student.json"), jsonString.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectMapper xmlMapper = new XmlMapper();
            Student deserializedXmlStudent = xmlMapper.readValue(new File("student.xml"), Student.class);
            deserializedXmlStudent.printInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            Student deserializedJsonStudent = jsonMapper.readValue(new File("student.json"), Student.class);
            deserializedJsonStudent.printInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}