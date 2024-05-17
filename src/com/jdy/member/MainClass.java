package com.jdy.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setName("홍길동");
		member1.setPw("1234");
		member1.setEmail("hong@abc.com");
		member1.setAge(26);
		
					
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
//		
//		Member member2 = new Member();
//		member2.id = "lion";
//		member2.pw = "18745";
//		member2.name = "이순신";
//		member2.email = "kang@abc.com";
//		member2.age = 32;
		
		Member member3 = new Member("whitecat", "이순신", "5678", "white@abc.com", 33);
		// 생성잘ㄹ 사용하여 초기화
		

		System.out.println(member1.getId());
		System.out.println(member1.getName());
		
		System.out.println(member3.getEmail());
	}

}
