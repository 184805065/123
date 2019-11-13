import java.util.Random;
class Storage{
	private String[]cells=new String[10];
	private int inPos,outPos;
	private int count;
	public synchronized void put(String num){
		try{
			while (count==cells.length){
				this.wait();
			}
			cells[inPos]=num;
			System.out.println(cells[inPos]+"用户登录");
			inPos++;	
			if(inPos==cells.length)
				inPos=0;
			count++;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(){
		try{
			while(count==0){
				this.wait();
			}
			String data=cells[outPos];
			System.out.println(cells[outPos]+"用户注销");
			cells[outPos]=String.valueOf(0);
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			count--;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Input implements Runnable{
	private Storage st;
	private String num;
	Input(Storage st){
		this.st=st;
	}
	public void run(){
			Random r=new Random(13);
			for(int x=0;x<10;x++) {
				num=String.valueOf(r.nextInt(100));
				st.put(num);
	}
}
}
class Output implements Runnable{
	private Storage st;
	Output(Storage st){
		this.st=st;
	}
	public void run() {
		while(true) {
			st.get();
		}
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage st=new Storage();
		Input input=new Input(st);
		Output output=new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}

}
