package model;

import java.util.List;

public class Rebate {

    private int idRebate;
    private List<Trade> trades;
    private List<OutletProduct> outletProducts;
    private float pcRebate;
    private String dsRebate;

    public Rebate(int idRebate, float pcRebate, String dsRebate) {
        this.setIdRebate(idRebate);
        this.setPcRebate(pcRebate);
        this.setDsRebate(dsRebate);
    }

    public int getIdRebate() {
        return idRebate;
    }

    public void setIdRebate(int idRebate) {
        if(idRebate <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idRebate = idRebate;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void addTrades(int idTrade, boolean rebated, String dsTrade) {
        this.trades.add(new Trade(idTrade, rebated, dsTrade));
    }

    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    public float getPcRebate() {
        return pcRebate;
    }

    public void setPcRebate(float pcRebate) {
        if (pcRebate < 0F) {
            throw new RuntimeException("Price can't be less than 0");
        }
        this.pcRebate = pcRebate;
    }

    public String getDsRebate() {
        return dsRebate;
    }

    public void setDsRebate(String dsRebate) {
        if (dsRebate.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsRebate = dsRebate;
    }
}
