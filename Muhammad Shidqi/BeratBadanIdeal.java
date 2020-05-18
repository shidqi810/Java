import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BeratBadanIdeal
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
		int T1, T2, T3, Tinggi;
		String X1 = "";
		
		System.out.print("Tinggi Badan = ");
		try
		{
			X1 = dataIn.readLine();
		}
		catch ( Exception e )
		{
			System.out.println("Error!");
		}
		
		
		Tinggi = Integer.parseInt(X1);
		T1 = Tinggi - 100;
		T2 = T1 * 90;
		T3 = T2 / 100;
		
		System.out.print("Berat Badan Ideal = " + T3 + " Kg");

	}
}