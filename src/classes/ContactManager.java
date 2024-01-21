package classes;

public class ContactManager {
    Contact[] friendsList;
    int friendsCount;

    ContactManager(){
        friendsList = new Contact[100];
        friendsCount = 0;
    }

    void addContact(Contact contact){
        friendsList[friendsCount] = contact;
        friendsCount += 1;
    }

    //합수가 실행 종료되고 반환하는 값 = 리턴값
    Contact searchContact(String name){
        for (int i = 0; i < friendsCount; i++){
            if (name.equals(friendsList[i].name)){
//                Contact f = friendsList[i];
//                System.out.println(f.name);
//                System.out.println(f.email);
//                System.out.println(f.phoneNum);
//                System.out.println(f.age);

                return friendsList[i];
            }
        }
        System.out.println("없서용");
        return null;
    }
    void listAllContacts(){
        for (int i = 0; i < friendsCount; i++){
            System.out.println(i + 1 + ". [" + friendsList[i].name + "] " + friendsList[i].phoneNum);
        }
    }
}
