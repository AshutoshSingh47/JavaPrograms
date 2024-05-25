package interfaces;
public class Person implements YouTuber,Student 
{
	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.makeVideo();
		obj.editVideo();
		}
	public void study()
	{
		System.out.println("student is studying");
	}
	public void makeVideo()
	{
		System.out.println("You tuber is making video");
	}
	public void editVideo() {
		System.out.println("The Editor is editing the video");
		
	}
}
