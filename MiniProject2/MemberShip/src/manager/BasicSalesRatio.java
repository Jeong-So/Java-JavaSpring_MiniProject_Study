package manager;

public class BasicSalesRatio implements SalesRatio {

	// To-do  일반 회원인 경우 5만원 이하는 0%, 
	//5만원에서 10만원 이하는 5%, 
	//10만원에서 20만원 이하는 10% 20만워 초과는 20% 할인해줍니다.

	
	
	@Override
	public double[] getSalesRatio(int price) {

		if(price>200000) {
			return new double[] {0.2, price*0.8};
		}
		else if(price>100000) {
			return new double[] {0.1, price*0.9};
		}
		else if(price>50000) {
			return new double[] {0.05, price*0.95};
		}
		return new double[] {0.0, price};
	}
}
