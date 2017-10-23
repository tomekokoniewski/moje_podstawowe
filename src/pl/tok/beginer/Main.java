package pl.tok.beginer;

import static java.lang.Math.*;     //mat()

import java.io.File;                //scnr()
import java.io.FileNotFoundException; //scnr()
import java.io.FileWriter;          //fileWriter()
import java.io.IOException;         //fileWriter()
import java.math.BigDecimal;        //bintBdeci()
import java.text.ParseException;    //dateTime();
import java.text.SimpleDateFormat;  //dateTime();
import java.util.*;                 //rndm(), scanner()
import java.util.regex.Matcher;     //pattMatch();
import java.util.regex.Pattern;     //pattMatch();

import pl.tok.beginerNew.New;       //zaimportowanie mojego własnego pakietu aby móc po nim dziedziczyć

public class Main extends New {     //klasa Main dziedziczy po klasie New, muszę ją jednak wcześniej zaimportować

    public static void main(String[] args) throws IOException {

        drukuj();
        deklaracjeZmiennychStalych();
        modLength();
        inkr();
        operatory();
        mat();
        ifElse();
        zaokr();
        switch_case();
        while_while_do();
        petla_for();
        rndm();
        scnr();
        bintBdeci();
        char1();
        tabl();
        arraylist();
        sb();
        dateTime();
        pattMatch();
        fileWriter();
        modyfikatoryDostepu();
        stat();
        passParam();
        tmp();
        kons();                         //konstruktory
        getSet();                       // gettery i settery
        getSetHerm();
        klasaNiezmienna();
        //dodac obsługę błędów

    }

    // -------- DRUKOWANIE NA EKAN
    public static void drukuj() {
        System.out.println("-------DRUKOWANIE");
        System.out.println("Ania");
        System.out.println("Ania2\nJAN");    // znak \n to znak nowej linii
        System.out.println('a' + 'A');        // jeżeli w apostrofach to potraktuje jako cyfrę ASCII i da nam sumę - 162
        System.out.println(1 + 2);        // wynik - integer
        System.out.println(1.0 + 2.0);        // wynik - double
        System.out.println("cudzysłów \"");    // znak \" da nam cudzysłów
        System.out.println(true);
        System.out.println("\n");        // nowa linia
        System.out.println("Piotr \t \t Pawel");// zmak \t to tabulator
    }

    // -------- DEKLAROWANIE ZMIENNYCH I STAŁYCH
    public static void deklaracjeZmiennychStalych() {
        System.out.println("\n-------DEKLAROWANIE ZMIENNYCH I STAŁYCH");

        int b;        // zadeklarowanie
        b = 0;        // przypisanie
        int a = 0;    // zadeklarowanie i przypisanie
        int liczbaA = 5, liczbaB = 21;                //integer (cyfra całkowita)
        char znak = 'A';                    //pojedynczy znak unicode
        double liczba1 = 1.1, liczba2 = 2.2;            //podwójna precyzja (cyfra max 15 miejsc po przecinku)
        String ciag_znakow = "Dzień dobry kocham Cię";        //ciąg znaków

        final double pi = 3.14;    //deklaracja stałej
        final int stała = 3;    //deklaracja stałen
        System.out.println("pi plus trzy wynosi " + (pi + stała));
    }

    // -------- MODULO I LENGTH
    public static void modLength() {
        System.out.println("\n-------MODULO I LENGTH");

        String ciag_znakow = "Dzień dobry kocham Cię";
        int liczba1 = 5, liczba2 = 21;

        System.out.println(ciag_znakow.length());        // ile znakow zawiera string ciag_znakow
        System.out.println(liczba2 % liczba1);            // MODULO - reszta z dzielenia - możemy tak zprawdzac czy liczba jest parzysta.
        // 21 mod 5 da nam 1 (20 dzieli sie na 5 i do 21 zostaje 1)
    }

    // -------- INKREMENTACJA (zwiększanie wartości) i DEKREMENTACJA (zmniejszanie)
    public static void inkr() {
        System.out.println("\n-------INKREMENTACJA");

        int a = 1, b = 2, c;
        System.out.println(a++); //wydrukuje wart "a" = 1 a następnie zwiększy ją o 1 (a = 2) (inkrementacja postfixowa) //1
        System.out.println(++b); //zwiększy wartoś b o jeden i wydrukuje (inkrementacja predfixowa) //3
    }

