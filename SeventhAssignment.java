import java.util.Scanner;

public class SeventhAssignment {

	public static void main(String[] args) {
		
		
	Scanner n=new Scanner(System.in);
	System.out.println("enter the values");
	int x=n.nextInt();
	int y=n.nextInt();
	int z=n.nextInt();
	

	if(x>y && x>z)
	{
		System.out.println("x is highest");
		
	}
	else if(y>x && y>z)
	{
		System.out.println("y is highest");
	}
	else
	{
		
		System.out.println("z is highest");
	}
	
	}

}
