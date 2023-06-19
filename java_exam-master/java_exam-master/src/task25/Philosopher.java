package task25;
public class Philosopher extends Thread{
    private final String name;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    @Override
    public void run() {
        if (!leftFork.isTaken()){
            take(leftFork);
            if (!rightFork.isTaken()){
                take(rightFork);
                System.out.println(name + " eats ");
                put(leftFork);
                put(rightFork);
                System.out.println(name + " think ");
            } else {
                put(leftFork);
                System.out.println(name + " think ");
            }
        } else {
            System.out.println(name + " think ");
        }
    }
    public void take(Fork fork){
        System.out.println(name + " takes " + fork);
        fork.setTaken(true);
    }
    public void put(Fork fork){
        System.out.println(name + " puts " + fork);
        fork.setTaken(false);
    }

}
