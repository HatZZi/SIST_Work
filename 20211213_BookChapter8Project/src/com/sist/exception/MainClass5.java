package com.sist.exception;
/*
 * 423page  멀티블록
 * catch(예외처리클래스 a1 | 예외처리클래스 a2) //예상되는 에러가 여러개
 * 사용빈도는 거의 없다.
 */
import java.util.*;
//생략이 가능한 패키지 => java.lang(object, String, StaringBuffer...)
//java.lang, java.util, java.io, jave.net, javax...
//java.sql
public class MainClass5 {

	public static void main(String[] args) {
		/*
		 * 문자열로 데이터를 받아서 => 정수변환O
		 * NumberFormatException
		 * 배열에 저장          => 배열을 벗어날수있다.
		 * ArrayIndexOutOfBoundsException
		 * 저장된 데이터를 나눈다  =>0으로 나눌수있다.
		 * ArithmeticException
		 * 결과값을 출력한다 
		 * 
		 * =>catch 3개이용
		 * =>|로 연결
		 * =>Exception/RuntimeException
		 */
		try {
			//정상수행이 가능한 소스
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 정수 입력: ");
			String no1 = sc.next();
			System.out.println("두번째 정수 입력: ");
			String no2 = sc.next();
			
			//배열에 저장
			int[]arr = new int [2];
			arr[0] = Integer.parseInt(no1);
			arr[1] = Integer.parseInt(no2);
			
			int result = arr[0]/arr[1];
			System.out.println(result);
			//catch : 예상되는 에러처리==>복구
		}catch(NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException e) {
			System.out.println(e.getMessage());
		}
//		}catch(NumberFormatException e) {
//			e.printStackTrace(); //실행과정 출력 =>중간에 멈춤(에러줄수)
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
		
/*
 * catch => 순서
 * ============ 계층구조는 위로 올라갈수록 에러잡는 범위가 크다.
 *              Throwable :에러의 최상위 클래스
 *                  |
 *              |-----------------------------|
 *            Error                       Exception
 *            =====처리가 불가능한 에러        ========= 처리가 가능한 에러
 *            메모리 부족, 편집기문제  		 |         |
 *                         예외처리를 반드시 처리       예외처리가 자유 
 *                         CheckException          UnCheckException
 *                         (javac : 컴파일시 확인)    (java : 실행시 에러)
 *                                |                      |
 *                          IOException             RuntimeException
 *                          SQLException                 |
 *                          ClassNotFoundException  NumberFormatException
 *                          InterruptedException    ArrayIndexOutOfBoundsException
 *                                ...               ArithmeticException
 *                                
 *                                    => 큰 클래스가 밑에 있다.(순서가 존재한다)
 *                                    catch(Exception e){}
 *                                    catch(RuntimeException e){}
 *                                    catch(IOException e {}
 *                                    ===========================오류난다
 *                                    catch(RuntimeException e){}
 *                                    catch(IOException e {}
 *                                    catch(Exception e){}
 *                                    ===========================정상수행
 *                                    catch(RuntimeException e){}
 *                                    catch(Exception e){}
 *                                    catch(NumberFormatException e){}
 *                                    ================================오류난
 */
		
	}
}
