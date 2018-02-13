package elementObjs;

public class ElementUnit {
	private int atomicNumber;
	private int valenceShell;
	private String elementName;
	
	public int getAtomicNumber() {
		return atomicNumber;
	}
	
	public int getValenceShell() {
		return valenceShell;
	}
	
	public void setAtomic(int _newAtomic) {
		atomicNumber = _newAtomic;
	}
	
	public void setValence(int _newValence) {
		valenceShell = _newValence;
	}
}
