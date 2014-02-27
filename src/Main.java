import java.util.ArrayList;
import java.util.Iterator;


public class Main {
private ArrayList<Student> students= new ArrayList<Student>();
private ArrayList<Team> teams= new ArrayList<Team>();
	public Main() {
		//ADD YOURSELF HERE with your Name, github email, and github username
		Student colin = new Student("Colin Holmes", "cholmes9320@wsc.ma.edu", "Holmes617");
		colin.canNotMeet(Day.FRIDAY); //Choose only the days you cannot meet
		colin.canNotMeet(Day.SATURDAY);
		colin.canNotMeet(Day.SUNDAY);
		colin.preferTimeToMeet(Time.DAY); // Choose Day/Night/Either
		addStudent(colin);
		
		//Add yourself below here, Do not delete other Users
		
	
		
		
		
		
		//finish add 
		printAllStudents();
	}

	public static void main(String[] args) {
      new Main();
	}
	
	private void addStudent(Student s){
		students.add(s);		
	}
	private void addStudentToTeam(Student s, int team){
		teams.get(team).addStudent(s);
	}

	private void printAllStudents(){
		Iterator<Student> i=students.iterator();
		while(i.hasNext()){
			i.next().printInfo();
		}
	}
}
