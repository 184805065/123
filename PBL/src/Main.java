
public class Main {

	public static void main(String[] args) {
		Movie movie1=new Movie("�ֲ�Ƭ",Movie.REGULAR);
		Rental rental1=new Rental(movie1,100);
		Customer customer=new Customer("С��");
		customer.addRental(rental1);
		System.out.println(customer.statement());
		// TODO �Զ����ɵķ������
	}

}
