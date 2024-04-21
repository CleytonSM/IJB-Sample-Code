package model;

import java.util.List;

/**
 * Representa uma função do usuário no sistema.
 */
public class Function {
    private int idFunction;
    private String nameFunction;
    private List<User> users;

    /**
     * Constrói um objeto Function com o ID e nome da função do usuário.
     *
     * @param idFunction O ID da função do usuário.
     * @param nameFunction O nome da função do usuário.
     */
    public Function(int idFunction, String nameFunction) {
        this.setIdFunction(idFunction);
        this.setNameFunction(nameFunction);
    }

    /**
     * Obtém o ID da função do usuário.
     *
     * @return O ID da função do usuário.
     */
    public int getIdFunction() {
        return idFunction;
    }

    /**
     * Define o ID da função do usuário.
     *
     * @param idFunction O ID da função do usuário.
     * @throws RuntimeException se o ID da função do usuário for menor ou igual a zero.
     */
    public void setIdFunction(int idFunction) {
        if(idFunction <= 0){
            throw new RuntimeException("Function id less than one");
        }
        this.idFunction = idFunction;
    }

    /**
     * Obtém o nome da função do usuário.
     *
     * @return O nome da função do usuário.
     */
    public String getNameFunction() {
        return nameFunction;
    }

    /**
     * Define o nome da função do usuário.
     *
     * @param nameFunction O nome da função do usuário.
     * @throws RuntimeException se o nome da função do usuário tiver mais de 60 caracteres.
     */
    public void setNameFunction(String nameFunction) {
        if (nameFunction.length() > 60){
            throw new RuntimeException("Function name bigger than 60 chars");
        }
        this.nameFunction = nameFunction;
    }

    /**
     * Obtém a lista de usuários associados à função do usuário.
     *
     * @return A lista de usuários associados à função do usuário.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Adiciona um usuário à função do usuário.
     *
     * @param idUser O ID do usuário.
     * @param email O email do usuário.
     * @param password A senha do usuário.
     */
    public void addUsers(int idUser, String email, String password) {
        this.users.add(new User(idUser, email, password));
    }
}
