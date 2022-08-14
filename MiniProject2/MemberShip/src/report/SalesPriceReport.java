package report;

import java.util.List;

import manager.BasicSalesRatio;
import manager.SalesRatio;
import manager.VIPSalesRatio;
import member.Member;

public class SalesPriceReport {

	List<Member> list;
	
	double ratio = 0.0;
	SalesRatio salesStrategy[] = {new BasicSalesRatio(), new VIPSalesRatio() };
	// FAMILY 등급과 VIP 등급의 세일즈 전략을 2가지로 결정합니다.
	
	public SalesPriceReport(List<Member> list) {
		this.list = list;
	}
	
	public void generateSaleReport(int price) {
		
		// To-do 모든 FAMILY 등급의 회원과, VIP 등급의 회원의 세일즈 보고서를 만듭니다.
		
		int salePrice = 0;
		
		for(int i = 0; i<list.size(); i++) {
			Member member = list.get(i);
			if(member.getMemberGrade() == "Family") {
			// FAMILY 등급
				System.out.println(member.showMemberInfo());
				ratio = salesStrategy[0].getSalesRatio(price)[0];
				salePrice = (int)salesStrategy[0].getSalesRatio(price)[1];
				System.out.println("등급과 가격에 따른 세일 비율은 " + ratio + "이며, 가격은 " + salePrice + "입니다."); 
			}
		
			else if(member.getMemberGrade() == "VIP") {
			//VIP 등급
				System.out.println(member.showMemberInfo());
				ratio = salesStrategy[1].getSalesRatio(price)[0];
				salePrice = (int)salesStrategy[1].getSalesRatio(price)[1];
				System.out.println("등급과 가격에 따른 세일 비율은 " + ratio + "이며, 가격은 " + salePrice + "입니다.");
			}
			
			System.out.println("==========================================================");
			System.out.println();
		}
		
		}
	}
			
