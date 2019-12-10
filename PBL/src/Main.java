
public class Main {

	public static void main(String[] args) {
		Movie movie1=new Movie("恐怖片",Movie.REGULAR);
		Rental rental1=new Rental(movie1,100);
		Customer customer=new Customer("小明");
		customer.addRental(rental1);
		System.out.println(customer.statement());
		// TODO 自动生成的方法存根
	}

}
