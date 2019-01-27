package tipdonusumleri;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        byte bytea = 127;
        int intb;
        intb = bytea;

        intb = 127;

        bytea = (byte) intb;

        System.out.println("maximum boyutu gecmedigim için tip dönüşümü : "+bytea);

        intb = 999;

        bytea = (byte) intb;

        System.out.println("maximum boyutu gectiğinde için tip dönüşümü : "+bytea);


        Integer xInt=12;
        String xString;
        xString=xInt.toString();
        System.out.println(xString);





    }


}
