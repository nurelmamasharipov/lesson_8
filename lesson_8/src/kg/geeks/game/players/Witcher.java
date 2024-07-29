package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (this.getHealth() > 0 && hero.getHealth() == 0) {
                hero.setHealth(this.getHealth());
                System.out.println(this.getName() + " пожертвовал собой!");
            }
        }
    }
}
