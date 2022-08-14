package miniProject1;

import java.util.Scanner;

public class Test2  {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int amount = 0;
		
		while(true) {
			System.out.println("1 : 지출 금액 입력");
			System.out.println("2 : 지출 금액 확인");
			System.out.println("3 : 프로그램 종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int number = scanner.nextInt();

			
			switch(number) {
				case 1:
					// 여기에 1 : 지출 금액 입력 기능을 구현해주세요.
					// 프로그램 사용자에게 아래의 정보를 입력 받게 해주세요. 금액(amount) : 정수형 숫자만 입력 가능
					// 자세한 설명은 함께 제공된 PDF 를 참고해주세요.
					System.out.print("지출 금액을 입력해주세요 : ");
					amount = scanner.nextInt();
					break;
				
					
				case 2:
					// 여기에 2 : 지출 금액 확인을 구현해주세요.
					// 위 '지출 금액 입력' 을 통해 입력된 금액을 화면 텍스트로 출력 되게 해주세요.
					// 자세한 설명은 함께 제공된 PDF 를 참고해주세요.
					int yesNo = 0;
					
					if(amount > 0 ) {
						yesNo = 1;
					}
				
					switch(yesNo) {
						case 1:
							System.out.println(amount);
							break;
						case 0:
							System.out.println("입력되지 않았거나 지출이 0원 입니다.");
							break;
					}
					break;
					
				case 3:
					return;
			}
			
		}

	}

}