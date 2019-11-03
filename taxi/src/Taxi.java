import car.Car;
import factory.Factory;
import utility.XMLUtility;
class TaxiBase{
	private Car [] car=new Car[10];
	private int inPos,outPos;
	private int count=0;
	public TaxiBase() {
		Factory factory=(Factory)XMLUtility.getbean();
		for(int i=0;i<10;i++) {
			car[i]=factory.produceCar();
		}
	}
	public synchronized void come() {
		try {
			while(count==car.length) {
				this.wait();
			}
			System.out.println("����" + inPos + ", " + car[inPos].toString() + "���");
			inPos++;
			if(inPos==car.length)
				inPos=0;
			count++;
			Thread.sleep(1000);
			this.notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void go() {
		try {
			while(count==0) {
				this.wait();
			}
			System.out.println("����" + outPos + ", " + car[outPos].toString() + "���⡣�Ʒѷ���" + car[outPos].getRatio());
			outPos++;
			if(outPos==car.length)
				outPos=0;
			count--;
			this.notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class TaxiProvider implements Runnable{
	private TaxiBase st;
	private int num;
	TaxiProvider(TaxiBase st){
		this.st=st;
	}
	public void run() {
		while (true) {
			st.come();
		}
	}
	
}
class TaxiRenter implements Runnable{
	private TaxiBase st;
	TaxiRenter(TaxiBase st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.go();
		}
	}
}
public class Taxi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TaxiBase st=new TaxiBase();
		TaxiProvider taxiProvider=new TaxiProvider(st);
		TaxiRenter taxiRenter=new TaxiRenter(st);
		new Thread(taxiProvider).start();
		new Thread(taxiRenter).start();
	}

}
