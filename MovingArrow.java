/**
 * �˶��ķɼ� 2018��5��2��
 */
public class MovingArrow 
{
	public static void main(String[] args) 
	{
		int x = 1;

		while (x <= 60)
		{
			System.out.print("�˶��ķɼ���");
			for (int i = 1; i <= x; i++)
			{
				System.out.print(" ");
			}

			System.out.print(">===>\r");

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
