package arrayfunctions;
import java.util.Scanner;
public class multiplication_ofarray {

	public static void main(String[] args) {
    int row,column;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of row");
    row=sc.nextInt();
    System.out.println("enter the size of  column");
    column=sc.nextInt();
   if(row==column)
   {
	   multiply.get_input(row,column);
   }
   else
   {
	   System.out.println("ERROR : SIZE OF ROW AND COLUMN SHOULD NOT BE DIFFERENT");
   }


	}

}
