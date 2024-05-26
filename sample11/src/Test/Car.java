package Test;

public class Car {

    // 변수의 접근제한자를 private으로 설정하였습니다.
    private String carName;
    private String carCompany;
    private int carPrice;

    /* Getter */
    // 값을 반환하는 Getter 메서드를 선언하였습니다.
    // Getter의 경우 값을 반환해야 되기 때문에 return 키워드가 있습니다.
    public String getCarName() {
        return this.carName;
    }

    public String getCarCompany() {
        return this.carCompany;
    }

    public int getCarPrice() {
        return this.carPrice;
    }
    
    /* Setter */
    // 값을 저장하는 Setter 메서드를 선언하였습니다.
    // Setter의 경우 값을 가져와야 되기 때문에 파라미터를 지정해야 됩니다.
    // 외부에서 Setter를 사용할 경우 데이터 타입에 맞는 Scanner 기능 등을 사용하면 됩니다.
    // 가져올 값의 데이터 타입을 지정함으로써 객체의 무결성이 증가됩니다.
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
    
    // 저장된 데이터를 일괄적으로 출력하기 위한 메서드를 정의하였습니다.
    public void carInfo() {
    	System.out.print("모델명 = " + this.getCarName());
    	System.out.print(", 제조사 = " + this.getCarCompany());
    	System.out.println(", 판매가 = " + this.getCarPrice());
    }

}
