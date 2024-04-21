package model.material;

import model.Donation;

public class DonatedMaterial extends Material{
    Material material;
    Donation donation;

    public DonatedMaterial( Material material, Donation donation) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
        this.setDonation(donation);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        if (material == null){
            throw new RuntimeException("Material can't be null");
        }
        this.material = material;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        if (donation == null){
            throw new RuntimeException("Donation can't be null");
        };
    }
}
