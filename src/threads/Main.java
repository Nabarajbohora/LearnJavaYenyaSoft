package threads;



public class Main {
    //    static class Multi extends Thread{
//        public void run(){
//            System.out.println("Threds ids running");
//        }
//
//        public static void main(String[] args) {
//            Multi t1 = new Multi();
//            t1.start();
//        }
//    }
    public static class Multi extends Thread {
        public void start() {
            System.out.println("Thraeds is start");
        }

        public static void main(String[] args) {
            Multi r = new Multi();
            r.start();
        }
    }
}