import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {

		try(
DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			
		
		out.writeInt(100);
		//���� 4byte ����
		out.writeBoolean(true);
		//Boolean 1byte ����
		out.writeDouble(50.5);
		//Double 8byte ����
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
