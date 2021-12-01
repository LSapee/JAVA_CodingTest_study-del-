package level01;

public class Test006 {
	static boolean prime[] = new boolean[10000001];
	
	public static void main(String[] args) throws Exception {
			//�Ҽ� ���ϱ� ��� (�����佺�׳׽��� ü)
	        // ���ϰ��� �ϴ� ���� ����
	        int N = 10000000;
	        int answer = 0;
		  prime[0] = prime[1] = true;
	        
	        for(int i=2; i*i<=N; i++){
	        	// prime[i]�� �Ҽ����
	        	
	            if(!prime[i]){
	            	
	            	// prime[j] �Ҽ��� �ƴ� ǥ��
	            	for(int j=i*i; j<=N; j+=i) prime[j] = true;                
	            }        
	        }    
	        
	        // �Ҽ� ���
	        for(int i=1; i<=N;i++){
	        	       if(!prime[i]) {
	        	    	   answer++; 
	        	       }
	        }
			System.out.println(answer);
	}

}
