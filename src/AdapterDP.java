import CheckNumberPhone.CheckNumberAdaptee;
import CheckNumberPhone.PhoneTarget;

public class AdapterDP implements PhoneTarget {
    // goi doi tuong trong checkNumberAdaptee
    CheckNumberAdaptee checkNumberAdaptee = new CheckNumberAdaptee();
    @Override
    public boolean checkPhoneNumber(String number) {
        if(!checkNumberAdaptee.checkNumber(number)){
            return false;
        }
        if(number.length() > 11 || number.length() < 10){
            return false;
        }
        return true;
    }
}
