import java.util.Scanner;
class StudentInformation{
	private String stunum;
	private String stuname;
	private String sex;
	private int age;
	private String college;
	public StudentInformation(String stunum,String stuname,String sex,int age,String college) {
		this.stuname=stuname;
		this.stunum=stunum;
		this.sex=sex;
		this.age=age;
		this.college=college;
	}
	public void studentinformation() {
	}
	public void stunum(String stunum) {
		this.stunum=stunum;
	}
	public String getstunum() {
		return this.stunum;
	}
	public void stuname(String stuname) {
		this.stuname=stuname;
	}
	public String getstuname() {
		return this.stuname;
	}
	public void sex(String sex) {
		this.sex=sex;
	}
	public String getsex() {
		return this.sex;
	}
	public void age(int age) {
		this.age=age;
	}
	public int getage() {
		return this.age;
	}
	public void college(String college) {
		this.college=college;
	}
	public String getcollege() {
		return this.college;
	}
}
public class Student {
    static StudentInformation stu[]=new StudentInformation[50]; 
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in=new Scanner(System.in);
		int i=0;
		while(true) {
			int choose;
			System.out.println("1:����ѧ����Ϣ   2:�޸���Ϣ   3:��ѯ��Ϣ  4:ɾ��ѧ����Ϣ  5:�˳�ϵͳ");
			choose=in.nextInt();
			switch(choose)
			{
			case 1:
			{
				System.out.println("������ѧ��ѧ��: ");
				String stunum=in.nextLine();
				System.out.println("������ѧ������: ");
				String stuname=in.nextLine();
				System.out.println("������ѧ���Ա�: ");
				String sex=in.nextLine();
				System.out.println("������ѧ������: ");
				int age=in.nextInt();
				in.nextLine();
	    		System.out.println("������ѧ��Ժϵ��");
	    		String college=in.nextLine();
	    		stu[i]=new StudentInformation(stunum,stuname,sex,age,college);
	    		System.out.println("���ѧ����Ϣ�ɹ���");
	    		i++;
			}break;
			case 2:
			{
				System.out.println("������Ҫ�޸ĵ�ѧ��������");
	    		String name=in.nextLine();
	    		int check = -1;
	    		for(int j=0;j<=i-1;j++) {
	    			if(stu[j].getstuname().equals(name))
	    			{
	    				check=j;
	    				break;
	    			}
	    		}
	    		if(check==-1)
	    			System.out.println("û�����ѧ����Ϣ��");
	    		else {
	    		    System.out.println("������ѧ��ѧ�ţ�");
	    		    stu[check].stunum(in.nextLine());
	    		    System.out.println("������ѧ��������");
	    		    stu[check].stuname(in.nextLine());
	    		    System.out.println("������ѧ���Ա�");
	    		    stu[check].sex(in.nextLine());
	    		    System.out.println("������ѧ�����䣺");
	    		    stu[check].age(in.nextInt());
	    		    in.nextLine();
	    		    System.out.println("������ѧ��Ժϵ��");
	    		    stu[check].college(in.nextLine());
	    	    	System.out.println("�޸�ѧ����Ϣ�ɹ���");
	    		}
			}break;
			case 3:
			{
				System.out.println("������Ҫ��ѯ��ѧ��������");
	    		String name=in.nextLine();
	    		int check = -1;
	    		for(int j=0;j<=i-1;j++) {
	    			if(stu[j].getstuname().equals(name))
	    			{
	    				check=j;
	    				break;
	    			}
	    		}
	    		if(check!=-1)
	    			System.out.println("ѧ�ţ�"+stu[check].getstunum()+"\n������"+stu[check].getstuname()+"\n�Ա�"+stu[check].getsex()+"\n���䣺"+stu[check].getage()+"\nԺϵ��"+stu[check].getcollege());
	    		else
	    			System.out.println("�����ڴ�ѧ����Ϣ��");
			}break;
			case 4:
			{
				System.out.println("������Ҫɾ����ѧ��������");
	    		String name=in.nextLine();
	    		int check = -1;
	    		for(int j=0;j<=i-1;j++) {
	    			if(stu[j].getstuname().equals(name))
	    			{
	    				check=j;
	    				break;
	    			}
	    		}
	    	    if(check!=-1) {
	    	    	stu[check]=new StudentInformation("-1","-1","-1",-1,"-1");
	    	    	System.out.println("ɾ���ɹ���");
	    	    }
	    	    else
	    	    	System.out.println("�����ڴ�ѧ����Ϣ��");
			}break;
			}
			if(choose==5)
				break;
		}
		in.close();
	}

}
