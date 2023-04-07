package exercises.technology;

public class Computer extends AbstractEntity{
    private int ram;
    private int storage;
    private boolean hasKeyboard;


    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
        this.getId();

    }


    public void increaseRam(int number){
        this.ram = this.ram + number;
    }
    public void increaseStorage(int number){
        this.storage = this.storage + number;
    }
    public Integer getRam(){
        return this.ram;
    }

}
