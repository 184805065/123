package user;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TelcomUser implements User {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
	}
	public void generateCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			//������ɵ�i��ͨ����¼
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			
			/* ��System.currentTimeMillis()��ȷ������
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			*/
			
			//��Calendar��ȡ��ǰʱ��
			Calendar cal = Calendar.getInstance();
			//�����ȥ����Сʱ��10Сʱ���ڣ�
			cal.add(Calendar.HOUR, - new Random().nextInt(10));
			//��ö�Ӧ����
			long timeStart = cal.getTimeInMillis();
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			
			//���к���
			this.callTo = getCallToPhoneNumber();
			//����ͨ����¼
			this.communicationRecords.append(this.phoneNumber + 
					"," + timeStart + 
					"," + timeEnd + 
					"," + this.callTo+
					";");
		}
	}
	
	//������ɱ��к��루����λ�����������
	public String getCallToPhoneNumber() {
		return "1550372" + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10));
	}
	
	//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
	public String accountFee(long timeStart, long timeEnd) {
		//ÿ�����շ�*Ԫ
		double feePerMinute = 0.2;
		//ͨ���������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	
	//��ӡͨ����¼
	public void printDetails() {
		//��ȡȫ��ͨ����¼
		String allRecords = this.communicationRecords.toString();
		//�ָ�ͨ����¼
		String [] recordArray = allRecords.split(";");
		//ѭ���ָ��¼�ڵ�ÿһ����
		System.out.println("---------�й�����---------");
		for(int i = 0; i < recordArray.length; i++) {
			System.out.println("---------ͨ����¼�ָ���---------");
			String [] recordField = recordArray[i].split(",");
			System.out.println("���У�" + recordField[0]);
			System.out.println("���У�" + recordField[3]);
			Date timeStart = new Date(Long.parseLong(recordField[1]));
			Date timeEnd = new Date(Long.parseLong(recordField[2]));
			DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
			//DateFormat
			/*
			System.out.println("ͨ����ʼʱ�䣺" + mediumFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺" + mediumFormat.format(timeEnd));
			*/
			
			//SimpleDateFormat			
			System.out.println("ͨ����ʼʱ�䣺" + simpleDateFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺" + simpleDateFormat.format(timeEnd));
			
			System.out.println("�Ʒѣ�" 
					+ accountFee(Long.parseLong(recordField[1]), Long.parseLong(recordField[2]))
					+ " Ԫ��");
		}
	}
}