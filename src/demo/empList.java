package demo;

import java.util.ArrayList;
import java.util.Iterator;

class Emp{
	int salary;
	String name;
	Emp(int i,String g){
		this.salary=i;
		this.name=g;
	}
}
class maxSalary{
	public static void main(String []args) {
		ArrayList<Emp> a= new ArrayList<Emp>();
		a.add(new Emp(6000,"riyaj"));
		a.add(new Emp(4000,"shaikh"));
	
		
		Iterator<Emp> i = a.iterator();
		int maxSalary = 0;
		int sal = 0;
		while(i.hasNext()) {
			Emp e = i.next();
			sal = e.salary;
			if (sal>maxSalary) {
				maxSalary =sal;
			}
		}
		System.out.println("Max Slary is:" +maxSalary);
		System.out.println("Tester 1");
		System.out.println("Tester 1");
	}
}