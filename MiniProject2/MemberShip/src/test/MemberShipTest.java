package test;

import java.util.List;

import manager.ListManager;
import manager.SortedManager;
import member.Member;
import member.VIPMember;
import report.SalesPriceReport;

public class MemberShipTest {

	public static void main(String[] args) {
	
		Member memberKim = new Member(1001, "Kim"); // 2
		Member memberLee = new Member(1002, "Lee");   // 3
		Member memberSong = new Member(1003, "Song");  // 6
		
		VIPMember memberPark = new VIPMember(1004, "Park", 123); //4
		VIPMember memberSeo = new VIPMember(1005, "Seo", 456);  // 5
		VIPMember memberHan = new VIPMember(1006, "Han", 789);  // 1
		
		
		
		// ListManager 에 모든 고객을 관리
		
		ListManager listManager = new ListManager();
		listManager.addMember(memberKim);
		listManager.addMember(memberLee);
		listManager.addMember(memberSong);
		listManager.addMember(memberPark);
		listManager.addMember(memberSeo);
		listManager.addMember(memberHan);
		
		
		
		// 모든 고객의 정보를 출력
		
		listManager.showAllMember();
		System.out.println("==========================================================");
		System.out.println();
		
		//
			
		List<Member> list = listManager.getMemberList();
		SalesPriceReport salesReport = new SalesPriceReport(list);
		
		System.out.println("100000 만원 짜리 물건을 살때 Member 와 VIPMember 의 가격을 출력하기");
		salesReport.generateSaleReport(100000);
	    System.out.println("250000 만원 짜리 물건을 살때 Member 와 VIPMember 의 가격을 출력하기");
		salesReport.generateSaleReport(250000);
		 
		
		
		// 모든 멤버를 이름 순으로 출력하세요
		
		System.out.println("모든 멤버를 이름순으로 출력하세요");
		SortedManager sortedManager = new SortedManager();
		sortedManager.addMember(memberKim);
		sortedManager.addMember(memberLee);
		sortedManager.addMember(memberSong);
		sortedManager.addMember(memberPark);
		sortedManager.addMember(memberSeo);
		sortedManager.addMember(memberHan);
		sortedManager.showAllMember();
		
	
	}
}
