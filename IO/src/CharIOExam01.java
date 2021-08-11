import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in - 키보드를 의미
		String line = null;
		
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(line);
	}

}
