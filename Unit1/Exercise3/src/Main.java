
import java.lang.*;
import java.sql.Array;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        // The Thinker; Auguste Rodin; Bronze;  Musée Rodin, Paris
        // Man with the Broken Nose; Auguste Rodin; Bronze; Museo Soumaya, Mexico City
        // Venus at her Mirror; Diego de Velázquez; National Gallery, London
        // The Surrender of Breda; Diego Velázquez;  Museo del Prado, Madrid

        Author Velazquez = new Author("Diego de Velazquez", "spanish");
        Author Rodin = new Author("Auguste Rodin", "french");
        Painting Venus = new Painting ("Venus at her Mirror", Painting.typeOfPainting.Oil, "Big");
        Painting Breda = new Painting("The Surrender of Breda", Painting.typeOfPainting.Pastel, "Very big");
        Painting Meninas = new Painting("Las Meninas", Painting.typeOfPainting.Watercolor, "DIN-A 4");
        Sculpture TheThinker = new Sculpture("The Thinker", Sculpture.materials.Bronze, Sculpture.styles.Grecoroman);

        Velazquez.setWorkAuthor(Venus);
        Velazquez.setWorkAuthor(Breda);
        Velazquez.setWorkAuthor(Meninas);
        Rodin.setWorkAuthor(TheThinker);

        Museum ElPrado = new Museum("El Prado", "c/ Mayor", "Madrid", "Spain");
        Room LosAustrias = new Room("Los Austrias");

        ElPrado.addRoomsAtMuseum(LosAustrias);
        LosAustrias.addCurrentExhibition(Venus);
        LosAustrias.addCurrentExhibition(Breda);
        LosAustrias.addCurrentExhibition(Meninas);


        System.out.println("Meet Diego de Velazquez:");
        Velazquez.printWorkAuthor();
        System.out.println("\nSee his picture: Las Meninas:");
        Meninas.printDataPainting();
        System.out.println("\nToday free room at the Museum " + ElPrado.getNameMuseum() + ":");
        ElPrado.ourOpenRooms();

    }
}


// Class Author
class Author{
    // Fields - Class Author
    private String name;
    private String nationality;
    private final ArrayList<Work> workAuthor = new ArrayList<Work>();

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

    public ArrayList<Work> getWorkAuthor() {
        return workAuthor;
    }

    // Methods - Class Author
    public void setWorkAuthor(Work value) {
        workAuthor.add(value);
    }

    public void printWorkAuthor() {
        workAuthor.forEach(work -> System.out.println(work.getTitle()));
    }
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
}

// Class Painting
class Painting extends Work{
    // Enum - Class Painting
    enum typeOfPainting {
        Oil,Pastel, Watercolor
    }

    // Fields - Class Painting
    private final typeOfPainting paintingType;
    private String format;

    // Constructor - Class Painting
    public Painting(String title, typeOfPainting paintingType, String format){
        super(title);
        this.paintingType = paintingType;
        this.format = format;
    }

    // Getters and setters - Class Painting
    public typeOfPainting getPaintingType() {
        return paintingType;
    }
    public String getFormat(){
        return format;
    }
    public void setFormat(String value){
        format = value;
    }

    // Methods - Class Painting
    public void printDataPainting(){
        System.out.println("Painting Title: " + getTitle() + "; format: " + getFormat() + "; painting type: " + getPaintingType());
    }

}

// Class Sculpture
class Sculpture extends Work{
    // Enum - Class Painting
    enum materials{
        Bronze, Iron, Marble
    }
    enum styles{
        Neoclassical, Grecoroman, Cubist
    }
    // Field - Class Sculpture
    private final materials material;
    private final styles style;

    // Constructor - Class Sculpture
    public Sculpture(String title, materials material, styles style){
        super(title);
        this.material = material;
        this.style = style;
    }

    // Getters and setters - Class Sculpture
    public materials getMaterial() {
        return material;
    }
    public styles getStyle() {
        return style;
    }

    // Methods - Class Sculpture
    public void printDataSclpture(){
        System.out.println("Sculpture Title: " + getTitle() + "; material: " + getMaterial() + "; style: " + getStyle());
    }

}

// Class Museum
class Museum{
    // Fields - Class Museum
    private String nameMuseum;
    private String address;
    private String city;
    private String country;
    private final ArrayList<Room> roomsAtMuseum = new ArrayList<Room>();

    // Constructor - Class Sculpture
    public Museum(String nameMuseum, String address, String city, String country){
        this.nameMuseum = nameMuseum;
        this.address = address;
        this.city = city;
        this.country = country;
    }
    // Getters and setters - Class Work
    public String getNameMuseum() {
        return nameMuseum;
    }
    public void setNameMuseum(String value) {
        nameMuseum = value;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String value) {
        address = value;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String value) {
        city = value;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String value) {
        country = value;
    }
    public ArrayList<Room> getRooms() {
        return roomsAtMuseum;
    }

    // Methods - Class Room
    public void addRoomsAtMuseum(Room room){
        roomsAtMuseum.add(room);
    }
    public void removeRoomsAtMuseum(Room room){
        roomsAtMuseum.remove(room);
    }

    public void ourOpenRooms(){
        roomsAtMuseum.forEach(room -> {
            System.out.println("Room: " + room.getRoom());
            room.getCurrentExhibition().forEach(work -> {
                System.out.println("Work: " + work.getTitle());
            });
        });
    }
}

// Class Room
class Room{
    // Field - Class Room
    private String nameRoom;
    private ArrayList<Work> CurrentExhibition = new ArrayList<Work>();

    // Constructor - Class Room
    public Room(String nameRoom){
        this.nameRoom = nameRoom;
    }

    // Getters and setters - Class Room
    public String getRoom() {
        return nameRoom;
    }

    public void setRoom(String value) {
        nameRoom = value;
    }

    public ArrayList<Work> getCurrentExhibition() {
        return CurrentExhibition;
    }

    // Methods - Rooms
    public void addCurrentExhibition(Work work){
        CurrentExhibition.add(work);
    }
    public void removeCurrentExhibition(Work work){
        CurrentExhibition.remove(work);
    }

}