package review;

public class bark {

	public static void main(String[] args) {
		
		class Animal {
		    public void bark() {
		        System.out.println("");
		    }
		}

		// 기본 생성자 생성
		Animal animal = new Animal();
		
		// Animal 객체의 bark 메서드 사용
		animal.bark();

		class Dog extends Animal {
		    @Override
		    public void bark() {
		        System.out.println("멍멍");
		    }
		}

		// 기본 생성자 생성
		Dog dog = new Dog();
		
		// Dog 객체의 bark 메서드 이용
		dog.bark();

		class Cat extends Animal {
		    @Override
		    public void bark() {
		        System.out.println("야옹");
		    }
		}

		// 기본 생성자 생성
		Cat cat = new Cat();
		// Cat 객체의 bark 메서드 이용
		cat.bark();
		
	}
	
}
