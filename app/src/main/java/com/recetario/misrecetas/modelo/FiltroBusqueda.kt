package com.recetario.misrecetas.modelo

import java.util.*

class FiltroBusqueda(
    private var nombre: String,
    private var categoria: String,
    private var etiquetas: String,
    private var ingredientes: String,
    private var fechaDesde: Date,
    private var fechaHasta: Date
){
    /**
     * @return the categoria
     */
    fun getCategoria(): String? {
        return this.categoria
    }


    /**
     * @param categoria the categoria to set
     */
    fun setCategoria(categoria: String?) {
        this.categoria = categoria!!
    }


    /**
     * @return the etiquetas
     */
    fun getEtiquetas(): String? {
        return this.etiquetas
    }


    /**
     * @param etiquetas the etiquetas to set
     */
    fun setEtiquetas(etiquetas: String?) {
        this.etiquetas = etiquetas!!
    }


    /**
     * @return the ingredientes
     */
    fun getIngredientes(): String? {
        return this.ingredientes
    }


    /**
     * @param ingredientes the ingredientes to set
     */
    fun setIngredientes(ingredientes: String?) {
        this.ingredientes = ingredientes!!
    }


    /**
     * @return the fechaDesde
     */
    fun getFechaDesde(): Date? {
        return this.fechaDesde
    }


    /**
     * @param fechaDesde the fechaDesde to set
     */
    fun setFechaDesde(fechaDesde: Date) {
        this.fechaDesde = fechaDesde
    }


    /**
     * @return the fechaHasta
     */
    fun getFechaHasta(): Date? {
        return fechaHasta
    }


    /**
     * @param fechaHasta the fechaHasta to set
     */
    fun setFechaHasta(fechaHasta: Date) {
        this.fechaHasta = fechaHasta
    }


    fun getNombre(): String? {
        return nombre
    }
}