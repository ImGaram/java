package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 9;
		int charge = 0;
		if(age <8) {
			charge =1000;
			System.out.println("���� �� �Ƶ��Դϴ�");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if (age < 20) {
			charge = 2000;
			System.out.println("��, �����л� �Դϴ�.");
		}
		else {
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		System.out.println("������"+ charge +"�� �Դϴ�.");	//charge ������ ���
	}

}