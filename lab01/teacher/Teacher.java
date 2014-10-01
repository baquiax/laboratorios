/* Teacher.java */
package laboratorios.lab01.teacher;
import laboratorios.lab01.Human;
import laboratorios.lab01.student.Student;
import java.util.ArrayList;

public class Teacher extends Human {
    private String name; 
    private ArrayList<Student> students;
    
    public Teacher(String name) {
	this.name = name;
	this.students = new ArrayList<Student>();
    }
    
    public void addStudent(Student s) {
	this.students.add(s);
    }
    
    public void teach() {
	System.out.println(this + " is teching ");
	for (Student student : this.students) {
	    student.learn();
	}
    }
    
    public String toString() {
	return this.name;
    }
}
