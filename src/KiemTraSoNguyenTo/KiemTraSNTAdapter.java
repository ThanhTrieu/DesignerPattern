package KiemTraSoNguyenTo;

public class KiemTraSNTAdapter implements KiemTraSNTTarget {

    // khoi tao doi tuong cho KiemTraSNTAdaptee;
    KiemTraSNTAdaptee soNguyenTo;
    public KiemTraSNTAdapter(KiemTraSNTAdaptee adaptee){
        this.soNguyenTo = adaptee;
    }
    @Override
    public boolean kiemTraSo(int number) {
        return this.soNguyenTo.kiemTraSNT(number);
    }
}
