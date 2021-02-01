class K
{
K()
{
System.out.println("K()");
}
{
System.out.println("IIB1");
}
{
System.out.println("IIB2");
}
public static void main(String[] args)
{
K k1 = new K();
System.out.println("---------");
K k2 = new K();
System.out.println("---------");
}
}