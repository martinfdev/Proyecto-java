package estructuras;

import beans.Viaje;

/**
 *
 * @author pedro
 */
public class Block {

//    private final int index = 0;
    private int Nonce;
    private Viaje viaje;
    private String data;
    private String preovioushash;
    private String hash;

    public Block(String preovioushash, Viaje viaje) {
        this.preovioushash = preovioushash;      
        this.viaje = viaje;
        this.hash = calculateHash();
    }

    //funcion que devuelve el hash minado
    private String calculateHash() {
        String tohashblock = viaje.getVehiculo().getPlaca() + viaje.getFecha_hora() + preovioushash;
//String caclhash = Encrypted.getSHA256(tohashblock);
        String calchash = Encrypted.getMD5(tohashblock);
        return calchash;
    }

    //funcion para minar el bloque
    public void mineBlock(int difficulty) {
        String target = Encrypted.getDificultyString(difficulty); //Create a string with difficulty * "0" 
        while (!hash.substring(0, difficulty).equals(target)) {
            Nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Minado!!! : " + hash);
    }

//    public int getIndex() {
//        return index;
//    }
//    public String getTimestamp() {
//        return timestamp;
//    }
    public int getNonce() {
        return Nonce;
    }

    public String getData() {
        return data = viaje.getVehiculo().getPlaca() + viaje.getFecha_hora() + preovioushash;
    }

    public String getPreovioushash() {
        return preovioushash;
    }

    public void setPreovioushash(String preovioushash) {
        this.preovioushash = preovioushash;
    }

    public String getHash() {
        return calculateHash();
    }

    public void setData(String data) {
        this.data = data;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
