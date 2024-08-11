public class Main {
    public static int bosshealth = 700;
    public static int bossDamage = 30;
    public static String bossDefnce;
    public static int [] healthHeroes ={290, 270,250};
    public static int [] heroesDamage ={20, 17,12};
    public static String [] heroesAtackType ={"physycal", "madjic","Kinetic"};
    public static int roundNumb =0;

    public static void main(String[] args) {
        statistics();
        while (!isGameOver()){
            playRound();
        }
    }
    public static void playRound(){
        roundNumb++;
        chooseBossDefece();
        bossAttacks();
        heroesAttacks();
        statistics();
    }

    public static void statistics(){
        System.out.println("Round :"+ roundNumb +"---------------------------------");
        System.out.println("Здавовье Босса :" + bosshealth + "\nУрон босса :" + bossDamage + "\nЗашита :" + (bossDefnce == null ? "нет зашиты" : bossDefnce));
        for (int i = 0; i < healthHeroes.length; i++) {
            System.out.println(heroesAtackType[i]+"Здавовье :" + healthHeroes[i] + "\nУрон :" + heroesDamage[i]);

        }
    }
    public static void bossAttacks(){
        for (int i = 0; i < healthHeroes.length; i++) {
            healthHeroes[i] = healthHeroes[i]-bossDamage;

        }
    }

    public static void heroesAttacks(){
        for (int i = 0; i < heroesDamage.length; i++) {
            bosshealth = bosshealth-heroesDamage[i];

        }
    }
    public static void chooseBossDefece(){
        //todo realizovat metod
    }
    public static boolean isGameOver(){
            if(bosshealth<=0){
                System.out.println("Heroes won");
                return true;
            }


     boolean allHeroesdead = true;


        for (int i = 0; i < healthHeroes.length; i++) {
            if (healthHeroes[i] > 0){
                allHeroesdead=false;
                break;
            }
        }
            if (allHeroesdead){
            System.out.println("Boss won");
            return true;
            }
        return false;
    }
}