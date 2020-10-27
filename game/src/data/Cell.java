package data;
public class Cell {
	public int [][]flag = new int[32][32];//10*10�ĸ���
	//��ʼ����ϸ����̬�����һȦ���Ӳ�Ҫ
	public void init() {
		//��ʼ��ȫΪ0
		for(int i=0;i<32;i++)
		{
			for(int j=0;j<32;j++) {
				flag[i][j] = 0;
			}
		}
		//����һȦ��Ҫ
		for(int i=1;i<31;i++)
		{
			for(int j=1;j<31;j++) 
			{
				int temp = Math.random()>0.5 ? 1:0;
				flag[i][j] = temp;
			}
		}
		
	}
	public void print() {
		for(int i=1;i<31;i++)
		{
			for(int j=1;j<31;j++)
			{
			 System.out.print(flag[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	//���ݳ�ʼ��ֵ����������Ϸ
	public void update() throws InterruptedException {
		
			for(int i=1;i<31;i++)
			{
				for(int j=1;j<31;j++)
				{
					//�ж���Χ8������������
					if(flag[i-1][j]+flag[i+1][j]+flag[i-1][j+1]+flag[i][j+1]+flag[i+1][j+1]+flag[i-1][j-1]+flag[i][j-1]+flag[i+1][j-1]==3)
					{
						flag[i][j] = 1;
					}else if(flag[i-1][j]+flag[i+1][j]+flag[i-1][j+1]+flag[i][j+1]+flag[i+1][j+1]+flag[i-1][j-1]+flag[i][j-1]+flag[i+1][j-1]==2)
					{
						
					}else {
						flag[i][j] = 0;
					}
				}		
			}
	}
}
