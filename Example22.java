// ����Animal��
class Animal {
    // ��дObject���toString()����
	public String toString() {     
		return "I am an animal";
	}
}
// ���������
public class Example22 {
	public static void main(String[] args) {
		Animal animal = new Animal();             // ����Animal����
		System.out.println(animal.toString()); // ��ӡanimal��toString()�����ķ���ֵ
	}
}
