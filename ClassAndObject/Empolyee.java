class empolyee{
    void SalaryStaus(int Salary){
        System.out.println("Salary is: " + Salary);
    }
    void SalaryStaus(int Salary, int Bouns){
        System.out.println("Salary is: " + Salary + ", Bouns is: " + Bouns);
        System.out.println("Total Compensation: " + (Salary + Bouns));
    }
    public static void main(String[] args) {
        empolyee obj = new empolyee();
        obj.SalaryStaus(50000);
        obj.SalaryStaus(50000, 5000);
    }
}
