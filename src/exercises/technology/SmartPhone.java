package exercises.technology;

public class SmartPhone extends Computer{
    private int numberOfApps;
    private int id;

    public SmartPhone(int ram, int storage, boolean hasKeyboard, int numberOfApps) {
        super(ram, storage, hasKeyboard);
        this.numberOfApps = numberOfApps;
    }
    public void addApp(){
        this.numberOfApps = this.numberOfApps + 1;
    }
    public int getNumberOfApps(){
        return this.numberOfApps;
    }

}
