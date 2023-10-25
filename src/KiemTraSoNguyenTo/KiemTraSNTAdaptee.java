package KiemTraSoNguyenTo;

public class KiemTraSNTAdaptee {

    public boolean kiemTraSNT(int number){
        if(number <= 1){
            return false;
        }
        if (number == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
