package main.java;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("vardenis", "n/a", 1.0, "kitm");

        StudentDAO.insert(student);
        //ArrayList <main.java.Student>studentai = main.java.StudentDAO.searchById(9);

        // System.out.println("Spausdinamas Array Listas: "+ studentai);

//        main.java.Student studentDB= studentai.get(0);
//        studentDB.setVardas("Jonelis");
//        main.java.StudentDAO.update(studentDB);
        //main.java.StudentDAO.delete(9);
    }
}
