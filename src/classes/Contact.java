package classes;

public class Contact {
    String name;
    String email;
    String phoneNum;
    int age;
    //생성자는 클래스의 이름에 괄호를 붙여서 사용
    private Contact(){

    }
    //생성자는 기본적으로 퍼블릭 메소드(함수)이다
    //그러나 private을 붙인다면 private메소드가 된다
    Contact(String name){
        this.name = name;
    }
    Contact(int age){
        this.age = age;
    }
    Contact(String name, String email, String phoneNum, int age){
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
    }
}
