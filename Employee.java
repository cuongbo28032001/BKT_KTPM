public class Employee {
    String name;
    int hoursWorked;
    float hourlyRate;
    float tax;
    float grossPay;
    float netPay;

    public Employee(String name, int hoursWorked, float hourlyRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate= hourlyRate;
    }

    public String getName(){
        return name;
    }

    public void calculatePay(){
        int payableHours;

        if( hoursWorked <= 40){
            payableHours = hoursWorked;
        }else{
            payableHours = 40+(hoursWorked - 40)* 3/2;
        }

//        grossPay = hoursWorked * hourlyRate; (SAI)
        grossPay = payableHours * hourlyRate;

        if(grossPay >= 200){
//            tax = grossPay * 20/100; (SAI)
            tax = (grossPay-200) * 20/100;
        }

        netPay = grossPay - tax;
        System.out.println("Name: " + name);
        System.out.println("Gross: " + grossPay);
        System.out.println("Tax: " + tax);
        System.out.println("Net: " + netPay);
        System.out.println("=========");
    }

    public static void main(String[] args) {
        Employee student_1 = new Employee("ADAMS", 35, 5);
        Employee student_2 = new Employee("BAKER", 40, 5);
        Employee student_3 = new Employee("CAIRNS", 44, 5);
        Employee student_4 = new Employee("DONALD", 20, 6);

        student_1.calculatePay();
        student_2.calculatePay();
        student_3.calculatePay();
        student_4.calculatePay();

    }
}
