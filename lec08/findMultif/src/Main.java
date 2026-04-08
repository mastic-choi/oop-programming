import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    //양수 n을 입력받음.
    if(n <= 0){
      //입력값이 0이면 그냥 0을 출력한다.
      System.out.println(0);
    }else{
      //10이상 99이하의 두 자리 수 중, 입력값의 배수가 되는 수의 개수
      for(int i = 10; i < 100; i ++){
        if (i%n == 0){
          //배수라면
          result += 1;
        }
      }
      //루프가 끝나면 result 출력;
      System.out.println(result);
    }

  }
}