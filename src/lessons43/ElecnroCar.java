package lessons43;

public class ElecnroCar {
    private int id;

   public ElecnroCar (int id) {
       this.id = id;
   }
    private class Motor {

        private void start() {
            System.out.println("ElectroCar " + id + " is starting");
        }
    }

    public static class Battery {

       public static void charge() {
           System.out.println("Battery is charging.....");
       }
    }

    public void startCar () {
        Motor motor = new Motor();
        motor.start();
        System.out.println("Car is ready to go....");
       }
   }

