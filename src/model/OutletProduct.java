package model;

/**
 * Representa um produto de outlet.
 */
public class OutletProduct {

    private int idOutletProduct;
    private Donation donation;
    private String nmOutletProduct;
    private String dsOutletProduct;

    /**
     * Construtor da classe OutletProduct.
     * 
     * @param idOutletProduct O ID do produto de outlet.
     * @param donation A doação associada ao produto.
     * @param nmOutletProduct O nome do produto de outlet.
     * @param dsOutletProduct A descrição do produto de outlet.
     */
    public OutletProduct(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.setIdOutletProduct(idOutletProduct);
        this.setDonation(donation);
        this.setNmOutletProduct(nmOutletProduct);
        this.setDsOutletProduct(dsOutletProduct);
    }

    /**
     * Obtém o ID do produto de outlet.
     * 
     * @return O ID do produto de outlet.
     */
    public int getIdOutletProduct() {
        return idOutletProduct;
    }

    /**
     * Define o ID do produto de outlet.
     * 
     * @param idOutletProduct O ID do produto de outlet.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdOutletProduct(int idOutletProduct) {
        if (idOutletProduct <= 0) {
            throw new RuntimeException("Id length less than one");
        }
        this.idOutletProduct = idOutletProduct;
    }

    /**
     * Obtém a doação associada ao produto de outlet.
     * 
     * @return A doação associada ao produto de outlet.
     */
    public Donation getDonation() {
        return donation;
    }

    /**
     * Define a doação associada ao produto de outlet.
     * 
     * @param donation A doação associada ao produto de outlet.
     * @throws RuntimeException Se a doação for nula.
     */
    public void setDonation(Donation donation) {
        if(donation == null) {
            throw new RuntimeException("Donation can't be null");
        }
        this.donation = donation;
    }

    /**
     * Obtém o nome do produto de outlet.
     * 
     * @return O nome do produto de outlet.
     */
    public String getNmOutletProduct() {
        return nmOutletProduct;
    }

    /**
     * Define o nome do produto de outlet.
     * 
     * @param nmOutletProduct O nome do produto de outlet.
     * @throws RuntimeException Se o nome tiver mais de 60 caracteres.
     */
    public void setNmOutletProduct(String nmOutletProduct) {
        if(nmOutletProduct.length() > 60) {
            throw new RuntimeException("Name length can't be bigger than 60 chars");
        }
        this.nmOutletProduct = nmOutletProduct;
    }

    /**
     * Obtém a descrição do produto de outlet.
     * 
     * @return A descrição do produto de outlet.
     */
    public String getDsOutletProduct() {
        return dsOutletProduct;
    }

    /**
     * Define a descrição do produto de outlet.
     * 
     * @param dsOutletProduct A descrição do produto de outlet.
     * @throws RuntimeException Se a descrição tiver mais de 60 caracteres.
     */
    public void setDsOutletProduct(String dsOutletProduct) {
        if(dsOutletProduct.length() > 60) {
            throw new RuntimeException("Description length can't be bigger than 60 chars");
        }
        this.dsOutletProduct = dsOutletProduct;
    }
}
