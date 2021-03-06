package sist.com.controller;
import java.util.Calendar;
import java.util.Scanner;

// 나이 ,띠, 요일
public class ControllerEx9_Clue {
	Scanner sc = new Scanner(System.in);
	
   public int getAge(int year) {
      System.out.println();
      return Calendar.getInstance().get(Calendar.YEAR)-year+1;
   }
   public String getDdi(int year) {
	   String []str= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
      return str[year%12];
	   
//	   switch (year%12) {
//      case 0: 
//         return "원숭이";   
//      case 1: 
//         return "닭";   
//      case 2: 
//         return "개";   
//      case 3: 
//         return "돼지";   
//      case 4: 
//         return "쥐";   
//      case 5: 
//         return "소";   
//      case 6: 
//         return "호랑이";   
//      case 7: 
//         return "토끼";   
//      case 8: 
//         return "용";   
//      case 9: 
//         return "뱀";   
//      case 10: 
//         return "말";
//      default:
//         return "양";         
//      }      
   }   
   public boolean isYunDal(int year) {
      return year%4==0&& year%100!=0||year%400==0;
   }
   public int getCount(int year,int month,int day) {
      int cnt=0;
      cnt=(year-1)*365;//
      for(int i=1;i<year;i++) {
         if(isYunDal(i))cnt++;
      }
      for(int i=1;i<month;i++) {
    	  int[]m = {i};
//         switch (i) {
//         case 1:
//         case 3:
//         case 5:
//         case 7:
//         case 8:
//         case 10:
//         case 12:            
//            cnt+=31;
//            break;
//         case 2:
//            if(isYunDal(year))cnt+=29;
//            else
//               cnt+=28;
//            break;
//         default:
//            cnt+=30;         
//         }
      }
      cnt+=day;
      return cnt;      
   }
   public String getWeek(int year,int month,int day) {
        switch (getCount(year, month, day)%7) {
        case 0:
           return "일요일";
        case 1:
           return "월요일";
        case 2:
           return "화요일";
        case 3:
           return "수요일";
        case 4:
           return "목요일";
        case 5:
           return "금요일";
        default:
           return "토요일";
      
        }   
        
   }
   public void input() {   
      System.out.println("몇년도에 태어나셨습니까?");
      int year = sc.nextInt();
      System.out.println("몇월에 태어나셨습니까?");
      int month = sc.nextInt();
      System.out.println("몇일에 태어나셨습니까?");
      int day = sc.nextInt();
      int age=getAge(year);
      String ddi=getDdi(year);
      String week=getWeek(year, month, day);
      disp(year,age,ddi,week);
   }
   public void disp(int year,int age,String ddi,String week) {
      System.out.println(year+"년도에 태어난님 은 "+age+"살");
      System.out.println(year+"년도에 태어난님 은 "+ddi+"띠입니다");
      System.out.println(year+"년도에 태어난님 은 "+week+"에 태어남");
      
      
   }   
   public static void main(String[] args) {      
      ControllerEx9_Clue c=new ControllerEx9_Clue();
      c.input();
   } 

}





