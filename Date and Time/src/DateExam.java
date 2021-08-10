import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());
		
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
				//년도에 나오는 월은 대문자 M
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		System.out.println(today);
		//시스템의 현재시간을 long값으로 가져온다
		
		System.out.println(today - date.getTime());
	}

}
