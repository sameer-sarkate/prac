package prac;

class calc{
	public calc()
	{
		System.out.println("in calc");
	}
	
	int add(int i, int j)
	{
		int x;
		x=i+j;
		System.out.println(x);
		return x;
	}
	
	int add(int i,int j,int k) {
		int x;
		x=i+j+k;
		System.out.print(x);
		return x;
	}
}

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj= new calc();
		obj.add(9, 8);
		obj.add(10, 20, 30);
		

	}

}
