package CH13_02;

import java.util.LinkedList;
import java.util.Queue;

import CH13_01.MemberDto;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<MemberDto> queue = new LinkedList<MemberDto>();
		
		queue.offer(new MemberDto("홍길동", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));
		queue.offer(new MemberDto("이순신", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));
		queue.offer(new MemberDto("김유신", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));		
		queue.offer(new MemberDto("강감찬", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));		
				
		MemberDto memberDto1 = queue.peek();
		System.out.println(memberDto1.getMname());
		
		System.out.println("----------------------------------");			
		
		while(!queue.isEmpty()) {
			MemberDto memberDto = queue.poll();
			System.out.println(memberDto.getMname());
		
		
		
		

	}

}

}	
	