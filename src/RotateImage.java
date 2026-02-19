import java.util.*;
public class RotateImage {
        private static void reverse(int[] arr){
            int i=0, j=arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        private static void transpose(int[][] mat){
                int n = mat.length;
                for(int i=0; i<n; i++){
                        for(int j=i+1; j<n; j++){
                                int temp = mat[i][j];
                                mat[i][j] = mat[j][i];
                                mat[j][i] = temp;
                        }
                }
        }
        private static void rotate(int[][] mat){
                int n = mat.length;
                transpose(mat);
                for(int i=0; i<n; i++){
                        reverse(mat[i]);
                }
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] mat = new int[n][m];
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                mat[i][j] = sc.nextInt();
                        }
                }
                rotate(mat);
                for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                                if(j==n-1){
                                        System.out.print(mat[i][j]);
                                }else{
                                        System.out.print(mat[i][j] + " ");
                                }
                        }
                        System.out.println();
                }
        }
}
