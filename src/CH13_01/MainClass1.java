package CH13_01;

import java.util.ArrayList;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDto member1 = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-8888", "hong@abc.com");    
		MemberDto member2 = new MemberDto("이순신", 32, "서울 종로구", "010-1234-7777", "lee@abc.com");  
		MemberDto member3 = new MemberDto("김유신", 41, "서울 은평구", "010-1234-5555", "kim@abc.com");  		
		
//		int[] arr = {1,2,3,4};
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		memberDtos.add(member1);
		memberDtos.add(member2);
		memberDtos.add(member3);		
		memberDtos.add(new MemberDto("강감찬", 38, "인천 미추홀구", "010-1234-5588", "kang@abc.com"));
		memberDtos.add(new MemberDto("계 백", 51, "대전 동구", "010-1234-7788", "key@abc.com"));
		
		
		MemberDto memberDto4 = memberDtos.get(3);
		MemberDto memberDto5 = memberDtos.get(4);
		
		for (int i=0; i<memberDtos.size();i++) {
			String name = memberDtos.get(i).getMname();
			int age = memberDtos.get(i).getMage();
			String addr = memberDtos.get(i).getMaddr();
			String phone = memberDtos.get(i).getMphone();
			String email = memberDtos.get(i).getMemail();
			
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
			
		}

		System.out.println("------------------------------------");		
		memberDtos.remove(4);
		
		for(MemberDto memberDto:memberDtos) {
			String name = memberDto.getMname();
			int age = memberDto.getMage();
			String addr = memberDto.getMaddr();
			String phone = memberDto.getMphone();
			String email = memberDto.getMemail();
			
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);			
			
			
			
		}
			
			

//		for (int i=0; i<memberDtos.size();i++) {
//			String name = memberDtos.get(i).getMname();
//			int age = memberDtos.get(i).getMage();
//			String addr = memberDtos.get(i).getMaddr();
//			String phone = memberDtos.get(i).getMphone();
//			String email = memberDtos.get(i).getMemail();
//			
//			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
//			System.out.println(memberDtos.get(1).getMname());	
//		
//		}
		
		
		
	}

}
