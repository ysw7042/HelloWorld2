package basic;

public class IfApp {
	public static void main(String[] args) {
		//int su=90;
		int su=40;
		
		//�������� 50�̻��� ��쿡�� ������ ���
		if(su>=50) {
			System.out.println("su = "+su);
		}
		System.out.println("============================================");
		//int score=80;
		int score=50;
		
		//�������� 60�� �̻��� ��� �հ� �޼����� ����ϰ� 60�� �̸��� ��� ���հ� �޼��� ���
		/*
		if(score>=60) {
			System.out.println("[���]������ 60�� �̻��̹Ƿ� �հ��Դϴ�.");
		}
		
		if(score<60) {
			System.out.println("[���]������ 60�� �̸��̹Ƿ� ���հ��Դϴ�.");
		}
		*/
		
		if(score>=60) {
			System.out.println("[���]������ 60�� �̻��̹Ƿ� �հ��Դϴ�.");
		} else {
			System.out.println("[���]������ 60�� �̸��̹Ƿ� ���հ��Դϴ�.");
		}
		System.out.println("============================================");
		//int num=10;
		int num=11;
		
		//�������� Ȧ���� ¦���� �����Ͽ� ���
		if(num%2!=0) {
			System.out.println(num+" >> Ȧ��");
		} else {
			System.out.println(num+" >> ¦��");
		}
		System.out.println("============================================");
		char mun='O';
		
		//�������� ������ �Ǵ� �񿵹��ڷ� �����Ͽ� ���
		if(mun>='A' && mun<='Z' || mun>='a' && mun<='z') {
			System.out.println("[���]"+mun+" >> ������");
		} else {
			System.out.println("[���]"+mun+" >> �񿵹���");
		}
		System.out.println("============================================");
		int jumsu=88;
		//int jumsu=188;
		
		//�������� 0~100 ������ ��ȿ������ �ƴ����� �����Ͽ� ��� - ��ȿ�� �˻�
		if(jumsu>=0 && jumsu<=100) {
			//System.out.println("[���]0~100 ������ �������� ���� �Է� �Ǿ����ϴ�.");
			
			//�������� ���� ����� �����Ͽ� ���
			//100~90 : A, 89~80 : B, 79~70 : C, 69~60 : D, 59~0 : F
			
			/*
			//Null Character : ���ڰ��� �������� �ʴ� ����
			char grade='\0';//������ �����ϱ� ���� ����
			
			if(jumsu<=100 && jumsu>=90) {
				grade='A';
			} else if(jumsu<=89 && jumsu>=80) {
				grade='B';
			} else if(jumsu<=79 && jumsu>=70) {
				grade='C';
			} else if(jumsu<=69 && jumsu>=60) {
				grade='D';
			}  else if(jumsu<=59 && jumsu>=0) {
				grade='F';
			}
			*/
			
			char grade;
			if(jumsu>=90) {
				grade='A';
			} else if(jumsu>=80) {
				grade='B';
			} else if(jumsu>=70) {
				grade='C';
			} else if(jumsu>=60) {
				grade='D';
			} else {
				grade='F';
			}
			
			System.out.println("[���]"+jumsu+"�� >> "+grade+"����");
		} else {
			System.out.println("[����]0~100 ������ ��� ���������� ���� �Է� �Ǿ����ϴ�.");
		}
		System.out.println("============================================");
	}
}
