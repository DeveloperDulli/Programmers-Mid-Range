
public class LamdaExam {

	public static void main(String[] args) {
		new Thread(()-> {

				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
				
			}
					
			}).start();	
	}

	}

//람다식 문법
// (매개변수 목록)->{실행문}

