package sist.com.core.array;

import java.util.Arrays;

//incre / search
public class Test {
   int[][]m= {{1,2,3,4},{5,6,0,0}};//[2][4]m
   //int row=m.length-1, col=m[0].length-1;
  // int []addIdx=new int[2];
         
   
   public void increment() {
      int[][]imsi=new int[m.length*2][m[0].length];
      System.arraycopy(m, 0, imsi, 0, m.length);
      m=imsi; 
      
   }
   
   public int[] search(int data,char state){//찾는 값 인덱스 리턴
      
      if(state=='a') {
         for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
               if(m[i][j]==data) return new int[]{i,j};
               
               
            }
         }
        
         
      }
      if(state=='b') {
          //기존 배열 마지막부터 탐색하면서 첫 빈 공간 찾기
            for (int i = m.length-1; i >= 0; i--) {
               for (int j = m[i].length-1; j >=0; j--) {            
                  //삽입위치 : []addIdx
                  if(m[i][j]!=0) {
                     if(j==m[i].length-1) {//열끝인경우
                         return new int[]{i+1,0}; 
                     }else {
                        return new int[]{i,j+1};                 
                     }                     
                  } 
                  else return null;                                   
               }//
           }//      
         
      }      
      return null;
   }
   public void delete(int data) {
      int[]rs=search(data,'a');//[]rs={행, 열};
      System.out.println(Arrays.toString(rs));
      if(rs==null)return;
      for (int i = rs[0]; i < m.length; i++) {
         for (int j = rs[1]; j < m[i].length; j++) {
            
            if(i==m.length-1&&j==m[i].length-1) {
               m[i][j]=0;
               break;
            }
            if(j==m[i].length-1) {//m열이 끝인 경우
               m[i][j]=m[i+1][0];
               rs[1]=0;//m 열 끝까지 채웠으니까 m 첫 열로 이동               
            }else{
               m[i][j]=m[i][j+1];
            }            
         }
      }      
   }
   
   /*
   public boolean isFull() {
      return row==m.length-1&&col==m[0].length-1;
   }
   
   public boolean isEmpty() {
      return row==0&&col==-1;
   }
   */
   /*
   public void add(int data) {
      //int []addIdx=new int[2];
      //if(isFull())increment();
      
      //기존 배열 마지막부터 탐색하면서 첫 빈 공간 찾기
      for (int i = m.length-1; i >= 0; i--) {
         for (int j = m[i].length-1; j >=0; j--) {
            //삽입위치 : []addIdx
            if(m[i][j]!=0) {
               if(j==m[i].length-1) {//열끝인경우
                  m[i+1][0]=data;break;
                  
               }else {
                  m[i][j+1]=data;break;                  
               }
                  
            }                                    
         }
      }      
      
      
      
      
      /*
      if(col<m[0].length-1) {
         col++;
      }else {
         col=0;
         row++;
      }
      m[row][col]=data;   
      
   }
   */
   public void add(int data) {
        // int []addIdx=new int[2];
        // if(isFull())increment();
      int[] addIdx= search(data,'b');      
       m[addIdx[0]][addIdx[1]]=data;
   }

   public void disp() {
      for(int i[]:m) {
         for(int j:i) {
            System.out.printf("%5d",j);
         }
         System.out.println();
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      Test a=new Test();
      //System.out.println(Arrays.toString(m));
      //a.increment();
      //a.search(6);
      a.disp();
      //a.delete(6);
      a.disp();
      a.add(6); 
      a.disp();
   }
}