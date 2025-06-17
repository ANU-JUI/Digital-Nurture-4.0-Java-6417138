package week1.factoryProjectEg;

public class word extends DocumentFactory 
{
    @Override
    public void createDoc() {
        System.out.println("Word document created.");
    }
}
