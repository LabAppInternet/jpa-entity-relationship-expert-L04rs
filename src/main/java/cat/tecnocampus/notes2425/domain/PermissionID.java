package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

/* Used this Documentation to create Compound Key:
 https://www.baeldung.com/jpa-composite-primary-keys */

@Embeddable
public class PermissionID implements Serializable {

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserLab owner;
    @ManyToOne
    @JoinColumn(name = "note_id")
    private Note note;

    public PermissionID() {
    }

    public PermissionID(UserLab ow, Note no) {
        this.owner = ow;
        this.note = no;
    }

    public Note getNote() {
        return note;
    }

    public UserLab getOwner() {
        return owner;
    }
}
