package lessons43;

public class Test {
    public static void main(String[] args) {
        ElecnroCar elecnroCar = new ElecnroCar(5);
        elecnroCar.startCar();
        System.out.println("______________");
        ElecnroCar.Battery.charge();
    }
}
