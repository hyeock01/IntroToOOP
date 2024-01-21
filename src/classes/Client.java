package classes;

public class Client {
    public static void main(String[] args) {
        Contact a1 = new Contact("dongjin");
        Contact a2 = new Contact(27);
        Contact a3 = new Contact("hyeockjin", "h@g.com", "010-010010", 23);

        a1.age = 22;
        a1.phoneNum = "42189142";
        a1.email = "w@w.com";
        a2.name = "sungmin";
        a2.email = "e@e.net";
        a2.phoneNum = "42317841";

        ContactManager cm = new ContactManager();
        cm.addContact(a1);
        cm.addContact(a2);
        cm.addContact(a3);

        System.out.println("현재 연락처 안에" + cm.friendsCount + "명의 사람들이 있습니다.");

        Contact s1 = cm.searchContact("dongjin");

        System.out.println("이메일: " + s1.email + " 전화번호: " + s1.phoneNum + " 나이: " + s1.age);

        cm.listAllContacts();
    }

}
//클래스 안에 생성된 변수 영역 = 필드
//클래스 안에 생성된 변수 = 프로퍼티
//객체를 생성하는 함수 = 컨스트럭터(생성자)
//배열 (선언하는 순간 사이즈가 고정)= 어레이 / 배열은 리스트와 달리 사이즈의 수정이 불가