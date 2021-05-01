package basic;

//1~45 ������ �ߺ����� �ʴ� �������� 6���� �����޾� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//����(Sort) : ���� ������� �����ϴ� ���
// => �������� ����(Ascending Sort), �������� ����(Descending Sort)
public class LottoApp {
	public static void main(String[] args) {
		//6���� ���������� �����ϱ� ���� �迭 ����
		int[] lotto=new int[6];
		
		//1~45 ������ ���������� �����޾� �迭 ��ҿ� ����
		for(int i=0;i<lotto.length;i++) {//���ο� �������� ����Ǵ� ����� ÷�ڸ� ǥ��
			//��ҿ� ����� ���ο� �������� ���� ��ҵ��� �������� ���Ͽ� ��� �ٸ� ���
			//�ݺ��� ���� - ���� ����� �������� ���� ��� �ݺ� ó��
			while(true) {
				//��ҿ� ���ο� ���������� �����޾� ����
				lotto[i]=(int)(Math.random()*100)%45+1;
				
				//�ߺ� ���������� �����ϱ� ���� ����
				// => false : ���ߺ�, true : �ߺ�
				boolean result=false;
				
				//���� ��ҵ��� �������� ���ϴ� �ݺ���
				for(int j=0;j<i;j++) {//���� ����� ÷�ڸ� ǥ��
					//lotto[i] : ���ο� �������� ����� ���
					//lotto[j] : ���� �������� ����� ���
					if(lotto[i]==lotto[j]) {
						result=true;
						break;
					}
				}
				
				if(!result) break;//while ���� ����
			}
		}
		
		//�迭�� ��Ұ����� ���� ���Ͽ� �������� �����Ͽ� ����
		// => ���� ���� �˰���(Selection Sort Algorithm) �̿�
		for(int i=0;i<lotto.length-1;i++) {//�� ����� ÷�� : ó��~������-1
			for(int j=i+1;j<lotto.length;j++) {//�Ǻ� ����� ÷�� : ��+1~������
				//lotto[i] : �� ���, lotto[j] : �Ǻ� ��� 
				if(lotto[i]>lotto[j]) {//�������� ����
					//�� ����� ���� ġȯ(Swap)
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//�迭 ��Ұ� ���
		System.out.print("����� ���� >> ");
		for(int num:lotto) {
			System.out.print(num+"  ");
		}
		System.out.println();
	}
}







