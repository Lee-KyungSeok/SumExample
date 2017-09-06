
public class AlgoSum {
	
	//return 1~max ���� ���ϴ� �Լ��� �ۼ�
	/* for�� �̿�
	public long sum(long max) {
		
		long sumNum=0;	
		for(int index=0 ; index<max ; index=index+1) {
			sumNum=sumNum+(index+1);
		}
		
		return sumNum;
		
	}
	*/
	
	//���콺 ���� �̿� (1~max ���ϱ�)
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
	//¦�� ���� count^2+count
	
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
	//Ȧ�� ���� count^2
	
	/* 
	 * �� �ٸ� Ǯ��
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
