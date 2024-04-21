package model;

public class Donation {

    private int idDonation;
    private Donor donor;
    private String dsDonation;
    private Long qtDonation;

    public Donation(int idDonation, Donor donor, String dsDonation, Long qtDonation) {
        this.setIdDonation(idDonation);
        this.setDonor(donor);
        this.setDsDonation(dsDonation);
        this.setQtDonation(qtDonation);
    }

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        if (idDonation <= 0) {
            throw new RuntimeException("Id can't be less than 1");
        }
        this.idDonation = idDonation;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        if (donor == null) {
            throw new RuntimeException("Donor can't be null");
        }
        this.donor = donor;
    }

    public String getDsDonation() {
        return dsDonation;
    }

    public void setDsDonation(String dsDonation) {
        if (dsDonation.length() > 100) {
            throw new RuntimeException("Description length can't be more than 100 chars");
        }
        this.dsDonation = dsDonation;
    }

    public Long getQtDonation() {
        return qtDonation;
    }

    public void setQtDonation(Long qtDonation) {
        if(qtDonation < 1) {
            throw new RuntimeException("Quantity can't be less than 1");
        }
        this.qtDonation = qtDonation;
    }
}
