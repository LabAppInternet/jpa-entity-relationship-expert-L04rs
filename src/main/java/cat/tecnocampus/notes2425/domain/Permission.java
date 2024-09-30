package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
public class Permission {

    @EmbeddedId
    private PermissionID permissionID;

    boolean canRead;
    boolean canEdit;

    public Permission(PermissionID permissionID, boolean canRead, boolean canEdit) {
        this.permissionID = permissionID;
        this.canRead = canRead;
        this.canEdit = canEdit;
    }

    public Permission() {}

    public PermissionID getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(PermissionID permissionID) {
        this.permissionID = permissionID;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
