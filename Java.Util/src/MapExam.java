import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapExam {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		//key�� value���� put���� ����
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		// ���� key�� 2�� ���� �� �����ϴ�.
		map.put("001", "kang");
		//map�� ����� �ڷ��� ���� ����մϴ�.
		System.out.println(map.size());
		//Ű�� 001,002,003�� ���� ���� ����մϴ�.
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		//map�� ����� ��� key���� Set�ڷᱸ���� �����ϴ�.
		Set<String> keys = map.keySet();
		
		//Set �ڷᱸ���� �ִ� ��� key�� ������ ���Ͽ� Iterator�� ���մϴ�.
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			//key�� �����ϴ�.
			String key = iter.next();
			//key�� �ش�Ǵ� value�� �����ϴ�.
			String value = map.get(key);
			//key�� value�� ����մϴ�.
			System.out.println(key + ":" + value);
		}
		
	}

}
