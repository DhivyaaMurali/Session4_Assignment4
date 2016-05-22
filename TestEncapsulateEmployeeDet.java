package session4_assignment;

public class TestEncapsulateEmployeeDet {
	public static void main(String args[]){
	
	encapsulateEmployeeDetails obj = new encapsulateEmployeeDetails();
	
	obj.setEmpID(112233);
   obj.setEmpName("Yagnya");
   obj.setEmpAge(32);
    System.out.println("Employee Name: " + obj.getEmpName());
    System.out.println("Employee ID: " + obj.getEmpID());
    System.out.println("Employee Age: " + obj.getEmpAge());

}
}
