package laba_2; //2 var

public class main {
    public static void main(String[] args){
        Human obj = new Human();
        Human.Leg legs = new Human.Leg();
        Human.Hand hands = new Human.Hand();
        Human.Head head = new Human.Head();

        obj.Oldest(20);
        obj.GrowthHeight();

        legs.setLength(40.2);
        legs.setWidth(12.3);

        hands.setWidth(5.6);
        hands.setLength(30.2);

        head.SetWorkHead(true);
        System.out.print(head);
        head.SetWorkHead(false);
        System.out.print(head);

        obj.alive = false;
        System.out.print(obj);
    }
}
