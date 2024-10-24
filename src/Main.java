public class Main {
    public static void main(String[] args) {
        Lorry lorry1=new Lorry(1997,"Eranga","UX527332",38);
        MotorCar mortorCar1=new MotorCar(1997,"Eranga","UX527332",37080);
        int lorry1Fee=lorry1.getLicenseFee();
        int lorry1Fee2=lorry1.getTax();
        System.out.println("fee:"+lorry1Fee+"\n"+"tax"+lorry1Fee2);
        int mortorCarFee=mortorCar1.getLicenseFee();
        System.out.println("mortor car fee: "+mortorCarFee);
    }

}