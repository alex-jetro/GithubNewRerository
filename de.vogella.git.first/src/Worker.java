/**
 * 
 */

/**
 * @author alex
 *
 */
public class Worker
{
	String workerName;
	String workName;
	int num = 0;
	
	public Worker ()
	{
		workerName = "Alex";
		workName = "Work Around";
	}
	
	public Worker (String name, String work)
	{
		workerName = name;
		workName = work;
	}
	
	public int DoWork()
	{
		System.out.println(workerName + " doing " + workName);
		num = num +1;
		return num;
	}
}
