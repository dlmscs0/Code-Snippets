package random.number;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomNumberDriver {

	public static void main (String[] args)
	{
		generateRandomNumbers(-5);
		
		for (int i = 0; i < 100; i++)
		{
			generateRandomNumbers(i);
			System.out.println();
			System.out.println();
		}

		generateRandomNumbers(1000);

	}

	public static void generateRandomNumbers (Integer n)
	{
		if (n >= 0)
		{
			Map<Integer, Integer> seenNums = new HashMap<Integer, Integer>();
			Random r = new Random();
			int nextVal = -1;
			float randFloat = 0;
			
			for (int i = 0; i <= n; i ++)
			{
				//Pick a random float and scale it to the range
				randFloat = r.nextFloat();
				nextVal = (int) (randFloat * n);
				
				while (seenNums.get(nextVal) != null)
				{
					//Using linear collision detection
					if (nextVal == n)
						nextVal =0;
					else
						++nextVal;
				}
				
				//Print and mark the number as seen
				System.out.print(nextVal + " ");			
				seenNums.put(nextVal, 1);
				}
					
		}
	}		
}