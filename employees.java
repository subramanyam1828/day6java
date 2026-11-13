 abstract class Employees {//employee management system//
    private String name;
    private int empId;
    private double salary;
    public Employees(String name,int empId,double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }
    public String getName(){
        return name;}
    public int getEmpId(){
        return empId;}
    public double getSalary(){
        return salary;}
    protected void setSalary(double salary){
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("name:"+name+"id:"+empId+"salary:"+salary);

    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employees{
    private double bonus;
    public FullTimeEmployee(String name,int empId,double salary,double bonus){
        super(name,empId,salary);
        this.bonus=bonus;
    }
    void calculateSalary(){
        double total=getSalary()+bonus;
        setSalary(total);
        System.out.println("fulltime employee salaty after bonus:"+total);
    }

        
    }
class PartTimeEmployee extends Employees{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name,int empId,int hoursWorked,double hourlyRate){
        super(name,empId,0);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    void calculateSalary(){
        double total=hoursWorked*hourlyRate;
        setSalary(total);
        System.out.println("parttime employee salary(Hours*Rate:"+total);
    }
    }
class Main{
    public static void main(String[] args) {
        PartTimeEmployee e1=new PartTimeEmployee("amit",101,5000,1000);
        PartTimeEmployee e2=new PartTimeEmployee("rahul",102,80,500);
        System.out.println("---employee1---");
        e1.displayDetails();
        e1.calculateSalary();
        e1.displayDetails();
        System.out.println("\n---employee2---");
        e2.displayDetails();
        e2.calculateSalary();
        e2.displayDetails();
    }
}






    

    
    

