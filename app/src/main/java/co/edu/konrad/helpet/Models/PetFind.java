package co.edu.konrad.helpet.Models;

public class PetFind {

    private String petName;
    private String petFindByName;
    private int petImage;

    public PetFind(){

    }

    public PetFind(String petName, String petFindByName,int petImage){
        this.petFindByName =petFindByName;
        this.petImage = petImage;
        this.petName = petName;

    }


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetFindByName() {
        return petFindByName;
    }

    public void setPetFindByName(String petFindByName) {
        this.petFindByName = petFindByName;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }
}
