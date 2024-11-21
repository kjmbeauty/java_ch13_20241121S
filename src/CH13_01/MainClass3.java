package CH13_01;

import java.util.HashMap;
import java.util.Map;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 27);
		map.put("이순신", 27);		
		map.put("김유신", 27);
		map.put("홍길동", 35);
		
		System.out.println(map.get("홍길동"));
		System.out.println(map.size());		
		
		map.remove("김유신");
		System.out.println(map.size());	
		
		for (String key: map.keySet()) {
			System.out.println("key:"+key+", value:"+map.get(key));			
		
		}
		
		
		
		
		

	}

}
