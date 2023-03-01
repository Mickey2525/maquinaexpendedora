/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaexpendedora;

/**
 * @author Elena Romero
 * @version 1.0
 * 
 */

public class MaquinaExpendedoraRomeroMartinezElena2223 {// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precio_maxRomeroMartinezElena2223;//precio máximo que puede tener un snack

    /**
    * Constructor por defecto
    * 
    */
    public MaquinaExpendedoraRomeroMartinezElena2223() {
    
    }
    
    
    /**
    * Constructor por parámetros
    * 
    * @param unidades son las unidades de snack
    * 
    * @param precio es el precio del snack
    * 
    * @param precio_max es el precio máximo 
    * 
    */
    public MaquinaExpendedoraRomeroMartinezElena2223(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precio_maxRomeroMartinezElena2223 = precio_max;
    }
    
    /**
     * Método que devuelve el número de snack que tiene la máquina
     * 
     * @return devuelve las unidades de snack que se pueden obtener
     * 
     */
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /**
     * Método que devuelve el precio que tiene cada snack
     * 
     * @return devuelve precio de cada snack
     * 
    */
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
     /**
      * Método que permite modificar el número de snack dsiponbles de la máquina
      * 
      *@param unidades son las unidades de snack
      */
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }
    
     /**
      * Método que permite aumentar el precio de venta, suma al precio actual
      * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
      * 
      * @param aumento indica el aumento del precio
      * 
      * @throws Exception si el aumento es positivo o si el aumento
      * supera el precio máximo
      * 
      */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxRomeroMartinezElena2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
    /**
     * Método que permite obtener un snack si se tiene suficiente dinero y hay 
     * suficientes unidades en la máquina
     * 
     * @param unidades son las unidades de snack
     * 
     * @param dinero es la cantidad de dinero que cuesta el snack
     * 
     * @param regaloRomeroMartinezElena2223 es el regalo que se obtiene con el snack
     * 
     * @throws Exception si se introduce un valor negativo
     * si no se tiene suficiente dinero para sacar el snack
     * si se intruce una cantidad de snack negativa
     * o si no hay suficientes snack en la maquina
     */
    public void sacarsnack(int unidades, double dinero, String regaloRomeroMartinezElena2223) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.getUnidades() <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precio_maxRomeroMartinezElena2223
     */
    public double getPrecio_maxRomeroMartinezElena2223() {
        return precio_maxRomeroMartinezElena2223;
    }

    /**
     * @param precio_maxRomeroMartinezElena2223 the precio_maxRomeroMartinezElena2223 to set
     */
    public void setPrecio_maxRomeroMartinezElena2223(double precio_maxRomeroMartinezElena2223) {
        this.precio_maxRomeroMartinezElena2223 = precio_maxRomeroMartinezElena2223;
    }

}
