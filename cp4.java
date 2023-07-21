class Electronics {

    static class Television {
        int priceTv;
        static Television objLoc;

        Television(int costTv) {
            priceTv = costTv;
        }

        Television(Television obj) {
            objLoc = obj;
        }

        public void cost() {
            System.out.println("Cost Of Television:- " + priceTv);
        }

        public static void costStatic() {
            System.out.println("Cost Of Static TV Method:- " + objLoc.priceTv);
        }
    }
}

public class cp4 {
    public static void main(String args[]) {
        Electronics.Television obj1 = new Electronics.Television(500);
        obj1.cost();
        Electronics.Television obj2 = new Electronics.Television(obj1);
        obj2.cost();
        Electronics.Television.costStatic();
    }
}
