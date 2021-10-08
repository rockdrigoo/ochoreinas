
public class principal{

	public static boolean Sematan(int r1, int c1, int r2, int c2) {
		return r1==r2 || c1==c2 || Math.abs(r1-r2)== Math.abs(c1-c2);
	}
	
	
	public static boolean PosVal(int[] R,int n, int c) {
		for(int i=0; i<n; i++) {
			if(Sematan(i,R[i],n,c))
				return false;
		}
		return true;
	}
	
	public static void Coloca(int[] R, int n) {
		if(n==8) {
			System.out.println("");
			ImprimeSolucion(R);
			return;
		}
		for(int i=0; i<8; i++) {
			if(PosVal(R, n, i)) {
				R[n]=i;
				Coloca(R,n+1);
			}
		}
	}
	
	public static void ImprimeSolucion(int[] R) {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(j==R[i]) {
					System.out.print(" o ");
				}
				else {
					System.out.print(" x ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
			
			int [] R = new int [8];
			for(int i=0; i<8; i++) {
				R[i]=i;
			}
			Coloca(R, 0);	
	}
		
}