    // -------- OPERATORY PORÓWNAWCZE I LOGICZNE
    public static void operatory() {
        System.out.println("\n-------OPERATORY PORÓWNAWCZE I LOGICZNE");

        System.out.println(4 == 3);        //false - (sprawdzenie czy są równe - nieprawda) a=4, b=3
        System.out.println("ala".equals("kot"));//false - (sprawdzenie czy znaki lub stringi są równe - nieprawda) ala<>kot
        System.out.println(4 != 3);        //true - (sprawdzenie czy są różne - prawda) a=4, b=3
        System.out.println(4 >= 3);        //true - (sprawdzenie czy a>=b - prawda) a=4, b=3
        System.out.println("\n");
        System.out.println((4 >= 3) && (4 <= 3));    //false - (PRAWDA and FAŁSZ) jeden z warunków = fałsz -> całe twierdzenie fałszywe
        System.out.println((4 >= 3) || (4 <= 3));    //true - (PRAWDA and FAŁSZ) jeden z warunków = prawdziwy -> całe twierdzenie prawdziwe

    }

    // -------- FUNKCJE MATEMATYCZNE
    public static void mat() {
        System.out.println("\n-------FUNKCJE MATEMATYCZNE");

        System.out.println("\n" + Math.sqrt(9));    //Math.sqrt(double liczba) - funkcja matematyczna wyliczająca pierwiastek
        System.out.println(Math.pow(2, 3));    //Math.pow(double a, double b) - funkcja matematyczna podnosząca liczbę a do potęgi b (2 do 3 = 8)
        System.out.println(Math.abs(-3));    //Math.abs(liczba) - funkcja matematyczna zwracająca wartośc bezwzględną (dla -3 = 3)
        System.out.println(Math.PI);        //- funkcja matematyczna zwracająca wartośc liczby PI
        System.out.println(Math.E);        //- funkcja matematyczna zwracająca wartośc liczby E
        System.out.println(E);            //zadziała bez przedrostka Math. (wskazania pakietu) gdyż w pierwszej lini kodu dokonaliśmy importu statycznego tej biblioteki
    }

    // -------- IF ELSE
    public static void ifElse() {
        System.out.println("\n-------IF ELSE");

        double a1 = 4, b1 = 3;

        if (a1 < b1) {
            System.out.println("4<3");
        } else if (a1 == b1) {
            System.out.println("4=3");
        } else {
            System.out.println("4>3");
        }

        //operator trójargumentowy
        String wynik;
        wynik=a1<b1? "4<3": "4>3";		//zmienna = warunek ? wartosc_jak_prawda  : wartosc_jak_falsz;
        System.out.println(wynik);
    }


    // -------- KONWERSJA TYPÓW DANYCH
    public static void konwersja() {
        System.out.println("\n-------KONWERSJA TYPÓW DANYCH");

        int AA = 5;
        double BB = 13.5;
        double CC = BB / (double) AA;    //jawnie skonwertowalismy AA na podwójną precyzję (RZUTOWALISMY) - w tym konkretnym przyp java i tak by to zrobila automatycznie
        System.out.println(CC);        //2.7
    }

    // -------- ZAOKRĄGLENIE LICZB
    public static void zaokr() {
        System.out.println("\n-------ZAOKRĄGLENIE LICZB");

        System.out.println((double) Math.round((1.35)));        //1,0 - zaokrąglenie do liczby całkowitej
        System.out.println((double) Math.round((1.35) * 10) / 10);        //1,4 - zaokrąglenie do 1 miejsca po przecinku
    }

