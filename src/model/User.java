package model;

/**
 * Representa um usuário.
 */
public class User {

    private int idUser;
    private String email;
    private String password;

    /**
     * Constrói um objeto User com o ID, email e senha fornecidos.
     *
     * @param idUser   o ID do usuário
     * @param email    o email do usuário
     * @param password a senha do usuário
     */
    public User(int idUser, String email, String password) {
        this.setIdUser(idUser);
        this.setEmail(email);
        this.setPassword(password);
    }

    /**
     * Obtém o ID do usuário.
     *
     * @return o ID do usuário
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Define o ID do usuário.
     *
     * @param idUser o ID do usuário
     * @throws RuntimeException se o ID for menor ou igual a zero
     */
    public void setIdUser(int idUser) {
        if (idUser <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idUser = idUser;
    }

    /**
     * Obtém o email do usuário.
     *
     * @return o email do usuário
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do usuário.
     *
     * @param email o email do usuário
     * @throws RuntimeException se o email tiver mais de 60 caracteres
     */
    public void setEmail(String email) {
        if(email.length() > 60) {
            throw new RuntimeException("Email can't be bigger than 60 chars");
        }
        this.email = email;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return a senha do usuário
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha do usuário.
     *
     * @param password a senha do usuário
     * @throws RuntimeException se a senha tiver mais de 40 caracteres
     */
    public void setPassword(String password) {
        if (password.length() > 40) {
            throw new RuntimeException("Password can't be bigger than 40 chars");
        }
        this.password = password;
    }
}
