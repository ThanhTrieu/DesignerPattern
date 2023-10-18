public class PhuongTrinhBacNhat {
    private static PhuongTrinhBacNhat ptbnInstance = null;
    // tao constructor
    private PhuongTrinhBacNhat(){}
    public static synchronized PhuongTrinhBacNhat getInstance(){
        if(PhuongTrinhBacNhat.ptbnInstance == null){
            ptbnInstance = new PhuongTrinhBacNhat();
        }
        return ptbnInstance;
    }

    public String timNghiem(int a, int b){
        if(a == 0){
            if(b == 0){
                return "PT vo so nghiem";
            } else {
                return "PT vo nghiem";
            }
        } else {
            return "PT co nghiem " + (-b/a);
        }
    }
}
