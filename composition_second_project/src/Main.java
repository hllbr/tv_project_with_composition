
public class Main {
    public static void main(String[] args) {
        televizyon_kumandası tv_kumanda = new televizyon_kumandası("sonny-t9000 pro", "uzay mavisi", "sony grup", 9500);
        Televizyon tv = new Televizyon("sunny", "uzay pembesi", "sunny", 60);
        decoder_kumandası dc_kumanda = new decoder_kumandası("gold-pro t5000", "eflatun", "gold haster", 98000);
        Decoder dc = new Decoder("gold-t5900", "mor", "gold haster", 9000, dc_kumanda);
        tv.fatura_getirisi(600);
        dc.getDecoder_k().kırmızı_tusa_bas();
        System.out.println(dc.getDecoder_k().getFrekans_aralığı());
        
    }
    
}
