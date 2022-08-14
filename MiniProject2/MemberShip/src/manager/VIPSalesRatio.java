package manager;

public class VIPSalesRatio implements SalesRatio {
	
	//To-do VIP 회원의 경우 5만원 이하는 0%, 
	//5만원에서 10만원 이하는 10%, 10만원에서 20만원 이하는 20%, 
	//20만원 이상은 30%를 할인해 줍니다. 
	
	
	@Override
	public double[] getSalesRatio(int price) {
		
		if(price>200000) {
			return new double[] {0.3, price*0.7};
		}
		else if(price>100000) {
			return new double[] {0.2, price*0.8};
		}
		else if(price>50000) {
			return new double[] {0.1, price*0.9};
		}
		return new double[] {0.0, price};
	}
	
}


