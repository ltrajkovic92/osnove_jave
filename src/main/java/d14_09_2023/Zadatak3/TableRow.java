package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> cells;

    public TableRow () {
        this.cells = new ArrayList<>();
    }
    public void addRowCell (String cell) {
        this.cells.add(cell);
    }
    public void print () {
        for (int i = 0; i < this.cells.size(); i++) {
            if (i == 0) {
                System.out.print(this.cells.get(i) + "\\t\\t|");
            } else {
                System.out.print("\\t\\t" + this.cells.get(i) + "\\t\\t|");
            }
        }
    }
    public void printHtml () {
        System.out.print("<tr>");
        for (String cell : cells) {
            System.out.print("<td>" + cell + "</td>");
        }
        System.out.println("</tr>");
    }
    public boolean hasTheSameText (String text){
        for (int i = 0; i < cells.size(); i++) {
            if(cells.get(i).equals(text))
                return true;
        }
        return false;
    }
}
