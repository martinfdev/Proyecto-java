package estructuras;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author pedro
 */
public class Block {

//    private final int index = 0;
    private int Nonce;
    private String data;
    private String preovioushash;
    private String hash, placa, timestamp;

    ;

    public Block(String preovioushash, String placa, String timestamp) {
        this.preovioushash = preovioushash;
        this.placa = placa;
        this.timestamp = timestamp;
        this.hash = calculateHash();
        // System.out.println(getDate());
    }

    //funcion util para obtener el timestamp
    private String getDate() {
        String date;
        return date = new SimpleDateFormat("dd-MM-YY::HH:MM").format(Calendar.getInstance().getTime());
    }

    //funcion que devuelve el hash minado
    private String calculateHash() {
        String tohashblock = placa + timestamp + preovioushash;
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

    public String getTimestamp() {
        return timestamp;
    }

    public int getNonce() {
        return Nonce;
    }

    public String getData() {
        return data = placa + timestamp + preovioushash;
    }

    public String getPreovioushash() {
        return preovioushash;
    }

    public String getHash() {
        return calculateHash();
    }

    public void setData(String data) {
        this.data = data;
    }

}
