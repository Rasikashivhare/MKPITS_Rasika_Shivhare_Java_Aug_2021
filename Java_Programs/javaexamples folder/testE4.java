//example of encapsulation


class Calculate
{
private float roi;
//getter method
public String getName()
{
return name;
}
//setter method
public void setRoi(float roi)
{
this.roi=roi;
}
public float calinterest(float pa,int nom)
{
float pi=pa*roi*nom;
return pi;
}
}


class testE4
{
public static void main(String arg[])
{
Calculate t=new Calculate();
t.setRoi(20);
//System.out.println("roi=" + t.getRoi());
float ta=t.calinterest(1000,12);
System.out.println("total amount with interest"+ta);
}
}
