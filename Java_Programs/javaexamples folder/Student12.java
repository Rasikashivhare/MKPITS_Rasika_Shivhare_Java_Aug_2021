//example of serializable

import java.io.Serializable;
public class Student12 implements Serializable
{
int id;
String name;
Address address;//HAS-A
public Student12 (int id, String name)
{
this.id = id;
this.name = name;
}
}