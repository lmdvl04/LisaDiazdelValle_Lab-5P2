/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lisadiazdelvalle_lab.pkg5p2;

/**
 *
 * @author HTS
 */
public class Personajes {

    private String nombre, universo, poder, debilidad;
    private int fuerza, agilidadFisica, agilidadMental, vida;

    public Personajes() {
    }

    public Personajes(String nombre, String universo, String poder, String debilidad, int fuerza, int agilidadFisica, int agilidadMental, int vida) {
        this.nombre = nombre;
        this.universo = universo;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;

    }

    public String Stringnombre() {
        return nombre + "\n" + "  Poder-> " + poder + "\n  Debilidad-> " + debilidad + "\n  Fuerza-> " + fuerza + "\n  Agilidad Fisica-> " + agilidadFisica + "\n  Agilidad Mental-> " + agilidadMental + "\n  Vida->" + vida + "\n";

    }

}
