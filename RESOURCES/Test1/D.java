class D
{
static int i, ii;
static int test()
{
	ii = 0;
return ii++ + ++i + --ii + i--;
}
public static void main(String[]args)
{
i = 40;
System.out.println(test());
System.out.println(i);
System.out.println(ii);
}
}