class Att {
    void StudentStatus(String Present){
        System.out.println("Student is: " + Present);
    }
    void StudentStatus(String Present, String Absent){
        System.out.println("Student is: " + Present + ", Student is " + Absent);
    }
    public static void main(String[] args) {
        Att obj = new Att();
        obj.StudentStatus("Present");
        obj.StudentStatus("Present", "Absent");
    }
}
