package example;

public class VariableExample {
	public static void main(String[] args) {
		//������ ���̰� 7�̰� ������ ���̰� 10�� �簢���� ���̸� ����Ͽ� ����ϼ���.
		int garo=7, sero=10;
		int nulbe=garo*sero;
		System.out.println("�簢���� ���� = "+nulbe);
		System.out.println("======================================================");
		
		//���̰� 9�̰� �غ��� ���̰� 7�� �ﰢ���� ���̸� ����Ͽ� ����ϼ���.
		int ����=9, ����=7;
		double ����=����*����/2.;
		System.out.println("�ﰢ���� ���� = "+����);
		System.out.println("======================================================");
		
		//10���� ��ü �����԰� 759Kg�� ��� ��� �����Ը� ����Ͽ� ����ϼ���.
		int count=10, totWeight=759;
		double aveWeight=(double)totWeight/count;
		System.out.println("��� ������ = "+aveWeight);
		System.out.println("======================================================");
		
		//�̸��� [ȫ�浿]�� �л��� �������� 89��, �������� 93��, �������� 95���� ���� ���
		//������ ����� ����Ͽ� �̸�, ����, ����� ����ϼ���.
		//��, ����� �Ҽ��� ���ڸ������� ����ϰ� �������� ���� ó�� �ϼ���.
		String name="ȫ�浿";
		int kor=89, eng=93, mat=95;
		
		int tot=kor+eng+mat;
		double ave=tot/3.;
		
		System.out.println("�̸� = "+name+", ���� = "+tot
				+", ��� = "+(int)(ave*10)/10.);
		System.out.println("======================================================");
	}
}





