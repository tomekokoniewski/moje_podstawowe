package pl.tok.beginer;

import static java.lang.Math.*;     //mat()

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;        //bintBdeci()
import java.text.ParseException;    //dateTime();
import java.text.SimpleDateFormat;  //dateTime();
import java.util.*;                 //rndm(), scanner()
import java.util.regex.Matcher;     //pattMatch();
import java.util.regex.Pattern;     //pattMatch();

public class Main {

    public static void main(String[] args) {

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
        scanner();
        //dodac scanner writer
        //dodac obsługę błędów
        //konstruktory
    }

// -------- DRUKOWANIE NA EKAN
    public static void drukuj(){
        System.out.println("-------DRUKOWANIE");
        System.out.println("Ania");
        System.out.println("Ania2\nJAN");	// znak \n to znak nowej linii
        System.out.println('a'+'A'); 		// jeżeli w apostrofach to potraktuje jako cyfrę ASCII i da nam sumę - 162
        System.out.println(1+2); 		// wynik - integer
        System.out.println(1.0+2.0);		// wynik - double
        System.out.println("cudzysłów \"");	// znak \" da nam cudzysłów
        System.out.println(true);
        System.out.println("\n");		// nowa linia
        System.out.println("Piotr \t \t Pawel");// zmak \t to tabulator
    }

// -------- DEKLAROWANIE ZMIENNYCH I STAŁYCH
    public static void deklaracjeZmiennychStalych(){
        System.out.println("\n-------DEKLAROWANIE ZMIENNYCH I STAŁYCH");

        int b;		// zadeklarowanie
        b=0;		// przypisanie
        int a=0;	// zadeklarowanie i przypisanie
        int liczbaA=5, liczbaB=21;				//integer (cyfra całkowita)
        char znak = 'A';					//pojedynczy znak unicode
        double liczba1=1.1, liczba2=2.2;			//podwójna precyzja (cyfra max 15 miejsc po przecinku)
        String ciag_znakow = "Dzień dobry kocham Cię"; 		//ciąg znaków

        final double pi=3.14;	//deklaracja stałej
        final int stała	= 3;	//deklaracja stałen
        System.out.println("pi plus trzy wynosi "+(pi+stała));
    }

// -------- MODULO I LENGTH
    public static void modLength(){
        System.out.println("\n-------MODULO I LENGTH");

        String ciag_znakow = "Dzień dobry kocham Cię";
        int liczba1=5, liczba2=21;

        System.out.println(ciag_znakow.length());		// ile znakow zawiera string ciag_znakow
        System.out.println(liczba2%liczba1); 			// MODULO - reszta z dzielenia - możemy tak zprawdzac czy liczba jest parzysta.
        // 21 mod 5 da nam 1 (20 dzieli sie na 5 i do 21 zostaje 1)
    }

// -------- INKREMENTACJA (zwiększanie wartości) i DEKREMENTACJA (zmniejszanie)
    public static void inkr(){
        System.out.println("\n-------INKREMENTACJA");

        int a = 1, b = 2, c;
        System.out.println(a++); //wydrukuje wart "a" = 1 a następnie zwiększy ją o 1 (a = 2) (inkrementacja postfixowa) //1
        System.out.println(++b); //zwiększy wartoś b o jeden i wydrukuje (inkrementacja predfixowa) //3
    }

// -------- OPERATORY PORÓWNAWCZE I LOGICZNE
    public static void operatory(){
        System.out.println("\n-------OPERATORY PORÓWNAWCZE I LOGICZNE");

        System.out.println(4==3);		//false - (sprawdzenie czy są równe - nieprawda) a=4, b=3
        System.out.println("ala".equals("kot"));//false - (sprawdzenie czy znaki lub stringi są równe - nieprawda) ala<>kot
        System.out.println(4!=3);		//true - (sprawdzenie czy są różne - prawda) a=4, b=3
        System.out.println(4>=3);		//true - (sprawdzenie czy a>=b - prawda) a=4, b=3
        System.out.println("\n");
        System.out.println((4>=3)&&(4<=3));	//false - (PRAWDA and FAŁSZ) jeden z warunków = fałsz -> całe twierdzenie fałszywe
        System.out.println((4>=3)||(4<=3));	//true - (PRAWDA and FAŁSZ) jeden z warunków = prawdziwy -> całe twierdzenie prawdziwe

    }

// -------- FUNKCJE MATEMATYCZNE
    public static void mat(){
        System.out.println("\n-------FUNKCJE MATEMATYCZNE");

        System.out.println("\n"+ Math.sqrt(9));	//Math.sqrt(double liczba) - funkcja matematyczna wyliczająca pierwiastek
        System.out.println(Math.pow(2,3));	//Math.pow(double a, double b) - funkcja matematyczna podnosząca liczbę a do potęgi b (2 do 3 = 8)
        System.out.println(Math.abs(-3));	//Math.abs(liczba) - funkcja matematyczna zwracająca wartośc bezwzględną (dla -3 = 3)
        System.out.println(Math.PI);		//- funkcja matematyczna zwracająca wartośc liczby PI
        System.out.println(Math.E);		//- funkcja matematyczna zwracająca wartośc liczby E
        System.out.println(E);			//zadziała bez przedrostka Math. (wskazania pakietu) gdyż w pierwszej lini kodu dokonaliśmy importu statycznego tej biblioteki
    }

// -------- IF ELSE
    public static void ifElse(){
        System.out.println("\n-------IF ELSE");

        double a1=4,b1=3;

        if(a1<b1){
            System.out.println("4<3");
        }
        else if (a1==b1){
            System.out.println("4=3");
        }
        else {
            System.out.println("4>3");
        }
    }

// -------- KONWERSJA TYPÓW DANYCH
    public static void konwersja(){
        System.out.println("\n-------KONWERSJA TYPÓW DANYCH");

        int AA = 5;
        double BB = 13.5;
        double CC = BB/(double)AA;	//jawnie skonwertowalismy AA na podwójną precyzję (RZUTOWALISMY) - w tym konkretnym przyp java i tak by to zrobila automatycznie
        System.out.println(CC);		//2.7
    }

// -------- ZAOKRĄGLENIE LICZB
    public static void zaokr(){
        System.out.println("\n-------ZAOKRĄGLENIE LICZB");

        System.out.println((double)Math.round((1.35)));		//1,0 - zaokrąglenie do liczby całkowitej
        System.out.println((double)Math.round((1.35)*10)/10);		//1,4 - zaokrąglenie do 1 miejsca po przecinku
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
        while (x<3) {
            x++;
            System.out.println("x= " + x);
        }

        x=0;            //while do - wykona się przynajmniej raz
        do{
            x++;
            System.out.println("x= "+x);
        } while (x<3);
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

        int[] tablica = {1,2,3};
        for (int i: tablica) { //pętla for po elementach talicy - deklaruję zmienną która jest elementem tablicy
            System.out.println(i);
        }
    }

// -------- RANDOM
    public static void rndm() {
        System.out.println("\n-------RANDOM");

        Random r = new Random();
        //int rnd = r.nextInt(5);               //generowanie z obiektu r liczby całkowitej od zera do wartości mniejszej niż podana w nawiasie
        int rnd = r.nextInt(5)+1;       //wygeneruje liczbę od 1 do liczby w nawiasie
        System.out.println(rnd);

        double zmiennaLiczba = (Math.random()); //generowanie liczby losowej <0 (kilka miejsc po przecinku) (można zrezygmowac z przedrostka Math gdyż na początku zaimportowaliśmy pakiet java.lang.Math.*)
        System.out.println(zmiennaLiczba);
        //jeżeli chcemy uzyskac z tego liczbę całkowitą z przedziału mnożymy wynik przez (koniec-początek)
        // a na końcu dodajemy początek przedziału. Całoś wyniku castujemy do integera (odcinamy miejsca po przecinku)
        //np: liczba całkowita z przedziału 2-10
        zmiennaLiczba = (Math.random() * (10-2) )+2;
        System.out.println((int)zmiennaLiczba);
    }

// -------- SCANNER
    public static void scnr() {
        System.out.println("\n-------SCANER");

        Scanner odczyt = new Scanner(System.in);
        while(!odczyt.hasNextInt()){
            System.out.println("Podaj liczbę całkowitą");
            odczyt.nextLine();
        }
        System.out.println(odczyt.nextInt());
    }

// -------- BIGINTEGER, BIGDECIMAL
    public static void bintBdeci() {
        System.out.println("\n-------BIGINTEGER AND BIG DECIMAL");

        BigDecimal a = new BigDecimal("1234567890.987654321");
        BigDecimal b = BigDecimal. valueOf(9234567890.987654321);
        BigDecimal c = b.subtract(a).negate();
        BigDecimal d = c.abs();
        System. out.println(c); // -7999999999.999999679
        System. out.println(d); // 7999999999.999999679
    }

