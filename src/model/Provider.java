package model;

import model.material.DonatedMaterial;

/**
 * Representa um provedor de doações.
 */
public class Provider {
    private DonatedMaterial donatedMaterial;
    private Donation donation;

    /**
     * Cria um novo provedor com o material doado e a doação associada.
     *
     * @param donatedMaterial o material doado
     * @param donation a doação associada
     */
    public Provider(DonatedMaterial donatedMaterial, Donation donation) {
        this.setDonatedMaterial(donatedMaterial);
        this.setDonation(donation);
    }

    /**
     * Obtém o material doado.
     *
     * @return o material doado
     */
    public DonatedMaterial getDonatedMaterial() {
        return donatedMaterial;
    }

    /**
     * Define o material doado.
     *
     * @param donatedMaterial o material doado
     * @throws RuntimeException se o material doado for nulo
     */
    public void setDonatedMaterial(DonatedMaterial donatedMaterial) {
        if (donatedMaterial == null){
            throw new RuntimeException("Donated material can't be null");
        }
        this.donatedMaterial = donatedMaterial;
    }

    /**
     * Obtém a doação associada.
     *
     * @return a doação associada
     */
    public Donation getDonation() {
        return donation;
    }

    /**
     * Define a doação associada.
     *
     * @param donation a doação associada
     * @throws RuntimeException se a doação for nula
     */
    public void setDonation(Donation donation) {
        if (donation == null){
            throw new RuntimeException("Donation can't be null");
        }
        this.donation = donation;
    }
}
