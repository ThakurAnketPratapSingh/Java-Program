package com.anket.api.h;

public class RecordsRunner {

	record Persion(String name, String email, String phoneNumber) {}
	
//	record Persion(String name, String email, String phoneNumber) {
//		Persion(String name, String email, String phoneNumber) {
//			if (name == null)
//				throw new IllegalArgumentException("name is null");
//			this.name = name;
//			this.email = email;
//			this.phoneNumber = phoneNumber;
//		}
//	}

	public static void main(String[] args) {
		Persion persion = new Persion("Anket", "anket.singh@gmail.com", "9161153581");
		Persion persion1 = new Persion("Anket", "anket.singh@gmail.com", "9161153581");
		Persion persion2 = new Persion("Anket1", "anket.singh@gmail.com", "9161153581");
		System.out.println(persion);
		System.out.println(persion.name());
		System.out.println(persion.equals(persion1));
		System.out.println(persion.equals(persion2));

	}

}
