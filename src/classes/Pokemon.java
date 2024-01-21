package classes;

public class Pokemon {
    String name;
    String type;
    int hp;
    int ap;

    public Pokemon(String name, String type, int hp, int ap) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.ap = ap;
    }
    public void attack(Pokemon enemy){
        if (enemy.dodge()){
            System.out.println("적이 공격을 회피했다!");
        }
        else {
            System.out.println("효과는 굉장했다!");
            enemy.hp -= this.ap;
        }
    }

    boolean dodge(){
        return Math.random() > 0.5;
    }

    void evolve(){
        System.out.println("진화 성공!");
        hp += 20;
        ap += 20;
    }



}
