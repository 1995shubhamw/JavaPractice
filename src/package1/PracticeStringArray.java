package package1;

public class PracticeStringArray {

	public static void main(String[] args) {
		
		String [] name= {"shubh", "panu","lalit", "chinu"};
		
		// 1.0
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		//1.2
		
//		for(String s: name)
//		{
//			System.out.println( s);
//		}
		
		
		
		//2.0 Array-even-odd
		
		int array[]= {11,12,13,14,15,16,17,18,19,20};
		for (int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
			System.out.println(array[i] + "-Even number");
			}
			else {
				System.out.println(array[i]+"-odd number ");
			}
		}
			
	}

}
