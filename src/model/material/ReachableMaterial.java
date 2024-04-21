package model.material;

/**
 * Classe que representa um material alcançável.
 * Esta classe estende a classe Material.
 */
public class ReachableMaterial extends Material{

    /**
     * Construtor da classe ReachableMaterial.
     * 
     * @param idMaterial O ID do material.
     * @param nameMaterial O nome do material.
     * @param qtyMaterial A quantidade do material.
     */
    public ReachableMaterial(int idMaterial, String nameMaterial, long qtyMaterial) {
        super(idMaterial, nameMaterial, qtyMaterial);
    }
}
