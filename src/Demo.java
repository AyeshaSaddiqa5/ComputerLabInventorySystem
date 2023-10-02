public class Demo {
    public static void main(String[] args){
        Employee labAttendant = new Employee("jj", "rtrt");
        Lab lab1 = new Lab("rtrt", 20, labAttendant);
        Lab lab2 = new Lab("rtrt", 15, labAttendant);
        Computer computer1 =new Computer("rr", "1", 8, 512, true);
        Computer computer2 =new Computer("rr", "r", 16, 14, false);
        lab1.addComputer(computer1);
        lab2.addComputer(computer2);
        University university = new University();
        university.addLab(lab1);
        university.addLab(lab2);


    }
}
