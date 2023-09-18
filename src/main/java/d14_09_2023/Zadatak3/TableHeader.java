package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class TableHeader {
    private ArrayList<String> cells;

    public TableHeader() {
        this.cells = new ArrayList<>();
    }
    public void addHeaderCell(String cell) {
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
        System.out.println();
    }
    public void printHtml () {
        System.out.print("<tr>");
        for (String cell : cells) {
            System.out.print("<th>" + cell + "</th>");
        }
        System.out.println("</tr>");
    }
}
