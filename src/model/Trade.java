package model;

import model.material.Material;
import model.material.ReachableMaterial;

import java.util.List;

public class Trade {

    private int idTrade;
    private List<Material> material;
    private List<OutletProduct> outletProducts;
    private boolean rebated;
    private String dsTrade;

    public Trade(int idTrade, boolean rebated, String dsTrade) {
        this.setIdTrade(idTrade);
        this.setRebated(rebated);
        this.setDsTrade(dsTrade);
    }

    public int getIdTrade() {
        return idTrade;
    }

    public void setIdTrade(int idTrade) {
        if(idTrade <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idTrade = idTrade;
    }

    public List<Material> getMaterial() {
        return material;
    }

    public void addMaterial(int idMaterial, String nameMaterial, long qtyMaterial) {
        this.material.add(new ReachableMaterial(idMaterial, nameMaterial, qtyMaterial));
    }

    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    public boolean isRebated() {
        return rebated;
    }

    public void setRebated(boolean rebated) {
        this.rebated = rebated;
    }

    public String getDsTrade() {
        return dsTrade;
    }

    public void setDsTrade(String dsTrade) {
        if(dsTrade.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsTrade = dsTrade;
    }
}
