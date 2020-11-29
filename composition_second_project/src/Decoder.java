
public class Decoder {
    private String model ;
    private String renk ;
    private String marka ;
    private int kanal_sayısı ;
    private decoder_kumandası decoder_k;

    public Decoder(String model, String renk, String marka, int kanal_sayısı, decoder_kumandası decoder_k) {
        this.model = model;
        this.renk = renk;
        this.marka = marka;
        this.kanal_sayısı = kanal_sayısı;
        this.decoder_k = decoder_k;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getKanal_sayısı() {
        return kanal_sayısı;
    }

    public void setKanal_sayısı(int kanal_sayısı) {
        this.kanal_sayısı = kanal_sayısı;
    }

    public decoder_kumandası getDecoder_k() {
        return decoder_k;
    }

    public void setDecoder_k(decoder_kumandası decoder_k) {
        this.decoder_k = decoder_k;
    }
    

   
    public void kanalı_ac(){
        System.out.println("Kanal açıldı.");
    }
    
}
