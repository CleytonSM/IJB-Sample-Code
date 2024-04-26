package model;

import model.material.Material;
import model.material.ReachableMaterial;

import java.util.List;

/**
 * Representa uma troca.
 */
public class Trade implements OutletProductAdder {

    private int idTrade;
    private List<Material> material;
    private List<OutletProduct> outletProducts;
    private boolean rebated;
    private String dsTrade;

    /**
     * Cria uma nova instância de Trade.
     * 
     * @param idTrade O ID da troca.
     * @param rebated Indica se a troca foi rebatida.
     * @param dsTrade A descrição da troca.
     */
    public Trade(int idTrade, boolean rebated, String dsTrade) {
        this.setIdTrade(idTrade);
        this.setRebated(rebated);
        this.setDsTrade(dsTrade);
    }

    /**
     * Obtém o ID da troca.
     * 
     * @return O ID da troca.
     */
    public int getIdTrade() {
        return idTrade;
    }

    /**
     * Define o ID da troca.
     * 
     * @param idTrade O ID da troca.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdTrade(int idTrade) {
        if(idTrade <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idTrade = idTrade;
    }

    /**
     * Obtém a lista de materiais da troca.
     * 
     * @return A lista de materiais da troca.
     */
    public List<Material> getMaterial() {
        return material;
    }

    /**
     * Adiciona um material à troca.
     * 
     * @param idMaterial O ID do material.
     * @param nameMaterial O nome do material.
     * @param qtyMaterial A quantidade do material.
     */
    public void addMaterial(int idMaterial, String nameMaterial, long qtyMaterial) {
        this.material.add(new ReachableMaterial(idMaterial, nameMaterial, qtyMaterial));
    }

    /**
     * Obtém a lista de produtos de saída da troca.
     * 
     * @return A lista de produtos de saída da troca.
     */
    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    /**
     * Adiciona um produto de saída à troca.
     * 
     * @param idOutletProduct O ID do produto de saída.
     * @param donation A doação associada ao produto de saída.
     * @param nmOutletProduct O nome do produto de saída.
     * @param dsOutletProduct A descrição do produto de saída.
     */
    @Override
    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    /**
     * Verifica se a troca foi rebatida.
     * 
     * @return true se a troca foi rebatida, caso contrário false.
     */
    public boolean isRebated() {
        return rebated;
    }

    /**
     * Define se a troca foi rebatida.
     * 
     * @param rebated true se a troca foi rebatida, caso contrário false.
     */
    public void setRebated(boolean rebated) {
        this.rebated = rebated;
    }

    /**
     * Obtém a descrição da troca.
     * 
     * @return A descrição da troca.
     */
    public String getDsTrade() {
        return dsTrade;
    }

    /**
     * Define a descrição da troca.
     * 
     * @param dsTrade A descrição da troca.
     * @throws RuntimeException Se a descrição tiver mais de 100 caracteres.
     */
    public void setDsTrade(String dsTrade) {
        if(dsTrade.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsTrade = dsTrade;
    }
}
