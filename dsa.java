import java.util.Scanner;

public class dsa {
   public static void main(String [] args){
       //declaration
       int[][] arr;

       //allocation
       arr=new int[3][3];

       //initalization
       int[][] brr= {
               {1,2},
               {3,4,9},
               {5,6,7,8}
       };
//       System.out.println(brr[0][0]);
       int rowlenght=brr.length;
//       int collength=brr[0].length;
       for (int rowIndex=0;rowIndex<=rowlenght-1;rowIndex++){
           //hume har current ke liya column length find krni j
           //current row-> brr[rowIndex]
           //isme kitne column hai-> brr[rowIndex}.length
           int collength=brr[rowIndex].length;
       for(int colIndex=0;colIndex<=collength-1;colIndex++){
           System.out.print(brr[rowIndex]  [colIndex] +" ");
       }
           System.out.println();
       }
int[][] crr={
               new int[2],
        new int[5],
        new int[10]
};

       System.out.println(crr[0][0]);
//       int arr[]={100,20,30,40,50};
//       Scanner sc=new Scanner(System.in);
//       int n=arr.length;
//       int sum=0;
//       int ans=1;
//       int minValue=arr[0];

//       for(int i=0;i<n;i++){
//           System.out.println("provie input of index: " + i);
//           arr[i]= sc.nextInt();
//       }
//      for(int i=0;i<=n-1;i++){
//          int val=arr[i];
//        ans= ans*val;
//           sum=sum+val;}
//           System.out.println(ans);

//for(int i=0;i<n;i++){
//    if (arr[i]<minValue){
//        minValue=arr[i];
//    }
//
//}
//       System.out.println(minValue);
        //declaration
//        int arr[];
//
//        //allocatoin
//        arr=new int[5];
//
//        //initialize
//int brr[] = {1,2,3};
//int n=brr.length;
//for(int index=0;index<=n-1;index++){
//        System.out.println(brr[index]);
//    }}
}}
