
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmeticProgression(10);
		float a=1,range=10;
		for(int i=1;i<range;i+=4) {
			a=(float) (a+(1.0/i));
		}
			for(int j=3;j<range;j+=4) {
				a=(float) (a-(1.0/j));
			
		}
		System.out.println(" : "+a);
		
		
	}
	static void arithmeticProgression(int n) {
		System.out.print(1);
		int temp=0;
		for(int i=1;i<=n;i+=2) {
			if(temp%2!=0) {
				System.out.print("-1/"+i);
			}else {
				System.out.print("+1/"+i);
			}temp++;
		}
	}

}
