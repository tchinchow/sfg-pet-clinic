package guru.springframework.sfgpetclinic.model;

/**
 * PetType
 */
public class PetType extends BaseEntity {

    private String name;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}