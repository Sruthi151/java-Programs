class Emp {
     int empId;
     String empName;
     String empDept;
    public Emp(int empId,String empName,String empDept){
        this.empId=empId;
        this.empName=empName;
        this.empDept=empDept;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public String getEmpDept(){
        return empDept;
    }
    public void Display(){
        System.out.println("the employee ID:"+empId);
        System.out.println("the employee name:"+empName);
        System.out.println("the employee department:"+empDept);
    }
}
    public class  Program16 extends Emp{
        int busNo;
        String busBoards;
        public Program16(int empId,String empName,String empDept,int busNo,String busBoards){
            super(empId,empName,empDept);
            this.busNo=busNo;
            this.busBoards=busBoards;
        }
        public int getBusNo(){
            return busNo;
        }
        public String getEmpBoards(){
            return busBoards;
        }
        public void Display(){
            super.Display();
            System.out.println("This the bus number:"+busNo);
            System.out.println("The employee boards:"+busBoards);
        }
        public static void main(String args[]){
            Program16 fe=new Program16(1066, "Sruthi", "A", 1, "ac");
            fe.Display();
        }
    }
