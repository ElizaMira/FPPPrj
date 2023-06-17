package Assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {


		HashMap<Key,Student> studentMap=new HashMap<>();

		for (Student std:students) {
			studentMap.put(new Key(std.getFirstName(), std.getLastName()), std);
		}

		return studentMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGPA=0.0;
		double averageGPA=0.0;
		Set<Key> keys=maps.keySet();
		for(Key key:keys)
		{
			totalGPA+=maps.get(key).getGpa();
			averageGPA=totalGPA/ maps.size();
		}
		return averageGPA;
}
}
