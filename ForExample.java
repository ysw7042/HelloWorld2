package example;

public class ForExample {
	public static void main(String[] args) {
		//���� �̸��� ȭ�鿡 7�� ����ϼ���.
		//ex) ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿
		for(int i=1;i<=7;i++) {
			System.out.print("ȫ�浿 ");
		}
		System.out.println();
		
		System.out.println("=========================================");
		//1~10 ������ ���� �� Ȧ���� ȭ�鿡 ����ϼ���.
		//ex) 1     3     5     7     9
		/*
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		*/
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		
		System.out.println("=========================================");
		//1~100 ������ �������� 3�� ������� �հ�� 5�� ������� �հ踦 ����Ͽ�
		//3�� ����� �հ迡�� 5�� ����� �հ踦 �� ������� ����ϼ���.
		//ex) ��� = 633
		int tot3=0, tot5=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) tot3+=i;
			if(i%5==0) tot5+=i;
		}
		
		System.out.println("��� = "+(tot3-tot5));
		
		System.out.println("=========================================");
		//������ �� 7���� ȭ�鿡 ����ϼ���.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63
		int dan=7;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
		System.out.println("=========================================");
		//5!�� ������� ����ϼ���.(5! = 5 * 4 * 3 * 2 * 1)
		//ex) 5! = 120
		int num=5,fac=1;
		for(int i=num;i>=1;i--) {
			fac*=i;
		}
		System.out.println(num+"! = "+fac);
		
		System.out.println("=========================================");
		//�� ������ ����� ������ ������ �������� ȭ�鿡 ����ϼ���.
		//��, �� �ٿ� �������� 7���� ��µǵ��� ���α׷��� �ۼ��ϼ���.
		//ex) 36    27    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57
		int begin=36, end=57;
		int count=0;
		
		for(int i=begin;i<=end;i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}
		if(count%7!=0) {
			System.out.println();
		}
		
		System.out.println("=========================================");
	}
}













