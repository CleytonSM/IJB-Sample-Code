package model;

public class User {

    private int idUser;
    private String email;
    private String password;

    public User(int idUser, String email, String password) {
        this.setIdUser(idUser);
        this.setEmail(email);
        this.setPassword(password);
    }


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        if (idUser <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.length() > 60) {
            throw new RuntimeException("Email can't be bigger than 60 chars");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 40) {
            throw new RuntimeException("Password can't be bigger than 40 chars");
        }
        this.password = password;
    }
}
