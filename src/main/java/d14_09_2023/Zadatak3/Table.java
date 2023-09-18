package d14_09_2023.Zadatak3;

import java.util.ArrayList;

public class Table {
    private TableHeader header;
    private ArrayList<TableRow> rows;
    private int rowsNo;

    public Table(int rowsNo) {
        this.rowsNo = rowsNo;
        this.rows = new ArrayList<>();
    }
    public void addRow (TableRow row) {
        this.rows.add(row);
    }

    public void printHTMLTable(){
        System.out.println("<table>");
        System.out.println("<thead>");

        this.header.printHtml();

        System.out.println("</thead>");
        System.out.println("<tbody>");

        for (int i = 0; i < rows.size(); i++) {
            this.rows.get(i).printHtml();
        }

        System.out.println("</tbody>");
        System.out.println("</table>");
        System.out.println();
    }

    public void filter(String text){
        this.header.print();
        for (int i = 0; i < rows.size(); i++) {
            if(rows.get(i).hasTheSameText(text)){
                this.rows.get(i).print();
            }
        }
    }
    public void printTable(int pageNo){
        this.header.print();
        int numberOfPages = this.rows.size()%this.rowsNo==0 ? this.rows.size()/this.rowsNo:this.rows.size()/this.rowsNo + 1;
        int counter=0;

        for (int i = 1; i <= numberOfPages; i++) {
            for (int j = 1; j <= this.rowsNo; j++) {
                if(i == pageNo && counter < this.rows.size()){
                    this.rows.get(counter).print();
                }
                counter++;
            }
            System.out.println();
        }
    }
    public void printPaginator(){
        System.out.println("Broj redova po strani: " + this.rowsNo);
        int numberOfPages = this.rows.size()%this.rowsNo==0 ? this.rows.size()/this.rowsNo:this.rows.size()/this.rowsNo + 1;

        for (int i = 1; i <=numberOfPages; i++) {
            System.out.print("| " + i + " ");
        }
        System.out.println("|");
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public int getRowsNo() {
        return rowsNo;
    }

    public void setRowsNo(int rowsNo) {
        this.rowsNo = rowsNo;
    }
}
