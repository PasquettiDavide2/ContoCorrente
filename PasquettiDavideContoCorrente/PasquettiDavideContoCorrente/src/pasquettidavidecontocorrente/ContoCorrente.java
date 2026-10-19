/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasquettidavidecontocorrente;

/**
 *
 * @author pasquetti.davide
 */
public class ContoCorrente {
    
    private String nome;
    private String cognome;
    private String accessonome;
    private String accessocognome;
    private float saldo;
    private float saldoattuale;
    
    /**
     * 
     * @param nome
     * @param cognome 
     */
    public ContoCorrente (String nome, String cognome, float saldo){
        this.nome = nome;
        this.cognome = cognome;
        this.accessonome = "Davide";
        this.accessocognome = "Pasquetti";
        this.saldoattuale = 2100;
        this.saldo = saldo;
    }
    
    /**
     * metodo che tiene il nome sul momento
     * @return 
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * metodo che tiene il cognome sul momento
     * @return 
     */
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * metodo che fara il confronto con il nome per acceddere al conto corrente
     * @return 
     */
    public String getAccessoNome(){
        return this.accessonome;
    }
    
    /**
     * metodo che fara il confronto con il cognome per acceddere al conto corrente
     * @return 
     */
    public String getAccessoCognome(){
        return this.accessocognome;
    }
    
    /**
     * metodo che serve per la somma o la diff del saldo attuale
     * @return 
     */
    public float getSaldo(){
        return this.saldo;
    }
    
    /**
     * sono i soldi che ci sono al mommento dell'avvio del codicxe
     * @return 
     */
    public float getSaldoAttuale(){
        return this.saldoattuale;
    }
    
    /**
     * metodo che versa i soldi sul conto
     * @param saldoattuale
     * @param saldo 
     */
    public void Versa(float saldo) {
        if (saldo > 0) {
            saldoattuale += saldo;
        }
    }
    
    /**
     * metodo che prelieva i soldi sul conto
     * @param saldoattuale
     * @param saldo 
     */
    public void Preleva(float saldo) {
        if (saldo > 0 && saldoattuale <= saldo) {
            saldoattuale = saldoattuale - saldo;
        }
    }
    
    /**
     * satmpa
     * @return 
     */
    public String toString (){
        
        
        /*
        if (this.nome == this.accessonome && this.cognome == this.accessocognome)
        {
            s1 = "Accesso eseguito";
        }
        else {
            s1 = "Accessp negato";
        }*/
        
        
        return "il conto di" + this.nome + " " + this.cognome + "e il suo saldo attuale e di: " + this.saldoattuale;
    }
}
