package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Table(name = "User_lab")
public class UserLab {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @NotNull
    String username;
    @NotNull
    String email;

    public UserLab(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public UserLab() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
