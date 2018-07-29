package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		
	}
	
	public int getItemsReceived() {
	return itemsReceived;
	}
	public void setItemsReceived(int a) {
	if(a < 0) {
	itemsReceived = 0;
	}else {
	itemsReceived = a;
	}
	}
	
	public float getDegreesTurned() {
	return degreesTurned;
	}
	public void setDegreesTurned(float b) {
	if(b < 0.0) {
	while(b < -360.0) {
	b += 360.0;
	}
	b += 360;
	degreesTurned = b;
	}if(b > 360.0) {
	while(b > 360.0) {
	b -= 360.0;
	}
	degreesTurned = b;
	}else {
	degreesTurned = b;
	}
	}
	
	public String getNomenclature() {
	return nomenclature;
	}
	public void setNomenclature(String c) {
	if(c == "") {
	nomenclature = " ";
	}else {
	nomenclature = c;
	}
	}
	
	public Object getMemberObj() {
	return memberObj;
	}
	public void setMemberObj(Object d) {
		//
	if(d instanceof String) {
	memberObj = new Object();
	}else {
	memberObj = d;
	}
	}
}
