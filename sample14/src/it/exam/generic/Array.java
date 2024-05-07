package it.exam.generic;

public class Array {
	
	// 컬렉션 하는 내용을 위해 작성한 코드
	
	private Object[] data;
	private int size = 0;
	
	public Array() {
		data = new Object[10];
	}
	
	public void add(Object obj) {
		// 배열 공간이 다 찼을 경우 새로운 배열로 대체
		if(this.data.length == this.size) {
			// 배열 복사
			Object[] newData = new Object[this.size + 10];
			// 배열 복사 = arraycopy(복사할 대상, 시작 위치, 새로운 배열, 복사 위치, 복사할 길이);
			System.arraycopy(data, 0, newData, 0, data.length);
			this.data = newData; // 복사한 배열로 기존 배열을 치환
		}
		
		this.data[size++] = obj;
	}
	
	public Object get(int index) {
		if(index > this.size) {
			System.out.println("인덱스가 범위를 초과합니다.");
			return null;
		}
		else {
			return this.data[index];
		}
	}
	
	public int size() {
		return this.size;
	}

}
