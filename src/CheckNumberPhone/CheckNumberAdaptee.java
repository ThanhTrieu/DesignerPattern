package CheckNumberPhone;

public class CheckNumberAdaptee {
    public boolean checkNumber(String number){
        // kiem tra 1 chuoi nhap vao co phai la so hay khong?
        String regex = "[0-9]+"; // chi cho phep la cac chu so tu 0 - 9, cho phep so do lap lai 1 hoac nhieu lan trong day chuoi so (goi la bieu thuc chinh quy)
        //  Regular expression
        return number.matches(regex);
    }
}
