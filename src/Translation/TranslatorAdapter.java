package Translation;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee jpAdaptee;

    // constructor
    public TranslatorAdapter(JapaneseAdaptee adaptee){
        this.jpAdaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading words ...");
        System.out.println(words);
        String vietNameseWords = this.translate(words);
        jpAdaptee.receive(vietNameseWords);
    }

    private String translate (String vietnameseWords){
        System.out.println("Translated " + vietnameseWords);
        return  "こんにちは。";
    }
}
