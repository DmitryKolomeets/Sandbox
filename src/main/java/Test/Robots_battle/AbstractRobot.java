package Test.Robots_battle;

public abstract class AbstractRobot {


//    public static void main(String[] args) {
//        Robot amigo = new Robot("Амиго");
//        Robot enemy = new Robot("Сгибальщик-02");
//
//        doMove(amigo, enemy);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//        doMove(enemy, amigo);
//        doMove(amigo, enemy);
//    }
//
//    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
//        BodyPart attacked = robotFirst.attack();
//        BodyPart defended = robotSecond.defense();
//        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
//                robotFirst.getName(), robotSecond.getName(), attacked, defended));
//    }
}

//
//    private static int hitCount;
//    public BodyPart attack() {
//        BodyPart attackedBodyPart = null;
//        hitCount = hitCount + 1;
//
//        if (hitCount == 1) {
//            attackedBodyPart = BodyPart.ARM;
//        } else if (hitCount == 2) {
//            attackedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 3) {
//            attackedBodyPart = BodyPart.LEG;
//        } else  {
//            hitCount = 0;
//            attackedBodyPart = BodyPart.CHEST;
//        }
//        return attackedBodyPart;
//    }
//
//    public BodyPart defense() {
//        BodyPart defendedBodyPart = null;
//        hitCount = hitCount + 2;
//
//        if (hitCount == 1) {
//            defendedBodyPart = BodyPart.HEAD;
//        } else if (hitCount == 2) {
//            defendedBodyPart = BodyPart.LEG;
//        } else if (hitCount == 3) {
//            defendedBodyPart = BodyPart.ARM;
//        } else  {
//            hitCount = 0;
//            defendedBodyPart = BodyPart.CHEST;
//        }
//        return defendedBodyPart;
//    }
