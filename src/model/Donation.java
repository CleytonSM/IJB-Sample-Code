package model;

/**
 * Representa uma doação feita por um doador.
 */
public class Donation {

    private int idDonation;
    private Donor donor;
    private String dsDonation;
    private Long qtDonation;

    /**
     * Cria uma nova instância de Donation.
     * 
     * @param idDonation O ID da doação.
     * @param donor O doador responsável pela doação.
     * @param dsDonation A descrição da doação.
     * @param qtDonation A quantidade da doação.
     */
    public Donation(int idDonation, Donor donor, String dsDonation, Long qtDonation) {
        this.setIdDonation(idDonation);
        this.setDonor(donor);
        this.setDsDonation(dsDonation);
        this.setQtDonation(qtDonation);
    }

    /**
     * Obtém o ID da doação.
     * 
     * @return O ID da doação.
     */
    public int getIdDonation() {
        return idDonation;
    }

    /**
     * Define o ID da doação.
     * 
     * @param idDonation O ID da doação.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdDonation(int idDonation) {
        if (idDonation <= 0) {
            throw new RuntimeException("Id can't be less than 1");
        }
        this.idDonation = idDonation;
    }

    /**
     * Obtém o doador responsável pela doação.
     * 
     * @return O doador responsável pela doação.
     */
    public Donor getDonor() {
        return donor;
    }

    /**
     * Define o doador responsável pela doação.
     * 
     * @param donor O doador responsável pela doação.
     * @throws RuntimeException Se o doador for nulo.
     */
    public void setDonor(Donor donor) {
        if (donor == null) {
            throw new RuntimeException("Donor can't be null");
        }
        this.donor = donor;
    }

    /**
     * Obtém a descrição da doação.
     * 
     * @return A descrição da doação.
     */
    public String getDsDonation() {
        return dsDonation;
    }

    /**
     * Define a descrição da doação.
     * 
     * @param dsDonation A descrição da doação.
     * @throws RuntimeException Se o tamanho da descrição for maior que 100 caracteres.
     */
    public void setDsDonation(String dsDonation) {
        if (dsDonation.length() > 100) {
            throw new RuntimeException("Description length can't be more than 100 chars");
        }
        this.dsDonation = dsDonation;
    }

    /**
     * Obtém a quantidade da doação.
     * 
     * @return A quantidade da doação.
     */
    public Long getQtDonation() {
        return qtDonation;
    }

    /**
     * Define a quantidade da doação.
     * 
     * @param qtDonation A quantidade da doação.
     * @throws RuntimeException Se a quantidade for menor que 1.
     */
    public void setQtDonation(Long qtDonation) {
        if(qtDonation < 1) {
            throw new RuntimeException("Quantity can't be less than 1");
        }
        this.qtDonation = qtDonation;
    }
}
