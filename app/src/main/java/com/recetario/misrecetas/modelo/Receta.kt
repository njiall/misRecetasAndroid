package com.recetario.misrecetas.modelo

data class Receta(
    private var nombre: String ="",
    private var categoria: CategoriasEnum = CategoriasEnum.OTROS,
    private var etiquetas: MutableList<EtiquetasEnum> = mutableListOf(),
    private var ingredientes: String = "",
    private var instrucciones: String = "",
    private var notas: String=""
): EntidadAbstracta() {
    private var id: Long = 0

    fun getId(): Long? {
        return id
    }

    /**
     * @param id the id to set
     */
    fun setId(id: Long?) {
        this.id = id!!
    }

    /**
     * @return the nombre
     */
    fun getNombre(): String? {
        return nombre
    }

    /**
     * @param nombre the nombre to set
     */
    fun setNombre(nombre: String?) {
        this.nombre = nombre!!
    }

    /**
     * @return the categoria
     */
    fun getCategoria(): CategoriasEnum? {
        return categoria
    }

    /**
     * @param categoria the categoria to set
     */
    fun setCategoria(categoria: CategoriasEnum?) {
        this.categoria = categoria!!
    }

    /**
     * //	 * @return the ingredientes
     */
    fun getIngredientes(): String? {
        return ingredientes
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    fun setIngredientes(ingredientes: String?) {
        this.ingredientes = ingredientes!!
    }

    /**
     * @return the instrucciones
     */
    fun getInstrucciones(): String? {
        return instrucciones
    }

    /**
     * @param instrucciones the instrucciones to set
     */
    fun setInstrucciones(instrucciones: String?) {
        this.instrucciones = instrucciones!!
    }

    /**
     * @return the notas
     */
    fun getNotas(): String? {
        return notas
    }

    /**
     * @param notas the notas to set
     */
    fun setNotas(notas: String?) {
        this.notas = notas!!
    }

    fun getEtiquetas(): MutableList<EtiquetasEnum> {
        return etiquetas
    }

    fun setEtiquetas(etiquetas: MutableList<EtiquetasEnum>?) {
        this.etiquetas = etiquetas!!
    }

}