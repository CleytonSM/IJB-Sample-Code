package model;

import java.util.List;

/**
 * Representa um abatimento aplicado a um produto outlet.
 */
public class Rebate {

    private int idRebate;
    private List<Trade> trades;
    private List<OutletProduct> outletProducts;
    private float pcRebate;
    private String dsRebate;

    /**
     * Cria uma instância de Rebate com o ID, preço para abater e descrição especificados.
     *
     * @param idRebate O ID do abatimento.
     * @param pcRebate O percentual do abatimento.
     * @param dsRebate A descrição do abatimento.
     */
    public Rebate(int idRebate, float pcRebate, String dsRebate) {
        this.setIdRebate(idRebate);
        this.setPcRebate(pcRebate);
        this.setDsRebate(dsRebate);
    }

    /**
     * Obtém o ID do abatimento.
     *
     * @return O ID do abatimento.
     */
    public int getIdRebate() {
        return idRebate;
    }

    /**
     * Define o ID do abatimento.
     *
     * @param idRebate O ID do abatimento.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdRebate(int idRebate) {
        if(idRebate <= 0) {
            throw new RuntimeException("Id can't be less than one");
        }
        this.idRebate = idRebate;
    }

    /**
     * Obtém a lista de trocas associadas ao abatimento.
     *
     * @return A lista de negociações.
     */
    public List<Trade> getTrades() {
        return trades;
    }

    /**
     * Adiciona uma troca à lista de negociações associadas ao abatimento.
     *
     * @param idTrade O ID da troca.
     * @param rebated Indica se a troca foi descontada.
     * @param dsTrade A descrição da troca.
     */
    public void addTrades(int idTrade, boolean rebated, String dsTrade) {
        this.trades.add(new Trade(idTrade, rebated, dsTrade));
    }

    /**
     * Obtém a lista de produtos outlet associados ao abatimento.
     *
     * @return A lista de produtos outlet.
     */
    public List<OutletProduct> getOutletProducts() {
        return outletProducts;
    }

    /**
     * Adiciona um produto outlet à lista de produtos associados ao abatimento.
     *
     * @param idOutletProduct O ID do produto outlet.
     * @param donation A doação associada ao produto outlet.
     * @param nmOutletProduct O nome do produto outlet.
     * @param dsOutletProduct A descrição do produto outlet.
     */
    public void addOutletProducts(int idOutletProduct, Donation donation, String nmOutletProduct, String dsOutletProduct) {
        this.outletProducts.add(new OutletProduct(idOutletProduct, donation, nmOutletProduct, dsOutletProduct));
    }

    /**
     * Obtém o preço dado no abatimento.
     *
     * @return O preço dado no abatimento.
     */
    public float getPcRebate() {
        return pcRebate;
    }

    /**
     * Define o preço dado no abatimento.
     *
     * @param pcRebate O preço dado no abatimento.
     * @throws RuntimeException Se o preço for menor que zero.
     */
    public void setPcRebate(float pcRebate) {
        if (pcRebate < 0F) {
            throw new RuntimeException("Price can't be less than 0");
        }
        this.pcRebate = pcRebate;
    }

    /**
     * Obtém a descrição do abatimento.
     *
     * @return A descrição do abatimento.
     */
    public String getDsRebate() {
        return dsRebate;
    }

    /**
     * Define a descrição do abatimento.
     *
     * @param dsRebate A descrição do abatimento.
     * @throws RuntimeException Se a descrição tiver mais de 100 caracteres.
     */
    public void setDsRebate(String dsRebate) {
        if (dsRebate.length() > 100) {
            throw new RuntimeException("Description can't be bigger than 100 chars");
        }
        this.dsRebate = dsRebate;
    }
}
