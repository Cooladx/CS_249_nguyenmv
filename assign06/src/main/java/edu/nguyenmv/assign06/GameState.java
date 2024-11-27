package edu.nguyenmv.assign06;
import edu.nguyenmv.assign04.GameBoard;

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable{
    private List<Loadable> objects = new ArrayList<>();
    private GameBoard map = new GameBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }

    public void load(Scanner input) throws GameFileException {
        objects.clear();
        map.clear();
        int lines = input.nextInt();
        for (int i = 0; i < lines; i++) {
            String typeName = input.next();
          Loadable m  = createLoadable(typeName);
          m.load(input);
          objects.add(m);
          if (m instanceof Drawable) {
              ((Drawable) m).draw(map);
          }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n").append(map.getBoardString()).append("\n");
        sb.append("CREATURES:\n");
        objects.stream()
                .filter(o -> o instanceof Creature)
                .forEach(c -> sb.append("* ").append(c).append("\n"));
        sb.append("INVENTORY:\n");
        objects.stream()
                .filter(o -> o instanceof Item)
                .forEach(i -> sb.append("* ").append(i).append("\n"));
        return sb.toString();
    }
    public void save(String filename) throws GameFileException {
        try (PrintWriter writer = new PrintWriter(filename)){
                writer.print(this.toString());
            } catch (Exception e) {
        throw new GameFileException ("Failed to save file!", e);
        }
    }
}
