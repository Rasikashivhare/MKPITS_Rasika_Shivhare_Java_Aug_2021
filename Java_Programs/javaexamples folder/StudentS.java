//example of serializable

import java.io.Serializable;
public class StudentS implements Serializable
{
int id;
String name;
public StudentS(int id, String name)
{
this.id = id;
this.name = name;
}
}