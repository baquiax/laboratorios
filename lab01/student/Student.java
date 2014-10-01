/*Student.java*/
package laboratorios.lab01.student;
import laboratorios.lab01.Human;

public class Student extends Human {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void learn() {
		System.out.println(this + " is learning");
	}
	
	public String toString() {
		return this.name;		
	}
}
