import java.util.Objects;

public class Computer {

    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;
    //default constructor
    public Computer(){

    }
    public Computer(String computerNumber,String lcdModel,
                    int ramSize,int hddSize,boolean hasGPU) {
        this.computerNumber=computerNumber;
        this.lcdModel=lcdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGPU=hasGPU;
    }

    public String getComputerNumber(){
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Computer computer = (Computer) o;
            return ramSize==computer.ramSize&&hddSize==computer.hddSize&& Objects.equals(computerNumber,computer.computerNumber)&&Objects.equals(lcdModel,computer.lcdModel)&&Objects.equals(hasGPU,computer.hasGPU);
        }
    public Object clone() {
        return new Computer(computerNumber, lcdModel, ramSize, hddSize, hasGPU);
    }
    }

