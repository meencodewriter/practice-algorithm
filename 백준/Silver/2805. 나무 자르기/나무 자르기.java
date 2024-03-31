public class Main {
	public static void main(String[] args) throws Exception {
		int n = read(), m = read(), min = 0, max = 0;
		int[] map = new int[n];

		for (int i = 0; i < n; i++) {
			if (max < (map[i] = read())) {
				max = map[i];
			}
		}
		// 20 20 15 13 13 1 2 
		
		int result=0;
		while(min<=max) {
			int mid = (min+max)/2;
			long temp=0;
			for(int i=0;i<n;i++) {
				temp+=(map[i]>mid) ? map[i]-mid:0; 
			}
			if(temp>=m) {
				result=Math.max(mid,result);
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
		System.out.println(result);
	}
	private static int read() throws Exception {
		int c, n = System.in.read() & 15;
		while ((c = System.in.read()) > 32)
			n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
}