
public class Example7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Dog dog=new Dog();
       dog.shout();
	}
}
class Animal{
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	void shout() {
		System.out.println("汪汪汪。。。");
	}
}