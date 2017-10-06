
public class LCS {
	public static int LCS(String s, String t){
		int m = s.length();
		int n =t.length();
		int result = 0;
		int[][] dp = new int[m+1][n+1];
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
					result = Math.max(result, dp[i][j]);
				}
				else{
					dp[i][j] = 0;
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		String s = "GeeksforGeeks";
		String t = "GeeksQuiz";
		System.out.println(LCS(s,t));
	}
}
