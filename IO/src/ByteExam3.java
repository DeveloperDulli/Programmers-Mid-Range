import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {

		try(
DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			
		
		out.writeInt(100);
		//정수 4byte 저장
		out.writeBoolean(true);
		//Boolean 1byte 저장
		out.writeDouble(50.5);
		//Double 8byte 저장
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
