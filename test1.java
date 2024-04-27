 class Test1
{
	  int a=20;
	 static int b=30;
	
	public void m1()
	{
		System.out.println(" value of a"+a);
		
	}
	public static void m2()
	{
		System.out.println(" value of a"+b);

	}

	public static void main(String args[])
	{
		Test1.m2();
		Test1 ob=new Test1();
		ob.m1();
		


	}
}