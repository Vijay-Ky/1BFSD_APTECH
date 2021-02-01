class I
{
I(int i)
{
System.out.println("I(int)");
}
}
class J extends I
{
J(int i)
	{
super(i);
System.out.println("J(int)");
}
J()
{
super(10);
System.out.println("J()");
}
public static void main(String[]args)
{
I c1 = new I(10);
System.out.println("-------");
J d1 = new J(20);
System.out.println("-------");
J d2 = new J();
System.out.println("-------");
}
}