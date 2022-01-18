interface inf1
{
void dis();
}

class impl1 implements inf1
{

@Override
public void dis()
{
System.out.println("welcome");
}
}

class lam1
{
public static void main(String []args)
{
impl1 ob=new impl1();
ob.dis();
}
}
