package sortDataInArray;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import elementObjs.*;

class ElementTestSort {
	public static ElementUnit[] baseList;
	public static ElementUnit[] listToSort;
	public static ElementUnit[] atomicSorted;
	public static ElementUnit[] valenceSorted;
	public static AtomicSort atomicSort;
	public static ValenceSort valenceSort;
	
	//Initializes lists
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Initialize all the lists
		atomicSort = new AtomicSort();
		valenceSort = new ValenceSort();
	}
	
	//Resets the list we are testing the sorts on
	@BeforeEach
	void setUp() {
		listToSort = baseList;
	}
	
	//Ensures atomic sort works
	@Test
	void testAtomicSort() {
		atomicSort.copyElement(listToSort);
		assertEquals(atomicSorted, valenceSorted);
	}
	
	//Ensures valence sort works
	@Test
	void testValenceSort() {
		assertEquals(atomicSorted, valenceSorted);
		atomicSort.copyElement(listToSort);
	}
	
}
