package vhps.parent.vhps.bean;

import org.springframework.stereotype.Component;

/**
 * @Author CRJ
 * @Date 2022.01.25/2022/1/25
 **/

@Component
public class User {
    private int id;
    private String name;
    private int password;
    private String email;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
