package testing.juniTestProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollectionExampleTest {

	CollectionExample cal=new CollectionExample();
	
	@Test
	public void testAddNames()
	{
		cal.addNames("apurva");
		cal.addNames("manikandan");
		cal.addNames("pooja");
		cal.addNames("gayatri");
		assertEquals(4,cal.lengthOfList(),"Adding 4 names in list");
	}

	@Test
	public void testRemove()
	{
		cal.addNames("laxmi");
		cal.addNames("sanjay");
		cal.remove("sanjay");
		assertEquals(1, cal.lengthOfList(),"Removing one student from list");
	}
	
	@Test
	public void testRemoveAll()
	{
		cal.removeAll();
		assertEquals(0, cal.lengthOfList());
	}
}
