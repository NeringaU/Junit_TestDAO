package test.java;

import main.java.Student;
import main.java.StudentDAO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestDAO {
    Student studentLocal; // globalus parametras naudoti klases ribose

    @Before
    public void setupStudent() {
        studentLocal = new Student("vandenis", "n/a", 1.0, "kitm");
    }

    @Test
    public void testInsert() {
        StudentDAO.insert(studentLocal);
        ArrayList<Student> studentai = StudentDAO.searchByName("vandenis");

        Student studentDb= studentai.get(0);
        asertSudentsEqual(studentLocal,studentDb);
    }

    @After
    public void deleteByNameLastDataInsertion(){
        StudentDAO.deleteByName(studentLocal.getVardas());
    }

    private void asertSudentsEqual(Student local,Student db){
            Assert.assertEquals(local.getVardas(),db.getVardas());
            Assert.assertEquals(local.getGrupe(),db.getGrupe());
            Assert.assertEquals(local.getMokykla(),db.getMokykla());
            Assert.assertEquals(local.getVidurkis(),db.getVidurkis(),0.01);
    }
}
