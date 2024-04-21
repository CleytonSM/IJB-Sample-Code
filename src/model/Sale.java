package model;

import java.math.BigDecimal;
import java.util.List;

public class Sale {

    private int idSale;
    private List<OutletProduct> outletProducts;
    private float pcSale;
    private String dsSale;

    public Sale(int idSale, float pcSale, String dsSale) {
        this.setIdSale(idSale);
        this.setPcSale(pcSale);
        this.setDsSale(dsSale);
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        if(idSale <= 0) {
            throw new RuntimeException("Id length less than one");
        }
        this.idSale = idSale;
    }

    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    public float getPcSale() {
        return pcSale;
    }

    public void setPcSale(float pcSale) {
        if (pcSale < 0F) {
            throw new RuntimeException("Price can't be less than 0");
        }
        this.pcSale = pcSale;
    }

    public String getDsSale() {
        return dsSale;
    }

    public void setDsSale(String dsSale) {
        if (dsSale.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsSale = dsSale;
    }
}
