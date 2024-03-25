package ole.mahlstedt;
import java.util.Random;
public class Nummern {

    char[] eanNummer = new char[13];
    public char[] getEanNummer() {
        return eanNummer;
    }
    public void setEanNummer(char[] eanNummer) {
        this.eanNummer = eanNummer;
    }
    public void randomEanNummer(){
        for(int i = 0;i<11;i++) {
            eanNummer[i] = getChar((int) Math.floor(Math.random() * (9 + 1)));
            eanNummer[12] = getKontrollNummer();
        }
    }
    private char getChar(int nummer){
        return (char) (nummer + '0');
    }
    private int getSummeNummer(){
        return
        (eanNummer[0]+
        eanNummer[1] * 3 +
        eanNummer[2] +
        eanNummer[3] * 3 +
        eanNummer[4] +
        eanNummer[5] * 3 +
        eanNummer[6] +
        eanNummer[7] * 3 +
        eanNummer[8] +
        eanNummer[9] * 3 +
        eanNummer[10] +
        eanNummer[11] * 3);

    }
    public char getKontrollNummer() {
        if (getSummeNummer()%10 == 0){
            return ('0');
        }else return getChar(10 - (getKontrollNummer() % 10));

        }
    }

