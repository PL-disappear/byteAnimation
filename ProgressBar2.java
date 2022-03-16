/**
 * 模拟安装进度条 2021年5月2日
 */
public class ProgressBar2 
{
	public static void main(String[] args) 
	{
		int x = 1;

		while (x <= 100)
		{
			System.out.print("模拟安装进度条：");
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
