package classes;

public class Driver {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("피카츄", "전기", 55, 35);
        Pokemon mewtwo = new Pokemon("뮤츠", "에스퍼", 35, 50);
        Pokemon charizard = new Pokemon("리자몽","불,비행",78, 80);
        Pokemon magikarp = null;

        System.out.println(charizard.name);
        System.out.println(charizard.type);

        System.out.println(mewtwo.hp);
        pikachu.attack(mewtwo);
        System.out.println(mewtwo.hp);

        magikarp = new Pokemon("잉어킹", "물", 30, 0);

        System.out.println(pikachu.ap);
        pikachu.evolve();
        System.out.println(pikachu.ap);
    }
}
