class C
{
static int test1()
{
System.out.println("from test1");
return 100;
}
static
{
System.out.println("C-SIB_COUNT-1");
}
static int test2()
{
System.out.println("from test2");
return test1();
}
static int i = test2();
public static void main(String[]args)
{
test1();
System.out.println("--------");
System.out.println(test2());
System.out.println("--------");
System.out.println(test2()+test1());
System.out.println("--------");
test2();
}
static
{
System.out.println("C-SIB_COUNT-2");
}
}