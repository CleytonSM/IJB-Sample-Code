package model;

/**
 * Classe que representa uma construção.
 */
public class Construction{
    private int idConstruction;

    /**
     * Construtor da classe Construction.
     * 
     * @param idConstruction O identificador da construção.
     */
    public Construction(int idConstruction) {
        this.setIdConstruction(idConstruction);
    }

    /**
     * Obtém o identificador da construção.
     * 
     * @return O identificador da construção.
     */
    public int getIdConstruction() {
        return idConstruction;
    }

    /**
     * Define o identificador da construção.
     * 
     * @param idConstruction O identificador da construção.
     * @throws RuntimeException Se o identificador for menor ou igual a zero.
     */
    public void setIdConstruction(int idConstruction) {
        if(idConstruction <= 0){
            throw new RuntimeException("Id less than one");
        }
        this.idConstruction = idConstruction;
    }
}
