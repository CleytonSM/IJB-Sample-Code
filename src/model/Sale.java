package model;

import java.util.List;

/**
 * Representa uma venda de produtos outlet.
 */
public class Sale implements OutletProductAdder{

    private int idSale;
    private List<OutletProduct> outletProducts;
    private float pcSale;
    private String dsSale;

    /**
     * Construtor da classe Sale.
     * 
     * @param idSale O ID da venda.
     * @param pcSale O preço da venda.
     * @param dsSale A descrição da venda.
     */
    public Sale(int idSale, float pcSale, String dsSale) {
        this.setIdSale(idSale);
        this.setPcSale(pcSale);
        this.setDsSale(dsSale);
    }

    /**
     * Obtém o ID da venda.
     * 
     * @return O ID da venda.
     */
    public int getIdSale() {
        return idSale;
    }

    /**
     * Define o ID da venda.
     * 
     * @param idSale O ID da venda.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdSale(int idSale) {
        if(idSale <= 0) {
            throw new RuntimeException("Comprimento do ID menor que um");
        }
        this.idSale = idSale;
    }

    /**
     * Obtém a lista de produtos da venda.
     * 
     * @return A lista de produtos da venda.
     */
    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    /**
     * Adiciona um produto à lista de produtos da venda.
     * 
     * @param idOutletProduct O ID do produto outlet.
     * @param donation A doação associada ao produto.
     * @param nmOutletProduct O nome do produto outlet.
     * @param dsOutletProduct A descrição do produto outlet.
     */
    @Override
    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    /**
     * Obtém o preço da venda.
     * 
     * @return O preço da venda.
     */
    public float getPcSale() {
        return pcSale;
    }

    /**
     * Define o preço da venda.
     * 
     * @param pcSale O preço da venda.
     * @throws RuntimeException Se o preço for menor que zero.
     */
    public void setPcSale(float pcSale) {
        if (pcSale < 0F) {
            throw new RuntimeException("Price can't be less than 0");
        }
        this.pcSale = pcSale;
    }

    /**
     * Obtém a descrição da venda.
     * 
     * @return A descrição da venda.
     */
    public String getDsSale() {
        return dsSale;
    }

    /**
     * Define a descrição da venda.
     * 
     * @param dsSale A descrição da venda.
     * @throws RuntimeException Se a descrição tiver mais de 100 caracteres.
     */
    public void setDsSale(String dsSale) {
        if (dsSale.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsSale = dsSale;
    }
}
