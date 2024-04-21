package model;

import model.material.DonatedMaterial;

import java.security.DomainLoadStoreParameter;

public class Provider {
    DonatedMaterial donatedMaterial;
    Donation donation;

    public Provider(DonatedMaterial donatedMaterial, Donation donation) {
        this.setDonatedMaterial(donatedMaterial);
        this.setDonation(donation);
    }

    public DonatedMaterial getDonatedMaterial() {
        return donatedMaterial;
    }

    public void setDonatedMaterial(DonatedMaterial donatedMaterial) {
        if (donatedMaterial == null){
            throw new RuntimeException("Donated material can't be null");
        }
        this.donatedMaterial = donatedMaterial;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        if (donation == null){
            throw new RuntimeException("donation can't be null");
        }
        this.donation = donation;
    }
}
