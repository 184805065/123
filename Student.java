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
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int i=0;
		while(true) {
			int choose;
			System.out.println("1:插入学生信息   2:修改信息   3:查询信息  4:删除学生信息  5:退出系统");
			choose=in.nextInt();
			switch(choose)
			{
			case 1:
			{
				System.out.println("请输入学生学号: ");
				String stunum=in.nextLine();
				System.out.println("请输入学生姓名: ");
				String stuname=in.nextLine();
				System.out.println("请输入学生性别: ");
				String sex=in.nextLine();
				System.out.println("请输入学生年龄: ");
				int age=in.nextInt();
				in.nextLine();
	    		System.out.println("请输入学生院系：");
	    		String college=in.nextLine();
	    		stu[i]=new StudentInformation(stunum,stuname,sex,age,college);
	    		System.out.println("添加学生信息成功！");
	    		i++;
			}break;
			case 2:
			{
				System.out.println("请输入要修改的学生姓名：");
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
	    			System.out.println("没有这个学生信息！");
	    		else {
	    		    System.out.println("请输入学生学号：");
	    		    stu[check].stunum(in.nextLine());
	    		    System.out.println("请输入学生姓名：");
	    		    stu[check].stuname(in.nextLine());
	    		    System.out.println("请输入学生性别：");
	    		    stu[check].sex(in.nextLine());
	    		    System.out.println("请输入学生年龄：");
	    		    stu[check].age(in.nextInt());
	    		    in.nextLine();
	    		    System.out.println("请输入学生院系：");
	    		    stu[check].college(in.nextLine());
	    	    	System.out.println("修改学生信息成功！");
	    		}
			}break;
			case 3:
			{
				System.out.println("请输入要查询的学生姓名：");
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
	    			System.out.println("学号："+stu[check].getstunum()+"\n姓名："+stu[check].getstuname()+"\n性别："+stu[check].getsex()+"\n年龄："+stu[check].getage()+"\n院系："+stu[check].getcollege());
	    		else
	    			System.out.println("不存在此学生信息！");
			}break;
			case 4:
			{
				System.out.println("请输入要删除的学生姓名：");
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
	    	    	System.out.println("删除成功！");
	    	    }
	    	    else
	    	    	System.out.println("不存在此学生信息！");
			}break;
			}
			if(choose==5)
				break;
		}
		in.close();
	}

}
