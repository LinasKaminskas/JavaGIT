package lt.bta.java2.servlets.auth;

import lt.bta.java2.servlets.Privilege;

import java.util.Set;

public class User {

    String name;
    String email;
    Set<Privilege>rights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Privilege> getRights() {
        return rights;
    }

    public void setRights(Set<Privilege> rights) {
        this.rights = rights;
    }
}
