
public class AlgoSum {
	
	//return 1~max 까지 더하는 함수를 작성
	/* for문 이용
	public long sum(long max) {
		
		long sumNum=0;	
		for(int index=0 ; index<max ; index=index+1) {
			sumNum=sumNum+(index+1);
		}
		
		return sumNum;
		
	}
	*/
	
	//가우스 공식 이용 (1~max 더하기)
	public long sum(long max) {
		
		long sumNum=0;
		sumNum = max*(max+1)/2;
		
		return sumNum;
	}
	
	public long sumEven(long max) {
		
		long sumNumEven = 0;
		long temp = max/2;
		
		sumNumEven = 2*(temp*(temp+1)/2); //temp^2+temp
			
		return sumNumEven;
	}
	//짝수 합은 count^2+count
	
	public long sumOdd(long max) {
		
		long sumNumOdd = 0;
		long temp = max/2;
		
		if(max%2==1) {
			sumNumOdd = 2*(temp*(temp+1)/2)-temp +max; //temp^2 +max //
		} else {
			sumNumOdd = 2*(temp*(temp+1)/2)-temp; //temp^2
		}
			
		return sumNumOdd;
	}
	//홀수 합은 count^2
	
	/* 
	 * 또 다른 풀이
	public long sumOdd(long max){
		if(max%2==1) max=max+1;
		long count = max/2;
		return count *count;
		
	public long sumEven(long max){
		if(max%2==1) max=max+1;
		long count = max/2;
		return count*count + count;
	}
	
	*/

}