    // -------- SWITCH (CASE)
    public static void switch_case() {
        System.out.println("\n-------SWITCH (CASE)");

        int i = 3;
        switch (i) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            default:
                System.out.println("nie ma wartosci");
        }

    }

    // -------- WHILE, WHILE DO
    public static void while_while_do() {
        System.out.println("\n-------WHILE, WHILE_DO");

        int x = 0;      //while
        while (x < 3) {
            x++;
            System.out.println("x= " + x);
        }

        x = 0;            //while do - wykona się przynajmniej raz
        do {
            x++;
            System.out.println("x= " + x);
        } while (x < 3);
    }

    // -------- FOR, BREAK i CONTINUE
    public static void petla_for() {
        System.out.println("\n-------PĘTLA FOR, BREAK I CONTINUE");

        for (int x = 0; x < 3; x++) {
            System.out.println("x= " + x);
        }

        for (int x = 1; x < 10; x++) {
            if (x % 2 == 1) {
                continue;       //continue powoduje przerwanie pętli i przejście do kolejnej iteracji
            }
            if (x > 6) {
                break;          //break powoduje przerwanie działąnia pętli
            }
            System.out.println("Wartość x = " + x); // 2, 4, 6
        }

        int[] tablica = {1, 2, 3};
        for (int i : tablica) { //pętla for po elementach talicy - deklaruję zmienną która jest elementem tablicy
            System.out.println(i);
        }
    }

    // -------- RANDOM
    public static void rndm() {
        System.out.println("\n-------RANDOM");

        Random r = new Random();
        //int rnd = r.nextInt(5);               //generowanie z obiektu r liczby całkowitej od zera do wartości mniejszej niż podana w nawiasie
        int rnd = r.nextInt(5) + 1;       //wygeneruje liczbę od 1 do liczby w nawiasie
        System.out.println(rnd);

        double zmiennaLiczba = (Math.random()); //generowanie liczby losowej <0 (kilka miejsc po przecinku) (można zrezygmowac z przedrostka Math gdyż na początku zaimportowaliśmy pakiet java.lang.Math.*)
        System.out.println(zmiennaLiczba);
        //jeżeli chcemy uzyskac z tego liczbę całkowitą z przedziału mnożymy wynik przez (koniec-początek)
        // a na końcu dodajemy początek przedziału. Całoś wyniku castujemy do integera (odcinamy miejsca po przecinku)
        //np: liczba całkowita z przedziału 2-10
        zmiennaLiczba = (Math.random() * (10 - 2)) + 2;
        System.out.println((int) zmiennaLiczba);
    }

    // -------- SCANNER
    public static void scnr() throws FileNotFoundException {
        System.out.println("\n-------SCANER");

        Scanner odczyt = new Scanner(System.in);        //skaner czytający z klawiatury
        while (!odczyt.hasNextInt()) {
            System.out.println("Podaj liczbę całkowitą");
            odczyt.nextLine();
        }
        System.out.println(odczyt.nextInt());

        String text = "51 2 14 7";
        Scanner scanner = new Scanner(text);            //skaner czytający ze zmiennej
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i); // 51 2 14 7
        }

        File file = new File("data/odczyt.txt");  //skaner czytający z pliku
        Scanner scanner1 = new Scanner(file);

        while (scanner1.hasNextLine()) {
            String string = scanner1.nextLine();
            String linia[] = string.split(","); //podzielenie od razu lini na pola (kolejne elementy tablicy)
            System.out.println(string);
                System.out.println(linia[0] + " " + linia[1]+ " " + linia[2]+ " " + linia[3]+ " " + linia[4]+ " " + linia[5]+ " " + linia[6]);
        }
    }

    // -------- BIGINTEGER, BIGDECIMAL
    public static void bintBdeci() {
        System.out.println("\n-------BIGINTEGER AND BIG DECIMAL");

        BigDecimal a = new BigDecimal("1234567890.987654321");
        BigDecimal b = BigDecimal.valueOf(9234567890.987654321);
        BigDecimal c = b.subtract(a).negate();
        BigDecimal d = c.abs();
        System.out.println(c); // -7999999999.999999679
        System.out.println(d); // 7999999999.999999679
    }

    // -------- CHARACTER
    public static void char1() {
        System.out.println("\n-------CHARACTER");

        char c1 = 'a';
        Character c2 = 'a'; // boxing ("duży character")
        char c3 = c2; // unboxing
        Character c4 = new Character('a');
        System.out.println(Character.isDigit(c4)); // false
        System.out.println(Character.isLowerCase(c4)); // true
    }

    // -------- ARRAY TABLICA
    public static void tabl() {
        System.out.println("\n-------ARRAY TABLICA");

        int[] array1 = {1, 3, 5};           //by móc użyc tablice musze podac jej rozmiar
        char[] array2 = new char[3];
        array2[0] = 'a';
        array2[1] = 'g';
        array2[2] = 'z';


        for (int i = 0; i < 3; i++) {       //prosta pętla po tablicy
            System.out.println(array2[i]);
        }

        for (char c : array2) {             // deklaruję zmienna c takiego samego typu jak dane w tablicy i mówię że przypisuje do niej kolejno obiekty z tablicy
            System.out.println(c);
        }
    }

    // -------- LISTY
    public static void arraylist() {
        System.out.println("\n-------ARRAY LIST");

        ArrayList list1 = new ArrayList();
        list1.add(4.5);
        list1.add("aaa");
        list1.add(false);
        System.out.println(list1);         //cała zawartosc listy
        System.out.println(list1.get(1));  //zawartośc konkretnej pozycji (uwaga po usunieciu pozycji kolejne idą do góry i w miejsce usuniętej mamy kolejną)

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (java.lang.Object c : list1) {  //iteracja jak w przyp tabeli, tyle ze zmienna zamiast typu jest obiektem (w liscie sa rozne typy i nie moge zadeklarowac jednego)
            System.out.println(c);
        }

        //przykładowe metody
        //list1.remove(0); // usunie wartość 4.5 - w indeks 0 wskoczy "aaa"
        list1.isEmpty(); // false
        if (list1.contains(4.5)) { //sprawdzenie czy lista zawiera wartość
            System.out.println("lista zawiera 4.5");
        }

        ArrayList<Integer> listaIntegerow = new ArrayList<>(); //przykład listy zawierającej jeden typ danych
        listaIntegerow.add(1);
        listaIntegerow.add(2);
        listaIntegerow.add(3);
        for (int x : listaIntegerow) {
            System.out.println(x);
        }
    }

    // -------- STRING BUILDER
    public static void sb() {
        System.out.println("\n-------STRING BUILDER");

        String txt1 = "napis1";
        String txt2 = new String("napis2");

        //łączenie Stringów
        System.out.println(txt1 + " " + txt2);
        System.out.println(txt1.concat(" ").concat(txt2)); //metoda łączenia wywołana 2x !

        //String jest "niezmienny" i za każdym jego powstaniem trafia do StringPool'a
        //dlatego można używać StringBuildera który nie jest niezmienny i jest tylko jeden
        // (nie trafia do String Poola zwiększając zużycie pamięci)

        StringBuilder alph = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) { //możliwa iteracja bo to znaki unicode - a=97, b=98 ...
            alph.append(c);
        }
        System.out.println(alph);

        System.out.println(alph.append(alph.length()).reverse()); //przykładowe metody SB
    }

    // -------- DATA I CZAS
    public static void dateTime() {
        System.out.println("\n-------DATA I CZAS");

        Date date = new Date();
        System.out.println(date); //paskudny format

        //formatowanie
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy HH:mm");
        System.out.println(ft.format(date));

        //parsowanie
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = ft1.parse("2017-12-24"); //parsowanie ze stringa do daty wg formatu zdefiniowanego w SimpleDateFormat
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);
    }

    // -------- PATTERN I MATCHER - wyrażenia regularne
    public static void pattMatch() {
        System.out.println("\n-------PATTERN I MATCHER - wyrażenia regularne");

        String text = "1234/5324";
        Pattern pattern = Pattern.compile("^(\\d+)\\D(\\d+)$"); //^ pocz, $ koniec, () pocz i konied grupy, d+ cyfra jedna lub wiecej, D niecyfra
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) { // true
            System.out.println(matcher.group(1)); // 1234
            System.out.println(matcher.group(2)); // 5324
        }
     //można także podzielic stringi nie tylko za pomoca patterna i matchera, - można użyc .split na Stringu

        String[] elementyWlini = text.split("/");
        for (int i=0; i<elementyWlini.length; i++ ){
            System.out.println(elementyWlini[i]);
        }
    }

    // -------- FILE WRITER - wyrażenia regularne
    public static void fileWriter() throws IOException {
        System.out.println("\n-------FILE WRITER");

        FileWriter fw = new FileWriter("data/zapis.txt", true);
        fw.write("nowa linia " + new Date() + "\n");
        fw.close();

        System.out.println("Dopisałem nową linie do pliku zapis.txt");
    }

    //-------- MODYFIKATORY DOSTĘPU
    public static void modyfikatoryDostepu() {
        System.out.println("\n-------MODYFIKATORY DOSTĘPU");
    /*
    dla metod i pól (zmiennych) mogą być:
    public - nieograniczony dostęp do metod i zmiennych
    private - dostęp tylko w ramach tej samej klasy
    default (brak modyfikatora) - dostęp w ramach tego samego pakietu
    protected - dostęp w ramach tego samego pakietu i dla klas dziedziczących
    */

        System.out.println("zmienna typu protected z innej klasy w innym pakiecie: " + New.protInt);
        //mogę użyć zmiennej typu protected z innego pakietu po tym jak pakiet zaimportowałem
        //oraz wskazałem że moja klasa Main dziedziczy po klasie z innego pakietu
        //Nota bene zmienna protected w innym pakiecie MUSIALA BYC STATIC
    }

    //Klasy mogą być tylko:
    // public - dostępne bez ograniczeń
    // default(bez modyfikatora) - dostępne tylko dla klas w tym samym pakiecie
    //chyba że jest to klasa wewnętrzna (klasa w klasie) - wówczas mogą być jeszcze protected i private
    //przykład poniżej
    //-------- KLASA W KLASIE
    private class test {
        // comment
    }

    //-------- POLA I METODY STATYCZNE
    public static void stat() {
        System.out.println("\n-------POLA I METODY STATYCZNE");

        Old.int1 = 2; //zmieniam wart z 1 na 2
        System.out.println(Old.int1); //wynik 2

        //niezależnie ile utworzę obiektów klasy Old, ze wzgl na to że zmienna jest statyczna to w każdym
        //obiekcie nie będzie tworzona, lecz "pozostanie w klasie" i za każdym razem będzie np. nadpisywana
        //przykład:
        Old obiekt1 = new Old();
        Old obiekt2 = new Old();
        obiekt1.int1 = 10;
        obiekt2.int1 = 20;

        System.out.println(obiekt1.int1); //wynik 20 bo zmienna int nie jest w obiekcie,
        // lecz w klasie i w ostatniej operacji została do niej przypisana wartość 20
        System.out.println(obiekt2.int1); // wynik 20
        System.out.println(Old.int1); //wynik 20

        //w mojej statycznej metodzie  stat() nie moge użyć zmiennych i metod niestatycznych
        //nie skompiluje sie:
        //System.out.println(Old.int2);     //zmienna niestatyczna
        //System.out.println(getString());  //metoda niestatyczna
        Old obiekt3 = new Old();
        System.out.println(obiekt3.int2);           //skompiluje się !! - mamy już obiekt
        System.out.println(obiekt3.getString());    //skompiluje się !! - mamy już obiekt
    }

    //-------- PRZEKAZYWANIE PARAMETRÓW DO METOD - następuje przez wartość

    public static void passParam() {
        System.out.println("\n-------PRZEKAZYWANIE PARAMETRÓW DO METOD");

        int a = 5;
        change1(a);             //wywołanie metody i przekazanie do niej wartości 5
        System.out.println(a);  //wydrukuje 5
    }

    static void change1(int a) { //Tworzona jest kopia parametru do zmiennej lokalnej metody
        a = 10;
    }

    public static void tmp() {
        StringBuilder a = new StringBuilder("abc");
        change(a);
        System.out.println(a); //wydrukuje abc123 - nastąpiła zmiana stanu obiektu
    }

    static void change(StringBuilder a) {
        a.append("123");
    }

