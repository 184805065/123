class Person{
	int age;
	public Person(int a) {
		age=a;
	}
	public void speak() {
		System.out.println("I am "+age+" years old.!");
	}
}
    public class Example4{
     public static void main(String args[]){
         Person p=new Person(20);
         p.speak();
     }
    }