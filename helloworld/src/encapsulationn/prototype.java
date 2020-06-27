package encapsulationn;

public class prototype {

	public static void main(String[] args) {
		EncapsulationIntroduction intro = new EncapsulationIntroduction();
		String name="ASHUTOSH SINGH";
		int age=19;
		long rollno=123456789;
		intro.setname(name);
		intro.setRollno(rollno);
		intro.setAge(age);
		System.out.println("NAME = "+intro.getname()+'\n'+"AGE = "+intro.getAge()+'\n'+"ROLL NO = "+intro.getRollno());
	}

}
