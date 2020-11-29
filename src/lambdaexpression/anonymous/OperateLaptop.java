package lambdaexpression.anonymous;

public class OperateLaptop  {

    public static <Iphone> void main(String[] args) {
        //Please implement anonymous class for interface laptop
        //Laptop laptop = new Laptop(){}
        //please implement anonymous function for Phone interface
        Laptop laptop = new Laptop() {
            public void ramSize(int memorySize) {
                System.out.println(" Ram : 16 G.B ");
            }
            public void monitorSize(int screenSize) {
                System.out.println(" Display 15.6' ");
            }
            public void ramSize() {}
            public void monitorSize() {}
        };
        laptop.ramSize();
        laptop.monitorSize();

        Phone phone = (network) -> System.out.println(network);
        phone.cellularNetwork("4G LTE");








    }
}
