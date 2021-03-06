package pl.tok.beginer;

import static java.lang.Math.*;     //mat()
import static pl.tok.beginer.EnumExample.CLOSE;
import static pl.tok.beginer.EnumExample.OPEN;

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
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.tok.beginerNew.New;       //zaimportowanie mojego własnego pakietu aby móc po nim dziedziczyć
import sun.util.cldr.CLDRLocaleDataMetaInfo;

public class Main extends New {     //klasa Main dziedziczy po klasie New, muszę ją jednak wcześniej zaimportować

    public static void main(String[] args) throws IOException {

        drukuj();
        deklaracjeZmiennychStalych();
        modLength();
        inkr();
        operatory();
        mat();
        ifElse();
        konwersja();
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
        passParam1();
        paramZmiennyArg();
        kons();
        getSet();
        getSetHerm();
        klasaNiezmienna();
        dziedziczenie();
        dziedzNadpisywanie();
        klasaAbstr();
        interfejs();
        interfejs2();
        polimorfizm();
        pmfzmPrzyklad();
        porownania();
        //wyjatki();
        enum1();
        kolekcje();
        strumienie();
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

        a += 2; //a=a(2)+2=4
        System.out.println(a);
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
        System.out.println((4 >= 3) || (4 <= 3));    //true - (PRAWDA or FAŁSZ) jeden z warunków = prawdziwy -> całe twierdzenie prawdziwe

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
        wynik = a1 < b1 ? "4<3" : "4>3";        //zmienna = warunek ? wartosc_jak_prawda  : wartosc_jak_falsz;
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
            System.out.println(linia[0] + " " + linia[1] + " " + linia[2] + " " + linia[3] + " " + linia[4] + " " + linia[5] + " " + linia[6]);
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

        //przykład użycia metod z klasy "java.util.Collections"
        System.out.println("wartośc najmniejsza z listy 1-3: " + Collections.min(listaIntegerow));
        System.out.println("wartośc największa z listy 1-3: " + Collections.max(listaIntegerow));

        //lista utworzona przez": List x = Arrays.asList(el1,el2...) ma stały rozmiar,
        //nie można na niej zrobic
        // x.add(el3);
        //Trzeba by z niej zrobić listę jak ponizej:
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println("UWAGA "+a);

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
        for (int i = 0; i < elementyWlini.length; i++) {
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
    public class test {
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
        System.out.println(a);   //wydrukuje 10
    }

    public static void passParam1() {
        StringBuilder a = new StringBuilder("abc");
        change(a);
        System.out.println(a); //wydrukuje abc123 - nastąpiła zmiana stanu obiektu
    }

    static void change(StringBuilder a) {
        a.append("123");
    }

    //-------- PRZEKAZYWANIE PARAMETRÓW - ZMIENNY ARGUMENT

    public static void paramZmiennyArg(){
        System.out.println("\n-------PRZEKAZYWANIE PARAMETRÓW  - ZMIENNY ARGUMENT");
        zmiennyArg(1,2,10,20);
    }

    public static void zmiennyArg(int...digits){
        for (int i:digits){
            System.out.println(i);
        }
    }

    //----------------------------------------------------------------------------------------------------------------------
    //-------- KONSTRUKTORY
    public static void kons() {

        Konstr konstr = new Konstr("\n-------- KONSTRUKTORY");  //konstuktor jest wywoływany w momencie tworzenia nowego obiektu
        // i przypisuje do jego pól (zmiennych) wartości

        konstr.name = "bla bla bla" + konstr.lang;      //nie ma hermetyzacji, pole name jest public i każdy może je zmieniac - poniżej opisano geterry i settery które to zmieniają
        System.out.println(konstr.name);

        Konstr konstr1 = new Konstr(10, "Jan");
        System.out.println(konstr1.name + " lat " + konstr1.i);

        Konstr konstr2 = new Konstr(5);
        System.out.println(konstr2.name + " lat " + konstr2.i);
    }

    //-------- GETTERY I SETTERY
    public static void getSet() {
        System.out.println("\n------- GETTERY I SETTERY");
        // ułatwiają hermetyzację, możemy ustawic pola w klasie do której sie odwołujemy na "private"
        // i zezwolic na ich maniepulację tylko za pomocą metod get i set


        Konstr konstr = new Konstr(10, "Jan");
        konstr.setName("Tomek");
        konstr.setCzy(false);

        System.out.println(konstr.getName() + " czy niski = " + konstr.isCzy());
    }

    public static void getSetHerm() {
        System.out.println("\n------ GETERY I SETTERY PRZYKLAD HERMETYZACJI");

        //nie można ustawić bezpośrednio wartości pola adres w klasie KonstrHerm (jest typu private)
        //możemy podać do parametrów settera ulice i nr domu, a setter w KonstrHerm ustawi pole adres
        //później możemy pobrać getterem wartość pola adres
        KonstrHerm konstrHerm = new KonstrHerm();
        konstrHerm.setAdres("Młodych", "4");
        System.out.println("Adres: " + konstrHerm.getAdres());
    }

    //-------- KLASA NIEZMIENNA
    public static void klasaNiezmienna() {
        System.out.println("\n------ KLASA NIEZMIENNA");

        KlasaNiezmienna klasaNiezmienna = new KlasaNiezmienna(true);
        //po utworzeniu obiektu klasy "KlasaNiezmienna" nie moge zmienić wartości pola czyNowy,
        //nie ma settera, a pole jest private - nie ma do niego dostępu z zewnątrz,
        //mogę jedynie pobrać jego wartość getterem
        System.out.println(klasaNiezmienna.isCzyNowy());
    }

    // ------- DZIEDZICZENIE, PRZEKAZANIE PARAMETRU Z KLASY DZIEDZICZĄCEJ DO KLASY NADRZĘDNEJ
    public static void dziedziczenie() {
        System.out.println("\n------ DZIEDZICZENIE");
        KlasaDziedziczaca.test(); //1. wywołuję metode porownania w KD

        //    Gdy w klasie nadrzędnej istnieje konstruktor z parametrem to
        //    konstruktor klasy podrzędnej musi go wywołać – super()
        //    Instrukcja super() musi być zawsze w pierwszej linii konstruktora
    }

    // ------- DZIEDZICZENIE - NADPISYWANIE METOD
    public static void dziedzNadpisywanie() {
        System.out.println("\n------ DZIEDZICZENIE - NADPISYWANIE METOD");

        K2.test();

        //zarówno w K1 jak i w K2 mamy pole "plec". W K2 dziedziczącej po K1 jej zadeklarowanie nie nadpisuje K1.plec, lecz "ukrywa"
        // ją z poziomu K2, chyba że jawnie wskażemy, że chcemu plec z K1
        System.out.println(K1.plec);
        System.out.println(K2.plec);
    }

    // ------- KLASA ABSTRAKCYJNA
    public static void klasaAbstr() {
        System.out.println("\n------ KLASA ABSTRAKCYJNA");

        KlasaAbstrDziedziczaca.test();

        //Klasa abstrakcyjna ma  przynajmniej jedną metodę abstrakcyjną,
        //klasa dziedzicząca po klasie abstrakcyjnej musi nadpisywać metodę abstrakcyjną z klasy abstrakcyjnej
    }

    // ------- INTERFEJS
    public static void interfejs() {
        System.out.println("\n------ INTERFEJS");

        InterfaceImplementation osoba = new InterfaceImplementation("Jan", 20);
        System.out.println("Osoba: " + osoba.getName() + " lat " + osoba.getWiek() + " " + osoba.kontynent + " " + osoba.kraj);

        //Interfejs to element abstrakcyjny - nie mozna tworzyć dla niego obiektow

        //Interfejs zawiera jedynie listę metod abstrakcyjnych (bez
        //implementacji), które klasa implementująca musi posiadać

        //Interfejs może też zawierać zmienne do której klasa może się odwołać (tak naprawdę stałe)
        //– final jest dla niej narzucone

    /*Klasy mogą implementować wiele interfejsów
        public class Driver implements EmployeeInterface, HumanInterface {
        // ...
        }
    Uwaga: błąd kompilacji gdy, interfejsy mają taką samą metodę z
    identycznymi parametrami ale z innym typem zwracanym
    */

    /*Analogicznie jak w przypadku klas, interfejs może dziedziczyć po innym interfejsie (lub po kilku)
        public interface EmployeeInterface extends HumanInterface, ...{
            final String TABLE_NAME = "worker_sql";
            BigDecimal getIncome ();
        }
    */
    }



    // ------- INTERFEJS 2
    public static void interfejs2() {
        System.out.println("\n------ INTERFEJS2");

        MaxMinOperation operacja = new MaxMinOperation();
        List<Integer> intListjava8Demo = Arrays.asList(-2, -1, 0, 1, 2, 3);

        MaxOperation maxOperation = new MaxOperation();
        MinOperation minOperation = new MinOperation();

        operacja.getResult(intListjava8Demo, maxOperation);
        operacja.getResult(intListjava8Demo, minOperation);

        //
        List list = new ArrayList();


        List<Integer> x = Arrays.asList(1,2,3);
        x.add(1);






    }

    // ------- POLIMORFIZM
    public static void polimorfizm() {
        System.out.println("\n------ POLIMORFIZM");

        Podrzedna.test();

        //Polimorfizm to zdolność przyjmowania przez obiekt formy klasy nadrzędnej
        //jeżeli mam klase A i dziedziczącą po niej B to "standardowo" tworzę obiekt
        // B nazwaObiektu = new B; //-obiekt klasy B typu B
        // wykorzystując polimorfizm mogę utworzyć obiekt klasy B typu A (po którym dziedziczy B)
        // A nazwaObiektu = new B;
    }

    //----- PRZYKŁAD POLIFORMIZMU ------
    public static void pmfzmPrzyklad() {
        PolimorfizmDirector director = new PolimorfizmDirector();
        PolimorfizmDriver driver = new PolimorfizmDriver();

        // metoda PolimorfizmBusinessCard może przyjmować obiekty klas "director" i "driver" gdyż obie
        // implementują ten sam interfejs

        String directorCard = PolimorfizmBusinessCard.getBusinessCard(director);
        String driverCard = PolimorfizmBusinessCard.getBusinessCard(driver);
        System.out.println(directorCard);
        System.out.println(driverCard);
    }

    // ------- PORÓWNANIA OBIEKTÓW
    public static void porownania() {
        System.out.println("\n------ PORÓWNANIA OBIEKTÓW");

        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(stringBuilder1.equals(stringBuilder2)); //false, to dwa różne obiekty
        //(equals sprawdza w tym wypadku odwołania do obiektów), mają take dwa inne hashCode (identyfikatory obiektów)
        System.out.println(stringBuilder1 == stringBuilder2); //false, porównywane są reference do obiektow a nie wartości
        System.out.println(stringBuilder1.hashCode() + " " + stringBuilder2.hashCode()); // dwa różne hashCode

        //Niektóre obiekty mają nadpisane metody equals i hashCode tak aby można je było łatwo porównywać
        System.out.println(new Integer(3).equals(new Integer(3))); //true
        System.out.println(new Integer(3).hashCode() + " " + new Integer(3).hashCode()); //3 i 3

        //Aby móc sprawdzac czy obiekty są sobie równe należy nadpisać w ich klasach metody
        // equals oraz hasCode (w Intelij są feneratory metod dostępne pod alt+Insert
    }

    // ------- WYJĄTKI
    public static void wyjatki() {
        System.out.println("\n------ WYJĄTKI");
        // obsługa przez "try/catch", przekazanie do klasy nadrzędnej przez "throws"

//do skończenia
    }

    //-------- ENUM - prosty przykład enuma
    public static void enum1(){
        System.out.println("\n-------ENUM");
        testEnuma(CLOSE);
    }

    public static void testEnuma(EnumExample ee){
        switch (ee){
            case OPEN:
                System.out.println("wykonuje proc dla OPEN");
                break;
            case CLOSE:
                System.out.println("wykonuje proc dla CLOSE");
                break;
            case LOW:
                System.out.println("wykonuje proc dla LOW");
                break;
        }

    }


    //-------- KOLEKCJE - LIST, SET, MAP
    public static void kolekcje(){
        System.out.println("\n-------KOLEKCJE LIST, SET, MAP");

        //LIST - elementy mogą się powtarzac, elementy wstawiane są pod indeksem (od zera)------------------------------

        List l1 = new ArrayList();
        l1 = new ArrayList();

        l1.add("1");
        l1.add("a");
        l1.add(3);
        l1.remove(1); //po usunięciu danej pozycji na jej miejsce (indeks) wchodzi element kolejny (przesuwa się)
        System.out.println(l1.get(1)); //3
        //ArrayList używamy gdy chcemy miec szybki dostęp do losowych elementow listy (wyszukiwanie)
        //LinkedList używamy gdy często usuwa i dodaje się elementy (update insert delete)

        //SET - elementy nie będą się powtarzac,------------------------------------------------------------------------
            //HashSet - nie zapewnia kolejności elementow
            //LinkedHashSet - pamięta kolejnośc dodawania elementów
            //TreeSet - gwarantuje sortowanie
        Set <String>s1 = new HashSet<>();
        s1.add("zd");
        s1.add("dw");
        s1.add("gg");
        s1.add("dw"); //nie zostanie dodane - już jest
        System.out.println(s1); //gg,dw,zd - kolejnośc przypadkowa

        Set <String>s2 = new TreeSet<>();
        s2.add("zd");
        s2.add("dw");
        s2.add("gg");
        s2.add("dw"); //nie zostanie dodane - już jest
        System.out.println(s2); //dw,gg,zd - posortowane

        Set <String>s3 = new LinkedHashSet<>();
        s3.add("zd");
        s3.add("dw");
        s3.add("gg");
        s3.add("dw"); //nie zostanie dodane - już jest
        System.out.println(s3); //zd, dw, gg - wg kolejności dodawania

        //MAP - zawiera pary - KLUCZ | WARTOSC (klucze są unikalne)
            //HashMap nie zapwenia kolejności elementów
            //TreeMap gwarantuje sortowanie
            //LinkedHashMap pamięta kolejnośc dodawania elemantów
        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("zz", 4);
        m1.put("zy", 2);
        m1.put("za", 6);
        m1.put("za", 1);
        System.out.println(m1.get("za")); // 1 zwróci wartosc dla klucza - ostatnia wartośc zapisana
        System.out.println(m1.keySet()); // [zz, za, zy] zwróci listę kluczy
        System.out.println(m1.values()); // [4, 1, 2] zwroci liste wartosci

        TreeMap<String, Integer> m2 = new TreeMap<>();
        m2.put("zz", 4);
        m2.put("zy", 2);
        m2.put("za", 6);
        m2.put("za", 1);
        System.out.println(m2.get("za")); // 1
        System.out.println(m2.keySet()); // [za, zy, zz] //POSORTOWANE
        System.out.println(m2.values()); // [1, 2, 4] //POSORTOWANE

        LinkedHashMap<String, Integer> m3 = new
                LinkedHashMap<>();
        m3.put("zz", 4);
        m3.put("zy", 2);
        m3.put("za", 6);
        m3.put("za", 1);
        System. out.println(m3.get("za")); // 1
        System. out.println(m3.keySet()); // [zz, zy, za] //wg kolejnosci dodawania
        System. out.println(m3.values()); // [4, 2, 1] //wg kolejnosci dodawania
    }

    // ------- STRUMIENIE
/*
        List<String> names = Arrays.asList("Jan", "", "Wioletta", null, "Maria");
        String[] tabl1 = {"1","q"};
        ArrayList al1 = new ArrayList();
            al1.add(1);
        List l0 = new ArrayList();
            l0.add(1);
        List ll = Arrays.asList();
*/

    public static void strumienie() {
        System.out.println("\n------ STRUMIENIE");

        // przykład 1 - strumien przefiltrowany i zwrócony do Listy
        List<String> names = Arrays.asList("Jan", "", "Wioletta", null, "Maria");
        System.out.println(names); //[Jan, , Wioletta, null, Maria]
        List<String> filtered =
                names.stream()
                        .filter(s -> s != null && !s.isEmpty())
                        .sorted()
                        .collect(Collectors.toList());
                        //Kolektor służy do łączenia strumienia i zwrócenia wyniku do List lub String
        System.out.println(filtered); // [Jan, Maria, Wioletta]

        // przykład 2
        String[] names1 = {"Wioletta", "Maria"};
        Stream<String> stream = Stream.of(names1);
        List<String> list = stream.collect(Collectors. toList());
        System. out.println(list); // [Wioletta, Maria]

        List<String> names2 = Arrays.asList("Jan", "Tomasz");
        String str = names2.stream().collect(Collectors. joining("; "));
        System. out.println(str); // Jan; Tomasz

        //Metoda forEach w strumieniu
        //Metoda wykonuje iterację po każdym elemencie strumienia i wywołuje wskazaną instrukcję.
        List<String> names3 = Arrays. asList("Jan", "Wioletta", "Maria");
        names3.forEach(s -> {String dots = "..."; System. out.println(s.concat(dots));});

        //Metoda map
        //Metoda jest używana do mapowania każdego elementu do odpowiedniego wyniku.
        List<Integer> numbers = Arrays.asList(8, 3, 5);
        List<Integer> mapped =
                numbers.stream()
                        .map(i -> 2 * i)
                        .collect(Collectors. toList());
        System. out.println(mapped); // 16, 6, 10

        //Metoda filter
        //Metoda jest używana do usunięcia elementów ze strumienia na  podstawie podanego kryterium.
        List<String> names5 = Arrays.asList("Jan", "Wioletta", "Maria");
        List<String> filtered1 =
                names5.stream()
                        .filter(s -> s.contains("i"))
                        .collect(Collectors.toList());
        System. out.println(filtered1); // Wioletta, Maria

        //Metoda match
        //Metoda jest używana do sprawdzenia czy dany predykat odpowiada strumieniowi. Metoda zwraca wartość logiczną.
        List<String> names6 = Arrays.asList("Jan", "Wioletta", "Maria");
        boolean allMatched =
                names6.stream()
                        .allMatch(s -> s.contains("i"));
        System. out.println(allMatched); //false
        boolean anyMatched =
                names6.stream()
                        .anyMatch(s -> s.contains("i"));
        System. out.println(anyMatched); //true

        //Metoda limit
        //Metoda jest używana do zredukowania liczby elementów zawartych w strumieniu.
        List<String> names7 = Arrays. asList("Jan", "Wioletta", "Maria");
        List<String> filtered2 =
                names7.stream()
                        .limit(2)
                        .collect(Collectors. toList());
        System. out.println(filtered2); // Jan, Wioletta

        //Metoda count
        //Metoda jest używana do wyliczenia ilości elementów w strumieniu.
        List<String> names8 = Arrays. asList("Jan", "Wioletta", "Maria");
        long count =
                names8.stream()
                        .filter(s -> s.contains("i"))
                        .count();
        System. out.println(count); // 2

        //Statystyki
        //Umożliwiają wyliczanie różnych statystyk po tym, jak przetwarzanie strumienia dobiegło końca.
        List<Integer> numbers1 = Arrays.asList(8, 3, 5);
        IntSummaryStatistics stats =
                numbers1.stream()
                        .mapToInt(x -> 2 * x)
                        .summaryStatistics();
        System. out.println(stats.getMax()); // 16
        System. out.println(stats.getMin()); // 6
        System. out.println(stats.getSum()); // 32
        System. out.println(stats.getAverage()); // 10.66666666

        //Strumienie równoległe
        //Operacje na strumieniach równoległych wykonywane są w kilku wątkach jednocześnie:
        List<String> names9 = Arrays. asList("Jan", "", "Wioletta", null, "Maria");
        List<String> filtered3 =
                names9.parallelStream()
                        .filter(s -> s != null && !s.isEmpty())
                        .sorted()
                        .collect(Collectors. toList());
        System. out.println(filtered3); // [Jan, Maria, Wioletta]
    }


}







