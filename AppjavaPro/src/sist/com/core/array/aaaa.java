package sist.com.core.array;

import java.util.Arrays;

//isEmpty,isFull
//Stack,Queue
public class aaaa {
   int [][]m=new int[2][3];
   int row=0,col=-1;
   public boolean isEmpty() {
      return row==0&& col==-1;
   }
   public boolean isFull() {
      return row==m.length-1 && col==m[0].length-1;
   }
   public void increment() {
      int [][]imsi=new int[m.length+1][m[0].length];//2행3열--->4행3열
       System.arraycopy(m, 0, imsi, 0, m.length);
       m=imsi;
   }
   
   public int []search(int data){
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            if(m[i][j]==data)return new int[]{i,j};
         }
      }
      return null;
   }
   public int []search(int data,int row,int col){
      for(int i=row;i<m.length;i++) {
         for (int j = col>(m[i].length-1)?0:col; j < m[i].length; j++) {
            if(m[i][j]==data)return new int[] {i,j};
         }
      }
      return null;
   }
   public void add(int data) {
      if(isFull())increment();
      if(col<m[0].length-1) {
         col++;
      }else {
         col=0;
         row++;
      }
      m[row][col]=data;
   }
   public void disp() {
      for(int []i:m) {
         System.out.println(Arrays.toString(i));
      }
      System.out.println();
   }
   public void modify(int origin,int change,int row,int col,int state) {
      int []rs=search(origin,row,col);
      System.out.println("Rs="+Arrays.toString(rs));
      if(rs==null)return;
      m[rs[0]][rs[1]]=change;
      if(state=='a')modify(origin, change, row, col, state);
   }
   public static void main(String[] args) {
      aaaa a=new aaaa();
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(40);
      a.add(30);
      a.add(60);
      a.add(70);
      a.disp();
     // System.out.println(a.search(70,0,0));
      a.modify(70, 200, 0, 1, 'a');
      
     // a.disp();
      
      
      
      
   }

}