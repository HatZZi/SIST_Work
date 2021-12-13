package sist.com.basic2;

import java.util.Calendar;
//선생님이 짜주신 정답은 주석처리;
public class ObjectEx8 {   
	   //이름,나이,오늘생일,성별,지역,띠,전화번호 
	   String[]data={"남지원#950612-2010547#031)457-1280",
	               "장태훈#981202-1012947#02)457-1980",
	               "최은영#990210-2010547#061)957-1280",
	               "김인수#580510-1010547#02)657-9280"};
	   Man []man=new Man[data.length];//[][][][]
	   Birthday b = new Birthday();
	   Location l = new Location();
	   Ddi d = new Ddi();
	   public void stringProcess() {
		  for (int i = 0; i < data.length; i++) {
		      String []res=data[i].split("#");
		      man[i]=new Man();
		      for(int j=0;j<res.length;j++) {
		         switch (j) {
		         case 0: 
		        	 	man[i].setName(res[j]);
		                break;
		         case 1:
		                man[i].setAge((Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(res[j].substring(0, 2))+1900))+1);                             
		                man[i].setBrith(b.getCal(res[j]));
		                man[i].setGender(genderFind(res[j]));
		                man[i].setDdi(d.findDdi(res[j]));
		                //String birth = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
		                //int number = Calendar.getInstnace().get(Calendar.DATE);
		                //String day = String.valueOf(number>=1 && number<=9? "0".concat(String.valueOf(number));
		                //if(month.concat(day).equals(res[j].substring(2,6))){
		                //man[i].setBirth(true);
		                //}
		                break;
		         case 2:
		        	    man[i].setLocation(l.getLocation(res[j]));
		        	    //res[j].substring(0,res[j].indexOf(")")));
		        	    //String loc = res[j].substring(0,res[j].indexOf(")"));
		        	    //String temp;
		        	    //if(loc.equals("02")) {
		        	    //   temp = "서울";
		        	    //else if(loc.equals("031"))
		        	    //   temp = "경기";
		        	    //else 
		        	    //   temp = "기타";
		        	    //man[i].setLocation(temp);
		        	    //break;
		        	    man[i].setTel(res[j].replace(")", "-"));
		        	    break;
		        
		        	    
		        	 
		        	    
		                        
		         }//switch
		        }//for
		       }//for
		      disp();
		   }
		   public void disp() {
		      for(Man m:man) {
		         System.out.println(m.toString());
		      }
		   }
		   
		   public String genderFind(String data) {
			   if(data.substring(7).startsWith("1")) {
				   return "Man";
			   }else return "Woman";
		   }
	   
	   public static void main(String[] args) {
	      ObjectEx8 o=new ObjectEx8();
	      o.stringProcess();
	      
	   }

	   
	}