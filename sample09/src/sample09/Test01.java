package sample09;

public class Test01 {
	
	public static void main(String[] args) {

        Car car1 = new Car();

        car1.name = "XM3";
        car1.company = "Samsung";
        car1.price = 35000000;

        System.out.println("자동차 이름 = " + car1.name + ", 제조사 = " + car1.company + ", 가격 = " + car1.price);

    }

}
