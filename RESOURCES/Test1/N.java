class M
{
 static int i;
 static void test1()
 {
 System.out.println("E-test1()");
 }
}
class N extends M
{
 static int j;
 static void test2()
 {
	 System.out.println("F-test2()");
 }
 public static void main(String[] args)
 {
 System.out.println(M.i);
 System.out.println(N.j);
 M.test1();
 N.test2();
 }
}