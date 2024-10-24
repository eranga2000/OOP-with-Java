public class MotorCar extends Vehicle{
    int engineCapacity;
    MotorCar(int yearOfManufactured,String ownerName,String regNo, int engineCapacity){
        super(yearOfManufactured,ownerName,regNo);
       this.engineCapacity=  engineCapacity;
    }
    @Override
    int getLicenseFee(){
        if(engineCapacity>=2500){
            return 1250;
        }
        else if(engineCapacity>=1500){
            return 900;
        }
        else{
            return 750;
        }
    }
}
