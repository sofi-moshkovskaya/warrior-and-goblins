public class Goblin implements ToAttack{
    private int _hp=20;
    private int _attack=6;
    private int _armor=1;


    public Goblin(){}

    public void set_armor(int armor) {
        _armor = armor;
    }

    public int get_armor() {
        return _armor;
    }

    public void set_attack(int attack) {
        _attack = attack;
    }

    public int get_attack() {
        return _attack;
    }

    public void set_hp(int hp) {
        _hp = hp;
    }

    public int get_hp() {
        return _hp;
    }

    @Override
    public void ToAttack(Warrior w) {
        int damage =this.get_attack()-w.get_armor();
        w.set_hp((w.get_hp()-damage));
    }

    @Override
    public void ToAttack(Goblin g) {}

    @Override
    public void ToHeal() {}

}
