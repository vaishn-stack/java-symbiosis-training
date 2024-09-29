/*write a program for accepting employee data id ,salary location depending upon user choice a particular employee
&sort the  employee from given collection of employee*/

class Employee {  
    int emp_id, salary;  
    String name, address, department, email;  

    public int getEmp_id() {  
        return emp_id;  
    }  
    public void setEmp_id(int emp_id) {  
        this.emp_id = emp_id;  
    }  
    public int getSalary() {  
        return salary;  
    }  
    public void setSalary(int salary) {  
        this.salary = salary;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getAddress() {  
        return address;  
    }  
    public void setAddress(String address) {  
        this.address = address;  
    }  
    public String getDepartment() {  
        return department;  
    }  
    public void setDepartment(String department) {  
        this.department = department;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
   
    @Override  
    public String toString() {  
        return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address  
                + ", department = " + department + ", email = " + email + "]";  
    }  
} 

public class EmpTest {
    public static void main(String[] args) {
        Employee e = new Employee(); 
        e.setEmp_id(101);  
        e.setName("Vaishnavi");  
        e.setDepartment("IT");  
        e.setSalary(150000);  
        e.setAddress("Bangalore");  
        e.setEmail("vaishnavimorankar296@gmail.com");  
        System.out.println(e);   
        
        int sal = e.getSalary();  
        int increment = 0;  

        if (sal >= 1000 && sal <= 1500) {  
            increment = (sal * 2) / 100;   
            sal = sal + increment;  
            e.setSalary(sal);  
            System.out.println("\nSalary is incremented by 2%\n");  
        } else if (sal > 1500 && sal <= 20000) {  
            increment = (sal * 5) / 100; 
            sal = sal + increment;  
            e.setSalary(sal);  
            System.out.println("\nSalary is incremented by 5%\n");  
        } else if (sal > 20000) { 
            increment = (sal * 10) / 100;  
            sal = sal + increment;  
            e.setSalary(sal);  
            System.out.println("\nSalary is incremented by 10%\n");  
        } else {  
            System.out.println("\nSalary is not incremented\n");  
        }

        System.out.println(e); 
    }
}

