package basic;

//��������(Local Variable) : �޼ҵ� �Ǵ� ��� ���� �� ���ο��� ����� ����
// => ���������� ����� �� ���ο����� ��� ����
// => ���������� ����� ���� ����Ǹ� ���������� �ڵ� �Ҹ� ó��
public class LocalVariableApp {
	public static void main(String[] args) {
		int num1=100;

		//���� ��
		{
			int num2=200;
			
			System.out.println("========== ���Ǻ� ���� ==========");
			System.out.println("num1 = "+num1);
			System.out.println("num2 = "+num2);
		}
		
		System.out.println("========== ���Ǻ� �ܺ� ==========");
		System.out.println("num1 = "+num1);
		//���� �� ����� num2 ������ �ڵ� �Ҹ�ǹǷ� ��� �Ұ���
		//System.out.println("num2 = "+num2);
	}
}





