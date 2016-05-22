package session4_assignment;

public class encapsulateEmployeeDetails {
	private int empId;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpID()
    {
        return empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public int getEmpAge()
    {
        return empAge;
    }
    public void setEmpID(int id)
    {
    	empId = id;
    }
    public void setEmpName(String strName)
    {
        empName = strName;
    }
    public void setEmpAge(int age)
    {
        empAge = age;
    }

  }
