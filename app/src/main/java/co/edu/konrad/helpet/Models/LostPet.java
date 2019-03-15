package co.edu.konrad.helpet.Models;

public class LostPet {

    private String petName;
    private String ownerName;
    private String numerOwner;
    private String direction;
    private String type;
    private int image;

    public LostPet(){}

    public LostPet(String petName, String ownerName,String numerOwner, String direction,String type, int image){
        this.petName = petName;
        this.ownerName = ownerName;
        this.numerOwner = numerOwner;
        this.direction = direction;
        this.type = type;
        this.image = image;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNumerOwner() {
        return numerOwner;
    }

    public void setNumerOwner(String numerOwner) {
        this.numerOwner = numerOwner;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
