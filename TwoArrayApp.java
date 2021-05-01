package basic;

public class TwoArrayApp {
	public static void main(String[] args) {
		int[][] num=new int[2][3];
		
		System.out.println("num = "+num);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("=====================================================");
		System.out.println("num[0][0] = "+num[0][0]);
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[0][2] = "+num[0][2]);
		
		System.out.println("num[1][0] = "+num[1][0]);
		System.out.println("num[1][1] = "+num[1][1]);
		System.out.println("num[1][2] = "+num[1][2]);
		System.out.println("=====================================================");
		System.out.println("num.length = "+num.length);
		System.out.println("num[0].length = "+num[0].length);
		System.out.println("num[1].length = "+num[1].length);
		System.out.println("=====================================================");
		for(int i=0;i<num.length;i++) {//�� - 1���� �迭�� ������ŭ �ݺ�
			for(int j=0;j<num[i].length;j++) {//�� - ����� ������ŭ �ݺ�
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		//int[][] su=new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int[][] su={{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array:su) {//1���� �迭������ �����޾� ���������� �����Ͽ� �ݺ� ó��
			for(int temp:array) {//��Ұ��� �����޾� ������ �����Ͽ� �ݺ� ó��
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		//1���� �迭�� ���� 2���� �迭 ����
		// => 1���� �迭 ������ ������ �� �ִ� ���������� ����
		int[][] number=new int[3][];
		
		//1���� �迭�� �����Ƿ� 2���� �迭�� ������ҿ��� �ڵ����� null ����
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		
		//1���� �迭�� ���� ��� ��Ҹ� ǥ���ϸ� ���� �߻�
		// => NullPointerException �߻� - NULL�� ����� ������Ҹ� �̿��Ͽ� ������ ��� �߻�
		//System.out.println("number[0][0] = "+number[0][0]);
		System.out.println("=====================================================");
		
		//2���� �迭�� ������ҿ� 1���� �迭�� �����Ͽ� �迭 ���� ����
		// => 1���� �迭�� ����� ������ �ٸ��� �����Ͽ� ���� - �����迭 
		number[0]=new int[3];
		number[1]=new int[2];
		number[2]=new int[4];
		
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		
		number[1][0]=40;
		number[1][1]=50;
		
		number[2][0]=60;
		number[2][1]=70;
		number[2][2]=80;
		number[2][3]=90;

		//int[][] number={{10,20,30},{40,50},{60,70,80,90}};
		
		for(int[] array:number) {
			for(int temp:array) {
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
	}
}
