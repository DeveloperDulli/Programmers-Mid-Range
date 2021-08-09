
public class BoxExam {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
	
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		//Object를 사용하는 Box를 인스턴스로 만들겠다는 의미
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		//String을 사용하는 Box인스턴스를 만들겠다는 의미
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		//Integer를 사용하는 Box인스턴스를 만든다는 의미
	
	
	}

}

//Generic : 클래스 이름뒤에 <> 를 넣어 제네릭 적용
