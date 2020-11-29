
public class Televizyon {
    private String model ;
    private String renk ;
    private String marka ;
    private int elektrik_tüketimi ;

    public Televizyon(String model, String renk, String marka, int elektrik_tüketimi) {
        this.model = model;
        this.renk = renk;
        this.marka = marka;
        this.elektrik_tüketimi = elektrik_tüketimi;
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

    public int getElektrik_tüketimi() {
        return elektrik_tüketimi;
    }

    public void setElektrik_tüketimi(int elektrik_tüketimi) {
        this.elektrik_tüketimi = elektrik_tüketimi;
    }
    
    public void fatura_getirisi(int yayın_süresi){
        System.out.println("aylık tv bazlı fatura : " +yayın_süresi*0.066);
    }
}
