/**
 * 运动的飞箭 2018年5月2日
 */
public class MovingArrow 
{
	public static void main(String[] args) 
	{
		int x = 1;

		while (x <= 60)
		{
			System.out.print("运动的飞箭：");
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
