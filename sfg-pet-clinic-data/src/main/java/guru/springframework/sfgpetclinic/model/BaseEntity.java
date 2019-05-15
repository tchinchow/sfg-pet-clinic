package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * BaseEntity
 */
public class BaseEntity implements Serializable {

    private Long id;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}