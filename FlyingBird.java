/**
 * �����С�� 2018��5��2��
 */
public class FlyingBird 
{
	public static void main(String[] args) 
	{
		int x = 1;

		while (x <= 60)
		{
			System.out.print("�����С��");
			for (int i = 1; i <= x; i++)
			{
				System.out.print(" ");
			}

			if (x % 2 == 0)
			{
				System.out.print("V\r");
			}
			else
			{
				System.out.print("^\r");
			}

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
