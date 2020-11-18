package program;

import entities.Employe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employer = br.readLine();
            while (employer != null) {
                String [] fork = employer.split(",");
                list.add(new Employe(fork[0], Double.parseDouble(fork[1])));
                employer = br.readLine();
            }
            Collections.sort(list);
            for (Employe s : list) {
                System.out.println("Name: " + s.getName() + " - Salary: " + s.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
