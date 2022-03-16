/**
 * 模拟安装进度条 2021年5月2日
 */
public class ProgressBar 
{
	public static void main(String[] args) 
	{
		int x = 1;

		System.out.println("模拟安装进度条：\n");
		while (x <= 20)
		{
			for (int i = 1; i <= x; i++)
			{
				System.out.print("■");
			}

			for (int i = x + 1; i <= 20; i++)
			{
				System.out.print("□");
			}

			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			}

			System.out.printf("%4d%%\r", x * 5);
			x++;
		}

		System.out.println();
	}
}
