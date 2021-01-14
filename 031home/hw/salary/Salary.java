package hw.salary;

public class Salary {
	public double salary;
	public double[] taxPercent = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47 };
	public double[] steps = { 0, 6330, 9080, 14580, 20260, 42160 };
	double x = 0;
	public void display()
	{
		for(int i = 3; i > 0; i--) {
			x += taxPercent[i] * steps[i];
			System.out.println(x);
		}
	}
}
