package week1.factoryProjectEg;

public class ConcreteFactory {
    public DocumentFactory getDocument(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new pdf();
        } else if (type.equalsIgnoreCase("excel")) {
            return new excel();
        } else if (type.equalsIgnoreCase("word")) {
            return new word();
        }

        return null;
    }

}
