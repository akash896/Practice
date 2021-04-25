package testpack;

public class Child  extends Parent{
    int id;

    public Child(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println(id);
    }
}
