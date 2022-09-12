package laba_2;

public class Human {
    boolean alive;
    int kol_hands;
    int kol_legs;
    float height;
    float vozrast;

    static class Leg{
        private double width; //ширина
        private double length;

        public void setWidth(double width){
            this.width = width;
        }

        public double getWidth(){
            return this.width;
        }

        public void setLength(double length){
            this.length = length;
        }

        public double getLength(){
            return this.length;
        }

    }

    static class Hand{
        private double width; //ширина
        private double length;

        public void setWidth(double width){
            this.width = width;
        }

        public double getWidth(){
            return this.width;
        }

        public void setLength(double length){
            this.length = length;
        }

        public double getLength(){
            return this.length;
        }
    }

    static class Head{
        boolean WorkHead;
        public void SetWorkHead(boolean work){
            WorkHead = work;
        }
        public String toString(){
            if(WorkHead == true) return "Нынешнее состояние головы - рабочее\n";
            else return "Нынешнее состояние головы - не рабочее\n";
        }
    }

    public Human(){
        alive = true;
        kol_legs = 2;
        kol_hands = 2;
        height = 0.45f;
        vozrast = 1;
    }

    public void Oldest(int v){
        if(vozrast <90 ) vozrast = vozrast + v;
        else alive = false;
    }

    public void GrowthHeight(){
        if(height<1.90) height = height + this.vozrast * 0.1f;
    }

    public String toString(){
        if(this.alive == true) return "возраст - " + vozrast;
        return "жизнь закончилась";
    }

}
