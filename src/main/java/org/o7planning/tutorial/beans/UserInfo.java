package org.o7planning.tutorial.beans;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L; // Ajoutez un identifiant de version
    private String userName;
    private String country;
    private int post;

    // Constructeur
    public UserInfo(String userName, String country, int post) {
        this.userName = userName;
        this.country = country;
        this.post = post;
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getCountry() {
        return country;
    }

    public int getPost() {
        return post;
    }

    // Vous pouvez également ajouter des setters si nécessaire
}
