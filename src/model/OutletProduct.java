package model;

public class OutletProduct {

    private int idOutletProduct;
    private Donation donation;
    private String nmOutletProduct;
    private String dsOutletProduct;

    public OutletProduct(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.setIdOutletProduct(idOutletProduct);
        this.setDonation(donation);
        this.setNmOutletProduct(nmOutletProduct);
        this.setDsOutletProduct(dsOutletProduct);
    }

    public int getIdOutletProduct() {
        return idOutletProduct;
    }

    public void setIdOutletProduct(int idOutletProduct) {
        if (idOutletProduct <= 0) {
            throw new RuntimeException("Id length less than one");
        }
        this.idOutletProduct = idOutletProduct;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        if(donation == null) {
            throw new RuntimeException("Donation can't be null");
        }
        this.donation = donation;
    }

    public String getNmOutletProduct() {
        return nmOutletProduct;
    }

    public void setNmOutletProduct(String nmOutletProduct) {
        if(nmOutletProduct.length() > 60) {
            throw new RuntimeException("Name length can't be bigger than 60 chars");
        }
        this.nmOutletProduct = nmOutletProduct;
    }

    public String getDsOutletProduct() {
        return dsOutletProduct;
    }

    public void setDsOutletProduct(String dsOutletProduct) {
        if(dsOutletProduct.length() > 60) {
            throw new RuntimeException("Description length can't be bigger than 60 chars");
        }
        this.dsOutletProduct = dsOutletProduct;
    }
}
