package CH13_02;

import java.util.Stack;

import CH13_01.MemberDto;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<MemberDto> stack = new Stack<MemberDto>();
		
		stack.push(new MemberDto("홍길동", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));
		stack.push(new MemberDto("이순신", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));
		stack.push(new MemberDto("김유신", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));		
		stack.push(new MemberDto("강감찬", 27, "서울시 용산구", "010-111-2222", "hong@abc.com"));		
		
		MemberDto memberDto1 = stack.pop();
		System.out.println(memberDto1.getMname());
		
		System.out.println("----------------------------------");	
		
		while(!stack.isEmpty()) {
			MemberDto memberDto = stack.pop();
			System.out.println(memberDto.getMname());
			
		}
		
		
		
		
		
		
		
		
	}

}
