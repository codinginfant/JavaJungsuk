public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;   // 변수값 초기화
        int age = 14;   // 변수값 초기화

        System.out.println(year);   //  변수 year의 값을 화면에 출력
        System.out.println(age);    // 변수 age의 값을 화면에 출력

        year = age + 2000;  // 변수 age에 저장된 값을 읽어와서 식에 사용
        age = age + 1;  //  변수  age에 저장된 값을 읽어온다

        System.out.println(year);   // 변수 age 값에 2000을 더해서 변수 year에 저장
        System.out.println(age);    // 변수 age 값에 저장된 값을 1 증가시킨다
    }
}
