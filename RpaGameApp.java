package basic;

import java.util.Scanner;

//���������� ���� ���α׷��� �ۼ��ϼ���.
// => ��ǻ��(����)�� �����(Ű����)�� ���������� ���
// => ����ڰ� �̱� ��� ����� �ݺ� �����ϸ� �� ��� ���� ����
// => ������ ����� �� ����ڰ� �̱� Ƚ�� ���
public class RpaGameApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//����� ����Ƚ���� �����ϱ� ���� ����
		int count=0;
		
		//���������� ���� - �ݺ����� �̿��� �ݺ� ó��
		while(true) {
			//��ǻ�Ϳ��� ���������� �� �ϳ��� �����޾� ���� >> ����(1~3)
			// => 1 : ����, 2 : ����, 3 : ��
			int computer=(int)(Math.random()*10)%3+1;
			
			//����ڿ��� ���������� �� �ϳ��� �����޾� ���� >> Ű����(1~3)
			// => �Է°��� 1~3 ������ �������� �ƴ� ��� �޼��� ��� �� ���Է�
			int user;
			while(true) {//�Է� �ݺ� - �������� �� �Է½� �ݺ��� ����
				System.out.print("���������� �Է�[1.����,2.����,3.��] >> ");
				user=scanner.nextInt();
				if(user>=1 && user<=3) break;
				System.out.println("[����]����,����,�� �� �� �ϳ��� ���� �����մϴ�.");
			}
			
			//��ǻ�Ϳ� ����ڰ� ������ ���������� ���
			System.out.print("[�Է�]��ǻ�� = ");
			if(computer==1) System.out.print("����");
			else if(computer==2) System.out.print("����");
			else if(computer==3) System.out.print("��");
			
			System.out.print(", ����� = ");
			if(user==1) System.out.print("����");
			else if(user==2) System.out.print("����");
			else if(user==3) System.out.print("��");
		
			System.out.println();
			
			//��ǻ�Ϳ� ������� ���и� �Ǵ��Ͽ� ��� ���
			// => ����ڰ� �̱� ��� ���� Ƚ�� 1 ���� >> ����
			// => ����ڰ� �� ��� �ݺ��� ����
			if(computer==user) {
				System.out.println("[���]����ڿ� ��ǻ�Ͱ� �����ϴ�.");
			} else if((computer==1 && user==2) || (computer==2 && user==3) 
					|| (computer==3 && user==1)) {
				System.out.println("[���]����ڰ� ��ǻ�Ϳ��� �̰���ϴ�.");
				count++;//���� Ƚ�� ����
			} else {
				System.out.println("[���]����ڰ� ��ǻ�Ϳ��� �����ϴ�.");
				break;//�ݺ��� ���� - ���ӳ�
			}
			
			System.out.println();
		}//���� �ݺ� ����
		
		System.out.println();
		if(count==0) {
			System.out.println("[�޼���]����ڰ� ��ǻ�Ϳ��� �ѹ��� �̱��� ���߽��ϴ�.");
		} else {
			System.out.println("[�޼���]����ڰ� ��ǻ�Ϳ��� "+count+"�� ���������� �̰���ϴ�.");
		}
		
		scanner.close();
	}
}











