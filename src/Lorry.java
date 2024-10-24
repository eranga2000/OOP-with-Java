class Lorry extends Vehicle implements HeavyVehicle{
    int ladenWeight;
    Lorry(int yearOfManufactured,String ownerName,String regNo,  int ladenWeight){
        super(yearOfManufactured,ownerName,regNo);
      this.ladenWeight = ladenWeight;
    }
    @Override
    int getLicenseFee(){
        return 1000+getTax();
    }
    @Override
    public int getTax(){
        if(ladenWeight<3000){
            return 250;
        }
        else{
            return 450;
        }

    }
}