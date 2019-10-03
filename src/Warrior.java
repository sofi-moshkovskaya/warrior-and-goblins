public class Warrior implements ToAttack{
    private int _hp = 1000;          
    private int _attack = 10;
    private int _armor = 3;

    public Warrior() {};

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
    public void ToAttack(Warrior w) {};

    @Override
    public void ToAttack(Goblin g) {
        int damage=this.get_attack()-g.get_armor();
        g.set_hp((g.get_hp()-damage));
    }

    @Override
    public void ToHeal() {
        this.set_hp((this.get_hp()+5));
    }
}
