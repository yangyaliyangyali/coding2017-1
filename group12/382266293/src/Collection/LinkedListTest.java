package Collection;

import static util.Print.*;
import java.util.Date;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	LinkedList<String> myLL;
	
	@Before
	public void setUp() throws Exception {
		myLL = new LinkedList<String>();
		assertEquals(true,myLL.isEmpty());
	}

	@After
	public void tearDown() throws Exception {
		myLL = null;
	}

	@Test
	public void testArrayList() {
		List bt = new ArrayList();
		assertEquals(bt.size(), 0);
		bt.add(new Date());
		assertEquals(1, bt.size());
		
	}

	@Test
	public void testAddE() {
		myLL.add("s");
		assertEquals(1,myLL.size());
		assertEquals(false,myLL.isEmpty());
	}

	@Test
	public void testAddStringE() {
		String a;
		for (int i = 0 ; i < 30; i++) {
			a = "" + i;
			myLL.add(a);
			assertEquals(myLL.get(i),a);
		}
		for (int i = 0 ; i < 30; i++) {
			a = "" + i;
			assertEquals(myLL.get(i),a);
		}
	}
	
	
	@Test
	public void testAddIndex() {
		String a;
		for (int i = 0 ; i < 30; i++) {
			a = "" + i;
			myLL.add(a);
		}
		
		String ss = "ss";
		myLL.add(0,ss);
		assertEquals(myLL.get(0), ss);
		
	}
	

	@Test
	public void testRemove() {
		
		String res = "";
		String a = "";
		for(int i = 0; i < 10; i++) {
			myLL.add(i+"");
		}

		for(int i = myLL.size()-1; i >= 0; i--) {
			a = myLL.get(i);
			res = myLL.remove(i);
			assertEquals(i, myLL.size());
			assertEquals(a,res);
		}

	}

	@Test
	public void testSize() {
		assertEquals(0,myLL.size());
	}

	@Test
	public void testIterator() {
		for(int i = 0; i<10; i++) {
			myLL.add(i+"");
		}
		Iterator<String> it = myLL.iterator();
		
		for(int i = 0; it.hasNext(); i++){
			String res = it.next();
			assertEquals(i+"",res);
		}
		
	    try {
			it.next();
	    } catch (NoSuchElementException ex) {
	        assertEquals(ex.getClass(),NoSuchElementException.class);
	    }
	}
	

}
