package week1.factoryProjectEg;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println("Enter the type of document you want to create (pdf/excel/word):");
        String s=in.nextLine();
        DocumentFactory pdfDoc = factory.getDocument(s);
        if (pdfDoc != null) {
            pdfDoc.createDoc();
        }       else {
            System.out.println("Invalid document type.");
        }
    }
    
}
