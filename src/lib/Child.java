package lib;

public class Child extends Employee{
    String childName;
    String childIdNumber;

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
    
    public void setChild(String ChildName, String ChildIdNumber) {
        this.childName = childName;
        this.childIdNumber = super.getIdNumber();
    }

    public String getChildName() {
        return childName;
    }

    public String getChildIdNumber() {
        return childIdNumber;
    }
}