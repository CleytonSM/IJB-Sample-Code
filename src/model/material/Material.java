package model.material;

/**
 * Classe abstrata que representa um material.
 */
public abstract class Material {

    protected int idMaterial;
    protected String nameMaterial;
    protected long qtyMaterial;

    /**
     * Construtor da classe Material.
     * 
     * @param idMaterial   O ID do material.
     * @param nameMaterial O nome do material.
     * @param qtyMaterial  A quantidade do material.
     */
    public Material(int idMaterial, String nameMaterial, long qtyMaterial) {
        this.setIdMaterial(idMaterial);
        this.setNameMaterial(nameMaterial);
        this.setQtyMaterial(qtyMaterial);
    }

    /**
     * Obtém o ID do material.
     * 
     * @return O ID do material.
     */
    public int getIdMaterial() {
        return idMaterial;
    }

    /**
     * Define o ID do material.
     * 
     * @param idMaterial O ID do material.
     * @throws RuntimeException Se o ID for menor ou igual a zero.
     */
    public void setIdMaterial(int idMaterial) {
    if (idMaterial <= 0) {
        throw new RuntimeException("Id length less than one");
    }
        this.idMaterial = idMaterial;
    }

    /**
     * Obtém o nome do material.
     * 
     * @return O nome do material.
     */
    public String getNameMaterial() {
        return nameMaterial;
    }

    /**
     * Define o nome do material.
     * 
     * @param nameMaterial O nome do material.
     * @throws RuntimeException Se o nome tiver mais de 60 caracteres.
     */
    public void setNameMaterial(String nameMaterial) {
        if(nameMaterial.length() > 60){
            throw new RuntimeException("Name length bigger than 60 chars");
        }
        this.nameMaterial = nameMaterial;
    }

    /**
     * Obtém a quantidade do material.
     * 
     * @return A quantidade do material.
     */
    public long getQtyMaterial() {
        return qtyMaterial;
    }

    /**
     * Define a quantidade do material.
     * 
     * @param qtyMaterial A quantidade do material.
     * @throws RuntimeException Se a quantidade for menor que zero.
     */
    public void setQtyMaterial(long qtyMaterial) {
        if(qtyMaterial < 0){
            throw new RuntimeException("Quantity less than 0");
        }
        this.qtyMaterial = qtyMaterial;
    }
}
