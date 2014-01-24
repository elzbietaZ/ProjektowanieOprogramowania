
package model;

/**
 *
 * @author ElaZ
 */
public class MiejsceNoclegowe {
    
    private String Nazwa;
    private String Kraj;
    private String Miejscowosc;
    private String Ulica;
    private String nrBudynku;
    private String nrLokalu;
    private String gwiazdki;
    private String Uwagi;
    
    public MiejsceNoclegowe(){
        this.Nazwa="";
        this.Miejscowosc="";
        this.Ulica="";
        this.nrBudynku="";
        this.nrLokalu="";
        this.gwiazdki="";
        this.Uwagi="";
    }
    
    MiejsceNoclegowe(String nazwa, String miejscowosc, String ulica, String nrBudynku, String nrLokalu, String gwiazdki, String uwagi){
        this.Nazwa=nazwa;
        this.Miejscowosc=miejscowosc;
        this.Ulica=ulica;
        this.nrBudynku=nrBudynku;
        this.nrLokalu=nrLokalu;
        this.gwiazdki=gwiazdki;
        this.Uwagi=uwagi;
    }


    /**
     * @return the Miejscowość
     */
    public String getMiejscowosc() {
        return Miejscowosc;
    }

    /**
     * @param Miejscowość the Miejscowość to set
     */
    public void setMiejscowosc(String Miejscowosc) {
        this.Miejscowosc = Miejscowosc;
    }

    /**
     * @return the Ulica
     */
    public String getUlica() {
        return Ulica;
    }

    /**
     * @param Ulica the Ulica to set
     */
    public void setUlica(String Ulica) {
        this.Ulica = Ulica;
    }

    /**
     * @return the nrBudynku
     */
    public String getNrBudynku() {
        return nrBudynku;
    }

    /**
     * @param nrBudynku the nrBudynku to set
     */
    public void setNrBudynku(String nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    /**
     * @return the nrLokalu
     */
    public String getNrLokalu() {
        return nrLokalu;
    }

    /**
     * @param nrLokalu the nrLokalu to set
     */
    public void setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    /**
     * @return the gwiazdki
     */
    public String getGwiazdki() {
        return gwiazdki;
    }

    /**
     * @param gwiazdki the gwiazdki to set
     */
    public void setGwiazdki(String gwiazdki) {
        this.gwiazdki = gwiazdki;
    }

    /**
     * @return the Uwagi
     */
    public String getUwagi() {
        return Uwagi;
    }

    /**
     * @param Uwagi the Uwagi to set
     */
    public void setUwagi(String Uwagi) {
        this.Uwagi = Uwagi;
    }

    /**
     * @return the Nazwa
     */
    public String getNazwa() {
        return Nazwa;
    }

    /**
     * @param Nazwa the Nazwa to set
     */
    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    /**
     * @return the Kraj
     */
    public String getKraj() {
        return Kraj;
    }

    /**
     * @param Kraj the Kraj to set
     */
    public void setKraj(String Kraj) {
        this.Kraj = Kraj;
    }
    
}
