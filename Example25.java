interface PCI{
	void start();
	void stop();
}
class NetWorkCard implements PCI{
	public void start() {
		System.out.println("Send...");
	}
	public void stop() {
		System.out.println("NetWork Top");
	}
}
class SoundCard implements PCI{
	public void start() {
		System.out.println("Du du...");
	}
	public void stop() {
		System.out.println("Sound Stop");
	}
}
class MainBoard{
	public void usePCICard(PCI p) {
		p.start();
		p.stop();
	}
}
public class Example25 {
	public static  void main(String[] args){
		MainBoard mb=new MainBoard();
		NetWorkCard nc=new NetWorkCard();
		mb.usePCICard(nc);
		SoundCard sc=new SoundCard();
		mb.usePCICard(sc);
	}

}
