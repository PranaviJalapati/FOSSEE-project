import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Student implements Comparator< Student >, Comparable< Student >{
	private String name;
	private String r;
	private int l1;
	private int l2;
	private int m;
	private int s;
	private int es;
	private int total;
	Student(){
	}
	Student(String n, String roll, int lang1, int lang2, int math, int sci, int enst){
		name=n;
		r=roll;
		l1=lang1;
		l2=lang2;
		m=math;
		s=sci;
		es=enst;
		total = (l1+l2+m+s+es);
	}
	public String getStudentName(){
		return name;
	}
	//public int getStudenttot(){
	//	return total;
	//}
	// Overriding the compareTo method
	public int compareTo(Student d){
		return (this.name).compareTo(d.name);
	}
	// Overriding the compare method to sort the age 
	public int compare(Student d, Student d1){
		if(d.total != d1.total) return d1.total - d.total;
		if(d.m != d1.m) return d1.m- d.m;
		if(d.s != d1.s) return d1.s-d.s;
		if(d.es != d1.es) return d1.es-d.es;
		if(d.l1 != d1.l1) return d1.l1-d.l1;
		return d1.l2-d.l2;
		
	}
}
public class ranking_system{
	public static void main(String args[]){
		// Takes a list o Student objects
		int i=1;
		//List< Student> lists = new ArrayList<Student>();
		//List<String> list = FileUtils.readLines(new File("/path/to/file.txt"), "utf-8");
		Scanner s = new Scanner(new File("data.txt"));
		List<Student> list = new ArrayList<Student>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		s.close(); 
		//list.add(new Student("A","R1",90,80,88,78,58));
		//list.add(new Student("B","R2",60,80,88,77,89));
		//list.add(new Student("C","R3",80,58,88,78,90));
		//list.add(new Student("D","R4",100,90,98,97,98));
		//list.add(new Student("E","R5",100,90,98,97,99));
		Collections.sort(list);// Sorts the array list
		for(Student a: list)//printing the sorted list of names
		System.out.print(a.getStudentName() + ", ");
		// Sorts the array list using comparator
		Collections.sort(list, new Student());
		System.out.println(" ");
		for(Student a: list){//printing the sorted list of ages
			System.out.println(a.getStudentName() +" : "+ i );
			i++;
		}
	
	}
}