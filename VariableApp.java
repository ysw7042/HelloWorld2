package basic;

public class VariableApp {
	public static void main(String[] args) {
		//���� ���� ����) �ڷ��� ������; 
		int su;//�������� �����ϱ� ���� su ���� ����
		su=100;//su ������ ������(100) ���� - ���Կ�����(=) �̿�
		System.out.print("�ʱⰪ = ");
		System.out.println(su);//su ������(100) ���
		
		//int su;//������ ������ ���� �ĺ��ڸ� �����ϸ� ���� �߻�
		su=200;//������ ������(200) ���� - ������ ��� ���ο� �� ����
		System.out.print("���氪 = ");
		System.out.println(su);//su ������(200) ���
		System.out.println("=============================================");
		//���� ���� �� �ʱⰪ ����
		int num=100;
		//["���ڿ�"+��] �Ǵ� [��+"���ڿ�"] >> ���ڿ� ����
		// => + �����ڸ� �̿��� ���ڿ��� ���� �����Ͽ� ����
		System.out.println("num = "+num);//num = 100
		System.out.println("=============================================");
		System.out.println("���ش� "+2+0+2+1+"���Դϴ�.");
		System.out.println(2+0+2+1+"���� �Ҷ����Դϴ�.");//���� ����
		//"" : ���ڰ� �ϳ��� ���� ���ڿ� - NullString
		System.out.println(""+2+0+2+1+"���� �Ҷ����Դϴ�.");
		System.out.println("=============================================");
		//������ �ڷ����� ������ , ��ȣ�� �̿��Ͽ� ���� ���� ����
		int num1=100, num2=200;
		System.out.println("������ = "+num1+num2);
		System.out.println("������ = "+(num1+num2));
		System.out.println("������ = "+(num1*num2));
		System.out.println("������ = "+num1*num2);
		System.out.println("=============================================");
		int kor=88, eng=90;
		//int tot=88+90;
		int tot=kor+eng;//�������� ������ ����
		System.out.println("���� �հ� = "+tot);
		System.out.println("=============================================");
		/*
		int number;
		//������ ���� ����Ǿ� ���� ���� ���·� ����� ��� ���� �߻�
		System.out.println("number = "+number);
		*/
		
		/*
		//������ ���� �Ұ����� ���� ������ ��� ���� �߻�
		int number=10.0;
		System.out.println("number = "+number);
		*/
	}
}
