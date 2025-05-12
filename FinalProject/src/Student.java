class Student
{
 int id;
 String name;
 student(int id, String name)
{
 this.id = id;
 this.name = name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
 Student stud1 = new Student(01,"Tarun");
 Student stud2 = new Student(02,"Barun");
 stud1.display();
 stud2.display();
 }}