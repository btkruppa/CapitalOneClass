package JavaAssigment5.Game;

public class Game {

    public static void main(String[] args) {
        GameObject player = new Player();
        GameObject enemy = new Enemy();

        player.update();
        enemy.update();

        System.out.println(player);
        System.out.println(enemy);
    }
}
