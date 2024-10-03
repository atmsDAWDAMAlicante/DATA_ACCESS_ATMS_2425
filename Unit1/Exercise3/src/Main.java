import java.lang.*;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Author Velazquez = new Author("Diego de Velazquez", "español");
        Author Miron = new Author("Miron", "griego");
        Painting LaVenusDelEspejo = new Painting ("La Venus del Espejo", Painting.typeOfPainting.Oil, "Big");
        Sculpture Discobolo = new Sculpture("Discóbolo", Sculpture.materials.Marble, Sculpture.styles.Grecoroman);
        prMessage(LaVenusDelEspejo.getTitle() + " was painted by " + Velazquez.getName() + " Type: " + LaVenusDelEspejo.paintingType);
        }


    public static void prMessage(String mss){
        System.out.printf(mss);
        }
    }


// Class Author
class Author{
    // Fields - Class Author
    private String name;
    private String nationality;
    //private final ArrayList<Work> workAuthor = new ArrayList();
    // Constructor - Class Author
    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
    // Getters and setters - Class Author
    public String getName() {
        return name;
    }
    public void setName(String value) {
        name = value;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String value) {
        nationality = value;
    }

    // Methods - Class Author

}

// Class Work
class Work{
    // Field - Class Work
    protected String title;

    // Constructor - Class Work
    public Work(String title) {
        this.title = title;
    }

    // Getters and setters - Class Work
    public String getTitle(){
        return title;
    }
    public void setTitle(String value){
        title = value;
    }


    // Methods - Class Room

}
// Class Painting
class Painting extends Work{

    enum typeOfPainting {
        Oil,Pastel, Watercolor
    }

    // Fields - Class Painting
    typeOfPainting paintingType;
    String format;
    // Constructor - Class Painting
    public Painting(String title, typeOfPainting paintingType, String format){
        super(title);
        this.format = format;
        this.paintingType = paintingType;
    }

    // Getters and setters - Class Painting
    public String getFormat(){
        return format;
    }
    public void setFormat(String value){
        format = value;
    }

    // Methods - Class Painting

}

class Sculpture extends Work{
    enum materials{
        Bronze, Iron, Marble
    }
    enum styles{
        Neoclassical, Grecoroman, Cubist
    }
    // Field - Class Sculpture
    materials material;
    styles style;

    // Constructor - Class Sculpture
    public Sculpture(String title, materials material, styles style){
        super(title);
        this.material = material;
        this.style = style;
    }

    // Getters and setters - Class Sculpture


    // Methods - Class Sculpture


}

class Museum{
    // Field - Class xx

    // Constructor - Class Sculpture

    // Getters and setters - Class Work

    // Methods - Class Room


}

class Room{
    // Field - Class Room

    // Constructor - Class Room


    // Getters and setters - Class Room


    // Methods - Class Room
}