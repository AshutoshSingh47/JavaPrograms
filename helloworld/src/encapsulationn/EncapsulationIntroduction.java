package encapsulationn;
import java.util.Scanner;
public class EncapsulationIntroduction {
	private String name;
	private long rollno;
	private int age;
public void setname(String name)
{
	this.name=name;
}
public String getname()
{
	return name;
}

	public long getRollno() {
	return rollno;
}

public void setRollno(long rollno) {
	this.rollno = rollno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EncapsulationIntroduction intro=new EncapsulationIntroduction();
String name;int age;
long rollno;
System.out.println("enter the name");
name =sc.nextLine();
System.out.println("enter the age");
age=sc.nextInt();
System.out.println("enter the roll no");
rollno=sc.nextLong();
intro.setname(name);
intro.setRollno(rollno);
intro.setAge(age);
System.out.println("NAME = "+intro.getname()+'\n'+"AGE = "+intro.getAge()+'\n'+"ROLL NO = "+intro.getRollno());

	}

}
