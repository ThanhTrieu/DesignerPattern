import CheckNumberPhone.PhoneTarget;
import KiemTraSoNguyenTo.KiemTraSNTAdaptee;
import KiemTraSoNguyenTo.KiemTraSNTAdapter;
import KiemTraSoNguyenTo.KiemTraSNTTarget;
import Translation.JapaneseAdaptee;
import Translation.TranslatorAdapter;
import Translation.VietnameseTarget;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // ban chat singleton chi chap nhan duy nhat 1 doi tuong dc tao ra tu 1 class ma thoi (khong the dung tu khoa new de khoi tao doi tuong)
        // loi ko cho phep tao doi tuong voi tu khoa new
        // SingletonDP object = new SingletonDP();
        /*
        SingletonDP object  = SingletonDP.getInstance();
        SingletonDP object2 = SingletonDP.getInstance();
        // object va object2 van chi la 1 doi tuong giong nhau
        object.showMessage();
        object2.showMessage();

        // lazy singleton
        Singleton obj  = Singleton.getInstance(); // khoi tao doi tuong
        Singleton obj2 = Singleton.getInstance(); // khoi tao doi tuong
        Singleton obj3 = Singleton.getInstance(); // khoi tao doi tuong
        System.out.println("Hashcode of obj is " + obj.hashCode());
        System.out.println("Hashcode of obj2 is " + obj2.hashCode());
        System.out.println("Hashcode of obj3 is " + obj3.hashCode());
        // hashCode sinh ra tu 3 doi tuong chung giong nhau ==> 3 doi tuong giong nhau
        // hashcode : la ham tao ra so ngau nhien
        if(obj == obj2 && obj2 == obj3){
            System.out.println("three object to the same");
        } else {
            System.out.println("three object do not to the same");
        }

        // goi ra su dung Singleton PTBN
        PhuongTrinhBacNhat ptn = PhuongTrinhBacNhat.getInstance();
        PhuongTrinhBacNhat ptn2 = PhuongTrinhBacNhat.getInstance();
        String nghiem = ptn.timNghiem(1,2);
        String nghiem2 = ptn2.timNghiem(6,2);
        System.out.println(nghiem);
        System.out.println(nghiem2);
        */

        // Adapter Designer pattern
        /*
        PhoneTarget phoneTarget = new AdapterDP();
        String phone1 = "fsdfsdfsf";
        String phone2 = "0975091";
        String phone3 = "0973456789";
        System.out.println(phone1 + " is phone number " + phoneTarget.checkPhoneNumber(phone1));
        System.out.println(phone2 + " is phone number " + phoneTarget.checkPhoneNumber(phone2));
        System.out.println(phone3 + " is phone number " + phoneTarget.checkPhoneNumber(phone3));
         */
        /*
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chao");
         */
        KiemTraSNTTarget snt = new KiemTraSNTAdapter(new KiemTraSNTAdaptee());
        int n1 = 10;
        int n2 = 11;
        int n3 = 13;
        System.out.println( n1 + " So nguyen to la : " + snt.kiemTraSo(n1));
        System.out.println( n2 + " So nguyen to la : " + snt.kiemTraSo(n2));
        System.out.println( n3 + " So nguyen to la : " + snt.kiemTraSo(n3));

    }
}