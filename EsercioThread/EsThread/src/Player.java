import java.util.*;
public class Player extends Thread{
    /** 
     * variabile conta utilizzata per contare i metri dei gareggianti
     */
    private int conta=0;
    /**
     * Nome del partecipante alla gara
     */
    private String nome;
    static ArrayList<String> podio = new ArrayList<String>();
   
    /**
     * Costruttore parametrico - costruisce un oggetto di tipo Player
     * @param nome nome partecipante da assenare all'oggetto Player
     */
    public Player(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce i metri percorsi dall'alteta
     * @return numero di metri percorsi
     */
    public int getConta() {
        return this.conta;
    }

    /**
     * Imposta i metri percorsi dall'atleta
     * @param conta numero di metri percorsi
     */
    public void setConta(int conta) {
        this.conta = conta;
    }
    
    /**
     * Restituisce il nome del partecipante
     * @return nome del partecipante alla gara
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Imposta il nome del partecipante
     * @param nome nome del partecipante della gara
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo che stampa la posizione in cui si trovano i partecipanti e se hanno concluso la gara. Stampa poi il podio finale.
     */
    @Override
    public void run(){
        for(int i = 0; i < 100;i++){
            conta++;
            System.out.println(nome + " è a "+ i + " metri");
        }
        podio.add(nome);
        System.out.println( " \n" + nome + " è arrivato \n");
    }

}