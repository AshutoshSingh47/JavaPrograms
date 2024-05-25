package keywords;
import java.util.Scanner;
public class use_super {
	int speed=30;
	public static void main(String[] args) {
		int speed;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed of car");
		speed=sc.nextInt();
		System.out.println("Main speed = "+speed);
		car use=new car();
		use.speed_ofCar();
		
		
		
		
	}
}
	class car extends use_super
	{int speed=80;
		public void speed_ofCar()
		{System.out.println("function speed = "+speed);
			System.out.println("Super speed = "+super.speed);
		}
	
	}


