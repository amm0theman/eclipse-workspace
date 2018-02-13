package sortDataInArray;

import elementObjs.ElementUnit;

abstract public class SortElements {
	//Copies array and passes it to sort method which is defined by subclasses
	public void copyElement(ElementUnit elementArray[]) {
		ElementUnit sortedArray[] = elementArray;
		sort(sortedArray, elementArray, elementArray.length, 0);
	}
	
	//To be implemented by subclasses
	abstract ElementUnit[] sort(ElementUnit[] a, ElementUnit[] b, int bLength, int startLocation);
}
