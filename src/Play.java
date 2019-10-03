public class Play {
    private int goblindamage =3;
    private int warriordamage=9;

    public  void Play(Warrior warrior)
    {
        int levelcount=0;
        int stepcount=0;
        int killedgobllins=0;

        while (warrior.get_hp()>0)
        {
            Goblin goblin=new Goblin();
            killedgobllins+=1;
            levelcount+=1;
            
            while (goblin.get_hp()>0 && warrior.get_hp()>0)
            {
               if(stepcount%5==0)
                    warrior.ToHeal();
               else warrior.ToAttack(goblin);

                goblin.ToAttack(warrior);
                stepcount+=1;
                LevelInfo(warrior,goblin);
            }
        }


        System.out.println("____________________________"
                          +"\n         GAME OVER"
                          +"\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾"
                +"\nУбито гоблинов -- "+ (killedgobllins-1)
                +"\nПройденно уровней -- "+(levelcount-1)
                +"\nСделанно ходов -- "+(stepcount-1));        ;
    }


    private void LevelInfo(Warrior w, Goblin g)
    {
        System.out.println("______________"
                          +"\n    ВОИН"
                          +"\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾"
        +"\nПолученнный урон:  "+goblindamage+"        Уровень здоровья:  "+w.get_hp());

        System.out.println("______________"
                          +"\n    ГОБЛИН"
                          +"\n‾‾‾‾‾‾‾‾‾‾‾‾‾‾"
                +"\nПолученнный урон:  "+warriordamage+"        Уровень здоровья:  "+g.get_hp());
    }


}
