package model.material;

import model.Donation;

/**
 * Classe que representa um material doado.
 * Esta classe herda da classe Material e contém informações sobre o material doado e a doação associada.
 */
public class DonatedMaterial extends Material{
    Material material;
    Donation donation;

    /**
     * Construtor da classe DonatedMaterial.
     * @param material O material doado.
     * @param donation A doação associada.
     */
    public DonatedMaterial( Material material, Donation donation) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
        this.setDonation(donation);
    }

    /**
     * Obtém o material doado.
     * @return O material doado.
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Define o material doado.
     * @param material O material doado.
     * @throws RuntimeException Se o material for nulo.
     */
    public void setMaterial(Material material) {
        if (material == null){
            throw new RuntimeException("Material não pode ser nulo");
        }
        this.material = material;
    }

    /**
     * Obtém a doação associada.
     * @return A doação associada.
     */
    public Donation getDonation() {
        return donation;
    }

    /**
     * Define a doação associada.
     * @param donation A doação associada.
     * @throws RuntimeException Se a doação for nula.
     */
    public void setDonation(Donation donation) {
        if (donation == null){
            throw new RuntimeException("Donation can't be null");
        };
    }
}
