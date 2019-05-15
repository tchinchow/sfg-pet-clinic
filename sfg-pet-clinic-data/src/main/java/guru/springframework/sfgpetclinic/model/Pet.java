package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Pet
 */
public class Pet extends BaseEntity {
    private PetType type;
    private Person owner;
    private LocalDate birthDate;
    

    public PetType getType() {
        return this.type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}