
public class Example7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       Dog dog=new Dog();
       dog.shout();
	}
}
class Animal{
	void shout() {
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	void shout() {
		System.out.println("������������");
	}
}