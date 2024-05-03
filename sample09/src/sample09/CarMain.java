package sample09;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();

        car.name = "G80";
        car.company = "Genesis";
        car.price = 60000000;

        System.out.println("자동차 이름 = " + car.name + ", 제조사 = " + car.company + ", 가격 = " + car.price);

    }
}
