public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    //default constructor
    public Lab(){

    }
    public Lab(String labID, int capacity, Employee labAttendant) {
        this.labID = labID;
        this.computers = new Computer[capacity];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = labAttendant;
    }
   public void addComputer(Computer computer){
       for (int i = 0; i < computers.length; i++) {
           if (computers[i]==null) {
               computers[i] = computer;
               return;
           }
       }
       System.out.println("no computer can be added");
   }
   public void removeComputer(String computerNumber){
       for (int i = 0; i < computers.length; i++) {
           if (computers[i] != null){
               computers[i] = null;
               return;
           }
       }
       System.out.println("no");
   }
    public Computer fetchComputer(String computerNumber) {
        for (Computer computer : computers){
           if (computer!=null){
               return computer;
           }
        }
        return null;
    }


    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

}
