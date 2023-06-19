package task25;

public class Fork {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public boolean isTaken() {
        return taken;
    }


    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    private boolean taken;

    public Fork(String name) {
        this.name = name;
        taken = false;
    }

    @Override
    public String toString() {
        return name;
    }
}
