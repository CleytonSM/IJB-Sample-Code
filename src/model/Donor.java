package model;

/**
 * Representa um doador.
 */
public class Donor {

    private int idDonor;
    private String nmDonor;
    private String cpf;
    private String phone;

    /**
     * Construtor da classe Donor.
     * 
     * @param idDonor O ID do doador.
     * @param nmDonor O nome do doador.
     * @param cpf O CPF do doador.
     * @param phone O número de telefone do doador.
     */
    public Donor(int idDonor, String nmDonor, String cpf, String phone) {
        this.setIdDonor(idDonor);
        this.setNmDonor(nmDonor);
        this.setCpf(cpf);
        this.setPhone(phone);
    }

    /**
     * Obtém o ID do doador.
     * 
     * @return O ID do doador.
     */
    public int getIdDonor() {
        return idDonor;
    }

    /**
     * Define o ID do doador.
     * 
     * @param idDonor O ID do doador.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdDonor(int idDonor) {
        if (idDonor <= 0) {
            throw new RuntimeException("Id can't be less than 1");
        }
        this.idDonor = idDonor;
    }

    /**
     * Obtém o nome do doador.
     * 
     * @return O nome do doador.
     */
    public String getNmDonor() {
        return nmDonor;
    }

    /**
     * Define o nome do doador.
     * 
     * @param nmDonor O nome do doador.
     * @throws RuntimeException Se o tamanho do nome for maior que 45 caracteres.
     */
    public void setNmDonor(String nmDonor) {
        if(nmDonor.length() > 45) {
            throw new RuntimeException("Name length bigger than 45 chars");
        }
        this.nmDonor = nmDonor;
    }

    /**
     * Obtém o CPF do doador.
     * 
     * @return O CPF do doador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do doador.
     * 
     * @param cpf O CPF do doador.
     * @throws RuntimeException Se o tamanho do CPF for diferente de 11 caracteres.
     */
    public void setCpf(String cpf) {
        if(cpf.length() !=  11) {
            throw new RuntimeException("CPF needs to be 11 chars");
        }
        this.cpf = cpf;
    }

    /**
     * Obtém o número de telefone do doador.
     * 
     * @return O número de telefone do doador.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define o número de telefone do doador.
     * 
     * @param phone O número de telefone do doador.
     * @throws RuntimeException Se o tamanho do número de telefone for diferente de 11 caracteres.
     */
    public void setPhone(String phone) {
        if(phone.length() !=  11) {
            throw new RuntimeException("Phone number needs to be 11 chars");
        }
        this.phone = phone;
    }
}
