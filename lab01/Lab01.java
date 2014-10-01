/* LabO1.java */
import laboratorios.lab01.teacher.Teacher;
import laboratorios.lab01.student.Student;

public class Lab01 {
	
    public static void main(String[] args) {
	if (args.length > 0) {
	    if  (args[0].matches("-?\\d+")) {
		Teacher t = new Teacher("Techaer");
		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
		    t.addStudent(new Student("Student #" + i));
		}
		t.teach();
	    } else {
		System.out.println("El valor que ha indicado, no es un numero.");
	    }	    
	} else {
	    System.out.println("Debe indicar un valor entero que represente la cantidad de estudiantes en el salon de clases");
	}
    }
}
