package basic;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner Ŭ���� : �Է���ġ(Ű����, ���� ��)�κ��� ���� �����ޱ� ���� �޼ҵ尡 ����� Ŭ����
		//Scanner Ŭ������ ��ü�� �����Ͽ� ������ ���� - ������ ����� ��ü�� �޼ҵ� ȣ��
		// => Ű����κ��� ���� �Է¹ޱ� ���� Scanner ��ü ����
		// => System.in : Ű���� �Է� ��Ʈ�� - Ű����� �Էµ� ���� �����ϴ� ��ü 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�̸� �Է� >> ");
		//Scanner.nextLine() : �Է°��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//����� Ű����� �Է¹��� ���ڿ��� ������ ����
		// => Ű���� �Է°��� ���� ��� ���α׷��� �帧(������)�� �Ͻ� ����
		// => ����� Ű����� ���� �Է��� �� ���͸� �Է��ϸ� ������ �����
		String name=scanner.nextLine();
		
		System.out.print("���� �Է� >> ");
		//Scanner.nextInt() : �Է°��� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//����� Ű����� �Է¹��� �������� ������ ����
		// => Ű���� �Է°��� �������� �ƴ� ��� ����(Exception) �߻�
		int age=scanner.nextInt();		
		
		System.out.println("[���]"+name+"���� "+age+"���Դϴ�.");
		
		//Scanner.close() : Scanner ��ü�� ��Ʈ���� �����ϴ� �޼ҵ�
		scanner.close();
	}
}









