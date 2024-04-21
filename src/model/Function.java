package model;

import java.util.List;

public class Function {
    private int idFunction;
    private String nameFunction;
    private List<User> users;

    public Function(int idFunction, String nameFunction) {
        this.setIdFunction(idFunction);
        this.setNameFunction(nameFunction);
    }

    public int getIdFunction() {
        return idFunction;
    }

    public void setIdFunction(int idFunction) {
        if(idFunction <= 0){
            throw new RuntimeException("Function id less than one");
        }
        this.idFunction = idFunction;
    }

    public String getNameFunction() {
        return nameFunction;
    }

    public void setNameFunction(String nameFunction) {
        if (nameFunction.length() > 60){
            throw new RuntimeException("Function name bigger than 60 chars");
        }
        this.nameFunction = nameFunction;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUsers(int idUser, String email, String password) {
        this.users.add(new User(idUser, email, password));
    }
}
