package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("<<������>>");
		//println() ��¸޼ҵ�� �������� 10������ ��ȯ�Ͽ� ��� ó��
		System.out.println("������(10����) = "+100);
		System.out.println("������(8����) = "+0100);
		System.out.println("������(16����) = "+0x100);
		
		System.out.println("������(4Byte) = "+2147483647);
		//int(4Byte)�� ǥ���� �� ���� �������� ����� ��� ���� �߻�
		//System.out.println("������(4Byte) = "+2147483648);
		//int(4Byte)�� ǥ���� �� ���� �������� long(8Byte)���� ǥ��
		System.out.println("������(8Byte) = "+2147483648L);
		
		byte a1=127;//1Byte : -127~127
		short a2=32767;//2Byte : -32768~32767
		int a3=2147483647;//4Byte : -2147483648~2147483647
		long a4=2147483648L;//8Byte
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		//int a5=100L;//����Ÿ �ս� ���ɼ��� ���� ���� �߻�
		long a5=100;//����
		System.out.println("a5 = "+a5);
		System.out.println("==================================================");
		System.out.println("<<�Ǽ���>>");
		System.out.println("�Ǽ���(4Byte) = "+1.23F);
		System.out.println("�Ǽ���(8Byte) = "+1.23);
		//println() ��¸޼ҵ�� ���� ���� �Ǵ� ���� ū �Ǽ����� ���������� ��ȯ�Ͽ� ��� ó��
		System.out.println("�Ǽ���(8Byte) = "+0.00000000123);
		//�Ǽ����� ���������� ǥ�� ����
		System.out.println("�Ǽ���(8Byte) = "+1.23E9);
		
		//float b1=1.23456789;//���� �߻�
		float b1=1.23456789F;//�������� ǥ������ : �Ҽ��� 7�ڸ�
		double b2=1.23456789;//�������� ǥ������ : �Ҽ��� 15�ڸ�
		
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		
		float b3=2147483648L;
		System.out.println("b3 = "+b3);
		System.out.println("==================================================");
		System.out.println("<<������>>");
		System.out.println("���ڰ�(2Byte) = "+'A');
		System.out.println("���ڰ�(2Byte) = "+'��');
		System.out.println("���ڰ�(2Byte) = "+'\'');
		System.out.println("���ڰ�(2Byte) = "+'\\');
		
		//'A' : 65, 'a' : 97, '0' : 48, ' ' : 32, '\n' : 13, '��' : 44032
		char c1='A';//���ڰ��� ���������� ��ӵ� ���������� ����
		char c2=65;//��ӵ� �������� ���� ����
		char c3='a'-32;//���� ����
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		
		char c4=45000;//�ϼ��� : �ϼ��� �ѱ� ���ڷ� ǥ�� 
		System.out.println("c4 = "+c4);
		System.out.println("==================================================");
		System.out.println("<<����>>");
		System.out.println("����(1Byte) = "+false);
		System.out.println("����(1Byte) = "+true);
		//�����(�񱳽�)�� ���� ��������� ���� ����
		System.out.println("����(1Byte) = "+(20>10));
		System.out.println("����(1Byte) = "+(20<10));
		
		boolean d1=false;
		boolean d2=20>10;

		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("==================================================");
		System.out.println("<<���ڿ�>>");
		System.out.println("���ڿ� = "+"ȫ�浿");
		System.out.println("������ ���簡 \"���ѵ��� ����\"��� ���ƽ��ϴ�.");
		
		String e1="Java";
		String e2="������ �����ؿ�.";
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		//���ڿ��� + �����ڸ� ����� ��� ���ڿ� ���� �ǹ�
		System.out.println(e1+" "+e2);
		System.out.println("==================================================");
	}
}











