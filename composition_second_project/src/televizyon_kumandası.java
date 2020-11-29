
public class televizyon_kumandası {
    private String model ;
    private String renk ;
    private String marka ;
    private int frekans_aralığı ;

    public televizyon_kumandası(String model, String renk, String marka, int frekans_aralığı) {
        this.model = model;
        this.renk = renk;
        this.marka = marka;
        this.frekans_aralığı = frekans_aralığı;
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

    public int getFrekans_aralığı() {
        return frekans_aralığı;
    }

    public void setFrekans_aralığı(int frekans_aralığı) {
        this.frekans_aralığı = frekans_aralığı;
    }
    public void tv_tusa_bas(){
        System.out.println("tv açılıyor....");
    }
    
    
}
