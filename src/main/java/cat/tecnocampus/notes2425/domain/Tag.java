package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Tag {

    @Id
    String name;

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
