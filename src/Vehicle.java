abstract public class Vehicle {
    int yearOfManufactured;
    String ownerName;
    String regNo;
  Vehicle(int yearOfManufactured,String ownerName,String regNo){
        this.yearOfManufactured=yearOfManufactured;
        this.regNo=regNo;
        this.ownerName=ownerName;
    }

    void make(){
        System.out.print("Vehicle is making");
    }
    abstract int getLicenseFee();
}
