/**
 * 
 */

/**
 * @author alex
 *
 */
public class GitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Starting Program:");
		Worker w = new Worker();
		w.DoWork();
		w.DoWork();
		System.out.println("Result is " + w.DoWork());
	}
}