    // -------- CHARACTER
    public static void char1() {
        System.out.println("\n-------CHARACTER");

        char c1 = 'a';
        Character c2 = 'a'; // boxing ("duży character")
        char c3 = c2; // unboxing
        Character c4 = new Character('a');
        System. out.println(Character. isDigit(c4)); // false
        System. out.println(Character. isLowerCase(c4)); // true
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
            System. out.println(array2[i]);
        }

        for (char c : array2) {             // deklaruję zmienna c takiego samego typu jak dane w tablicy i mówię że przypisuje do niej kolejno obiekty z tablicy
            System. out.println(c);
        }
    }

// -------- LISTY
    public static void arraylist() {
        System.out.println("\n-------ARRAY TABLICA");

        ArrayList list1 = new ArrayList();
        list1.add(4.5);
        list1.add("aaa");
        list1.add(false);
        System. out.println(list1);         //cała zawartosc listy
        System. out.println(list1.get(1));  //zawartośc konkretnej pozycji (uwaga po usunieciu pozycji kolejne idą do góry i w miejsce usuniętej mamy kolejną)

        for (int i = 0; i < list1.size(); i++) {
            System. out.println(list1.get(i));
        }

        for (java.lang.Object c : list1) {  //iteracja jak w przyp tabeli, tyle ze zmienna zamiast typu jest obiektem
                                            // (w liscie sa rozne typy i nie moge zadeklarowac jednego)
            System. out.println(c);

        //przykładowe metody
        //list1.remove(0); // usunie wartość 4.5 - w indeks 0 wskoczy "aaa"
         list1.isEmpty(); // false
        }
    }


