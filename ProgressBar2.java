/**
 * ģ�ⰲװ������ 2018��5��2��
 */
public class ProgressBar2 
{
	public static void main(String[] args) 
	{
		int x = 1;

		while (x <= 100)
		{
			System.out.print("ģ�ⰲװ��������");
			System.out.printf("%3d%%\r", x);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}

			x++;
		}

		System.out.println();
	}
}
