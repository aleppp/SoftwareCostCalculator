
package C3;

import java.io.*;

public class Salary implements Serializable{
    private double empSalary;

    public Salary(double empSalary) {
        this.empSalary = empSalary;
    }
    
    public double getSalary() {
        return empSalary;
    }
    
    public String verifyInputs()
    {
        boolean check;
        if(getSalary()==0)
        {
            check=true;
        }
        else
        {
            check=false;
        }
        
        if(check)
        {
           return displayError(); 
        }
        else
        {
            return "Success";
        }
    }
    
    public String displayError()
    {
        return "Please enter salary for each employee"; 
    }
    
    
}
