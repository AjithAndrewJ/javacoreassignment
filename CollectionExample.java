package testing.juniTestProject;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

	private List<String> names=new ArrayList<String>();
	
	public void addNames(String name)
	{
		names.add(name);
	}

	public void remove(String name)
	{
		names.remove(name);
	}
	
	public void removeAll()
	{
		
		names.clear();
	}
	
	public int lengthOfList()
	{
		return names.size();
	}
}