//----------------------------------------------------------------------------------------------------------------------
    //-------- KONSTRUKTORY
    public static void kons() {

        Konstr konstr = new Konstr("\n-------- KONSTRUKTORY");  //konstuktor jest wywoływany w momencie tworzenia nowego obiektu
        // i przypisuje do jego pól (zmiennych) wartości

        konstr.name = "bla bla bla" + konstr.lang;      //nie ma hermetyzacji, pole name jest public i każdy może je zmieniac - poniżej opisano geterry i settery które to zmieniają
        System.out.println(konstr.name);

        Konstr konstr1 = new Konstr(10, "Jan");
        System.out.println(konstr1.name + " lat "+konstr1.i);

        Konstr konstr2 = new Konstr(5);
        System.out.println(konstr2.name + " lat "+konstr2.i);
    }

    //-------- GETTERY I SETTERY

    // ułatwiają hermetyzację, możemy ustawic pola w klasie do której sie odwołujemy na "private"
    // i zezwolic na ich maniepulację tylko za pomocą metod get i set

    public static void getSet() {
        System.out.println("\n------- GETTERY I SETTERY");

        Konstr konstr = new Konstr(10, "Jan");
        konstr.setName("Tomek");
        konstr.setCzy(false);

        System.out.println(konstr.getName() + " czy niski = " +konstr.isCzy());
    }

    public  static void getSetHerm(){
        System.out.println("\n------ GETERY I SETTERY PRZYKLAD HERMETYZACJI");

        //nie można ustawić bezpośrednio wartości pola adres w klasie KonstrHerm (jest typu private)
        //możemy podać do parametrów settera ulice i nr domu, a setter w KonstrHerm ustawi pole adres
        //później możemy pobrać getterem wartość pola adres
        KonstrHerm konstrHerm = new KonstrHerm();
        konstrHerm.setAdres("Młodych","4");
        System.out.println("Adres: "+konstrHerm.getAdres());
    }

    public  static void klasaNiezmienna(){
        System.out.println("\n------ KLASA NIEZMIENNA");

        KlasaNiezmienna klasaNiezmienna = new KlasaNiezmienna(true);
        //po utworzeniu obiektu klasy "KlasaNiezmienna" nie moge zmienić wartości pola czyNowy,
        //nie ma settera, a pole jest private - nie ma do niego dostępu z zewnątrz,
        //mogę jedynie pobrać jego wartość getterem
        System.out.println(klasaNiezmienna.isCzyNowy());

        }


}








