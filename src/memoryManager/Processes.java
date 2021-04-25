package memoryManager;
import java.util.*;

public class Processes {
    String name;
    List<Variable> variableList;

    public Processes(String name) {
        this.name = name;
        this.variableList = new ArrayList<Variable>();
    }
}