// -------- STRING BUILDER
    public static void sb() {
        System.out.println("\n-------STRING BUILDER");

        String txt1 = "napis1";
        String txt2 = new String("napis2");

        //łączenie Stringów
        System.out.println(txt1+" "+txt2);
        System.out.println(txt1.concat(" ").concat(txt2)); //metoda łączenia wywołana 2x !

        //String jest "niezmienny" i za każdym jego powstaniem trafia do StringPool'a
        //dlatego można używać StringBuildera który nie jest niezmienny i jest tylko jeden
        // (nie trafia do String Poola zwiększając zużycie pamięci)

        StringBuilder alph = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) { //możliwa iteracja bo to znaki unicode - a=97, b=98 ...
            alph.append(c);
        }System.out.println(alph);

        System. out.println(alph.append(alph.length()).reverse()); //przykładowe metody SB
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
        SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = ft1.parse("2017-12-24"); //parsowanie ze stringa do daty wg formatu zdefiniowanego w SimpleDateFormat
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System. out.println(date1);
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
    }


// -------- SCANNER
    public static void scanner() {
        System.out.println("\n-------SCANNER");

        String text = "51 2 14 7";                  //scanner na zmiennej
        Scanner scanner = new Scanner(text);
        while(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i); // 51 2 14 7
        }

        String path = "test.txt";
        File file = new File(path);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
            System.out.println("Wczytano plik: "+path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono pliku: "+path);
        }
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

    }


}







