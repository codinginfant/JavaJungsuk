public class VarEx2 {           // 클래스 이름의 첫 글자는 항상 대문자
    public static void main(String[] args) {
        int x = 10, y = 20;     // 변수는 대소문자가 구분. 길이에 제한 없다
        int tmp = 0;            // 예약어는 사용 금지. 숫자로 사용 금지.
                                // 특수문자는 '_' 와 '$' 만 허용

        System.out.println("x:" + x + " y:" + y);

        tmp = x;                // 변수의 이름 주석으로 정보주는 것도 좋음
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);
    }
}
