import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        String allyn;
        Scanner allscanner = new Scanner(System.in);
        do {
            int option;
            double num1, num2;
            String yn, yn2;
            double output;
            String unityn;
            Scanner scanner = new Scanner(System.in);

            System.out.println("   Welcome to the java Project!");
            System.out.println("-----------------------------------");
            System.out.println();
            System.out.println("This is the Cammand line softwere/tool made in Java Programing Language, it includes \n  1: calculator  \n  2: Currancy Converter using Application Programing interface(API) \n  3: Unit Converter only matrix units");
            System.out.println();
            System.out.println("Developed by :\n Ankit Dahake \n Gargi Pawar \n Samiksha Gawande \n Asmita Kutwal \n Triveni ingle");
            System.out.println();
            System.out.println("Select what you want to Use :");
            System.out.println(" 1: Calculator \n 2: Currancy Converter \n 3: Unit Converter");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("   Welcome to the calculator!");
                        System.out.println("---------------------------------");
                        System.out.print("Enter first number:");
                        num1 = scanner.nextDouble();

                        System.out.print("Enter an operator (+, -, *, /): ");
                        String operator = scanner.next();


                        System.out.print("Enter second number:");
                        num2 = scanner.nextDouble();


                        switch (operator) {
                            case "+":
                                output = num1 + num2;
                                System.out.println();
                                System.out.println("Result : " + num1 + " " + operator + " " + num2 + " = " + output);
                                break;

                            case "-":
                                output = num1 - num2;
                                System.out.println();
                                System.out.println("Result : " + num1 + " " + operator + " " + num2 + " = " + output);
                                break;

                            case "*":
                                output = num1 * num2;
                                System.out.println();
                                System.out.println("Result : " + num1 + " " + operator + " " + num2 + " = " + output);
                                break;

                            case "/":
                                output = num1 / num2;
                                System.out.println();
                                System.out.println("Result : " + num1 + " " + operator + " " + num2 + " = " + output);
                                break;


                            default:
                                System.out.println();
                                System.out.println("You have entered wrong operator");
                                break;

                        }

                        System.out.println();
                        System.out.println("Do you want to Continue to Calculator (Y/N):");
                        yn = scanner.next();
                    } while (yn.equals("Y") || yn.equals("y"));
                    System.out.println();
                    System.out.println("   Thank you for the using the Calculator");
                    System.out.println("-----------------------------------------------");
                    System.out.println();
                    break;
                case 2:
                    do {
                        System.out.println();
                        System.out.println("    Welcome to the Currancy Converter!");
                        System.out.println("------------------------------------------");
                        System.out.println();

                        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

                        currencyCodes.put(1, "INR");
                        currencyCodes.put(2, "USD");
                        currencyCodes.put(3, "JPY");
                        currencyCodes.put(4, "BGN");
                        currencyCodes.put(5, "CZK");
                        currencyCodes.put(6, "DKK");
                        currencyCodes.put(7, "GBP");
                        currencyCodes.put(8, "HUF");
                        currencyCodes.put(9, "PLN");
                        currencyCodes.put(10, "RON");
                        currencyCodes.put(11, "SEK");
                        currencyCodes.put(12, "CHF");
                        currencyCodes.put(13, "ISK");
                        currencyCodes.put(14, "NOK");
                        currencyCodes.put(15, "HRK");
                        currencyCodes.put(16, "RUB");
                        currencyCodes.put(17, "TRY");
                        currencyCodes.put(18, "AUD");
                        currencyCodes.put(19, "BRL");
                        currencyCodes.put(20, "CAD");
                        currencyCodes.put(21, "CNY");
                        currencyCodes.put(22, "HKD");
                        currencyCodes.put(23, "IDR");
                        currencyCodes.put(24, "ILS");
                        currencyCodes.put(25, "KRW");
                        currencyCodes.put(26, "MXN");
                        currencyCodes.put(27, "MYR");
                        currencyCodes.put(28, "NZD");
                        currencyCodes.put(29, "PHP");
                        currencyCodes.put(30, "SGD");
                        currencyCodes.put(31, "THB");
                        currencyCodes.put(32, "ZAR");

                        String fromCurrency_code, toCurrency_code;
                        double amount;

                        Scanner sc = new Scanner(System.in);

                        System.out.println("Currency Converting From?");
                        System.out.println("1:  INR (Indian Rupee)");
                        System.out.println("2:  USD (US Dollar)");
                        System.out.println("3:  JPY (Japanese yen)");
                        System.out.println("4:  BGN (Bulgarian lev)");
                        System.out.println("5:  CZK (Czech koruna)");
                        System.out.println("6:  DKK (Danish krone)");
                        System.out.println("7:  GBP (Pound sterling)");
                        System.out.println("8:  HUF (Hungarian forint)");
                        System.out.println("9:  PLN ( Polish zloty)");
                        System.out.println("10: RON (Romanian leu)");
                        System.out.println("11: SEK (Swedish krona)");
                        System.out.println("12: CHF (Swiss franc)");
                        System.out.println("13: ISK (Icelandic krona)");
                        System.out.println("14: NOK (Norwegian krone)");
                        System.out.println("15: HRK (Croatian kuna)");
                        System.out.println("16: RUB (Russian rouble)");
                        System.out.println("17: TRY (Turkish lira)");
                        System.out.println("18: AUD (Australian dollar)");
                        System.out.println("19: BRL (Brazilian real)");
                        System.out.println("20: CAD (Canadian dollar)");
                        System.out.println("21: CNY (Chinese yuan renminbi)");
                        System.out.println("22: HKD (Hong Kong dollar)");
                        System.out.println("23: IDR (Indonesian rupiah)");
                        System.out.println("24: ILS (Israeli shekel)");
                        System.out.println("25: KRW (South Korean won)");
                        System.out.println("26: MXN (Mexican peso)");
                        System.out.println("27: MYR (Malaysian ringgit)");
                        System.out.println("28: NZD (New Zealand dollar)");
                        System.out.println("29: PHP (Philippine peso)");
                        System.out.println("30: SGD (Singapore dollar)");
                        System.out.println("31: THB (Thai baht)");
                        System.out.println("32: ZAR (South African rand)");


                        fromCurrency_code = currencyCodes.get(sc.nextInt());


                        System.out.println("Currency Converting To?");
                        System.out.println("1:  INR (Indian Rupee)");
                        System.out.println("2:  USD (US Dollar)");
                        System.out.println("3:  JPY (Japanese yen)");
                        System.out.println("4:  BGN (Bulgarian lev)");
                        System.out.println("5:  CZK (Czech koruna)");
                        System.out.println("6:  DKK (Danish krone)");
                        System.out.println("7:  GBP (Pound sterling)");
                        System.out.println("8:  HUF (Hungarian forint)");
                        System.out.println("9:  PLN ( Polish zloty)");
                        System.out.println("10: RON (Romanian leu)");
                        System.out.println("11: SEK (Swedish krona)");
                        System.out.println("12: CHF (Swiss franc)");
                        System.out.println("13: ISK (Icelandic krona)");
                        System.out.println("14: NOK (Norwegian krone)");
                        System.out.println("15: HRK (Croatian kuna)");
                        System.out.println("16: RUB (Russian rouble)");
                        System.out.println("17: TRY (Turkish lira)");
                        System.out.println("18: AUD (Australian dollar)");
                        System.out.println("19: BRL (Brazilian real)");
                        System.out.println("20: CAD (Canadian dollar)");
                        System.out.println("21: CNY (Chinese yuan renminbi)");
                        System.out.println("22: HKD (Hong Kong dollar)");
                        System.out.println("23: IDR (Indonesian rupiah)");
                        System.out.println("24: ILS (Israeli shekel)");
                        System.out.println("25: KRW (South Korean won)");
                        System.out.println("26: MXN (Mexican peso)");
                        System.out.println("27: MYR (Malaysian ringgit)");
                        System.out.println("28: NZD (New Zealand dollar)");
                        System.out.println("29: PHP (Philippine peso)");
                        System.out.println("30: SGD (Singapore dollar)");
                        System.out.println("31: THB (Thai baht)");
                        System.out.println("32: ZAR (South African rand)");

                        toCurrency_code = currencyCodes.get(sc.nextInt());

                        System.out.println("Amount you wish to convert");
                        amount = sc.nextFloat();

                        sendHttpGetRequest(fromCurrency_code, toCurrency_code, amount);

                        System.out.println();
                        System.out.println("Do you want to Continue Y/N: ");
                        yn2 = sc.next();
                    } while (yn2.equals("Y") || yn2.equals("y"));

                    System.out.println("   Thank you for the using the currency Converter");
                    System.out.println("------------------------------------------------------ ");
                    break;


                case 3:
                    String Unityn;
                    do {

                        System.out.println();
                        System.out.println("    Welcome to the Unit Converter");
                        System.out.println("----------------------------------------");
                        System.out.println();
                        System.out.println("Select What you want to Convert :");
                        System.out.println(" 1: Length \n 2: Area \n 3: Volume \n 4: Speed \n 5: Weight \n 6: Temperature \n 7: Power \n 8: Pressure");
                        Scanner scan = new Scanner(System.in);
                        int choice = scan.nextInt();

                        switch (choice) {
                            case 1:

                                double Nanometer = 1.0E9;
                                double Picometer = 1.0E12;
                                double Lunar_distance = 2.6041E-8;
                                double Astronomical_unit = 6.6846E-12;
                                double Parsec = 3.24077E-17;
                                double Micrometer = 1000000;
                                double Meter = 1;
                                double Centimeter = 100;
                                double Kilometer = 0.001;
                                double Milimeter = 1000;
                                double Light_year = 1.057E-16;
                                double Decimeter = 10;


                                do {
                                    HashMap<Integer, String> lengthUnits = new HashMap<Integer, String>();

                                    lengthUnits.put(1, "Nanometer");
                                    lengthUnits.put(2, "Picometer");
                                    lengthUnits.put(3, "Lunar distance");
                                    lengthUnits.put(4, "Astronomical unit");
                                    lengthUnits.put(5, "Parsec");
                                    lengthUnits.put(6, "Micrometer");
                                    lengthUnits.put(7, "Meter");
                                    lengthUnits.put(8, "Centimeter");
                                    lengthUnits.put(9, "Kilometer");
                                    lengthUnits.put(10, "Milimeter");
                                    lengthUnits.put(11, "Light year");
                                    lengthUnits.put(12, "Decimeter");


                                    System.out.println("Select fromUnit :");
                                    System.out.println("1: Nanometer (nm)");
                                    System.out.println("2: Picometer (pm)");
                                    System.out.println("3: Lunar distance (LD)");
                                    System.out.println("4: Astronomical unit (AU)");
                                    System.out.println("5: Parsec (pc)");
                                    System.out.println("6: Micrometer (μm)");
                                    System.out.println("7: Meter (m)");
                                    System.out.println("8: Centimeter (cm)");
                                    System.out.println("9: Kilometer (km)");
                                    System.out.println("10: Milimeter (mm)");
                                    System.out.println("11: Light year (ly)");
                                    System.out.println("12: Decimeter (dm)");

                                    String fromUnit = lengthUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");
                                    System.out.println("1: Nanometer (nm)");
                                    System.out.println("2: Picometer (pm)");
                                    System.out.println("3: Lunar distance (LD)");
                                    System.out.println("4: Astronomical unit (AU)");
                                    System.out.println("5: Parsec (pc)");
                                    System.out.println("6: Micrometer (μm)");
                                    System.out.println("7: Meter (m)");
                                    System.out.println("8: Centimeter (cm)");
                                    System.out.println("9: Kilometer (km)");
                                    System.out.println("10: Milimeter (mm)");
                                    System.out.println("11: Light year (ly)");
                                    System.out.println("12: Decimeter (dm)");

                                    String toUnit = lengthUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinMeter = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Nanometer":
                                            valueinMeter = amount / Nanometer;

                                            break;

                                        case "Picometer":
                                            valueinMeter = amount / Picometer;

                                            break;

                                        case "Meter":
                                            valueinMeter = amount / Meter;

                                            break;

                                        case "Lunar distance":
                                            valueinMeter = amount / Lunar_distance;
                                            break;

                                        case "Astronomical unit":
                                            valueinMeter = amount / Astronomical_unit;
                                            break;

                                        case "Parsec":
                                            valueinMeter = amount / Parsec;
                                            break;

                                        case "Micrometer":
                                            valueinMeter = amount / Micrometer;
                                            break;

                                        case "Centimeter":
                                            valueinMeter = amount / Centimeter;
                                            break;

                                        case "Kilometer":
                                            valueinMeter = amount / Kilometer;
                                            break;

                                        case "Milimeter":
                                            valueinMeter = amount / Milimeter;
                                            break;

                                        case "Light year":
                                            valueinMeter = amount / Light_year;
                                            break;

                                        case "Decimeter":
                                            valueinMeter = amount / Decimeter;
                                            break;


                                    }
                                    switch (toUnit) {
                                        case "Nanometer":
                                            result = valueinMeter * Nanometer;

                                            break;

                                        case "Picometer":

                                            result = valueinMeter * Picometer;

                                            break;

                                        case "Meter":
                                            result = valueinMeter * Meter;

                                            break;

                                        case "Lunar distance":
                                            result = valueinMeter * Lunar_distance;
                                            break;

                                        case "Astronomical unit":
                                            result = valueinMeter * Astronomical_unit;
                                            break;

                                        case "Parsec":
                                            result = valueinMeter * Parsec;
                                            break;

                                        case "Micrometer":
                                            result = valueinMeter * Micrometer;
                                            break;

                                        case "Centimeter":
                                            result = valueinMeter * Centimeter;
                                            break;

                                        case "Kilometer":
                                            result = valueinMeter * Kilometer;
                                            break;

                                        case "Milimeter":
                                            result = valueinMeter * Milimeter;
                                            break;

                                        case "Light year":
                                            result = valueinMeter * Light_year;
                                            break;

                                        case "Decimeter":
                                            result = valueinMeter * Decimeter;
                                            break;

                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();
                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;


                            case 2:
                                do {
                                    double Square_meter = 1;
                                    double Square_decimeter = 100;
                                    double Square_centimeter = 10000;
                                    double Square_kilometer = 0.000001;
                                    double Square_milimeter = 1000000;
                                    double Are = 0.01;
                                    double Hectare = 0.0001;


                                    HashMap<Integer, String> areaUnits = new HashMap<Integer, String>();

                                    areaUnits.put(1, "Square Meter");
                                    areaUnits.put(2, "Square decimeter");
                                    areaUnits.put(3, "Square Centimeter");
                                    areaUnits.put(4, "Square Kilometer");
                                    areaUnits.put(5, "Square Milimeter");
                                    areaUnits.put(6, "Are");
                                    areaUnits.put(7, "Hectare");


                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Square Meter (m^2) ");
                                    System.out.println("2: Square decimeter (dm^2) ");
                                    System.out.println("3: Square Centimeter (cm^2)");
                                    System.out.println("4: Square Kilometer (km^2)");
                                    System.out.println("5: Square Milimeter (mm^2)");
                                    System.out.println("6: Are (ar)");
                                    System.out.println("7: Hectare (ha)");

                                    String fromUnit = areaUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    System.out.println("1: Square Meter (m^2) ");
                                    System.out.println("2: Square decimeter (dm^2) ");
                                    System.out.println("3: Square Centimeter (cm^2)");
                                    System.out.println("4: Square Kilometer (km^2)");
                                    System.out.println("5: Square Milimeter (mm^2)");
                                    System.out.println("6: Are (ar)");
                                    System.out.println("7: Hectare (ha)");

                                    String toUnit = areaUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinSquareunit = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Square Meter":
                                            valueinSquareunit = amount / Square_meter;

                                            break;

                                        case "Square decimeter":
                                            valueinSquareunit = amount / Square_decimeter;

                                            break;

                                        case "Square Centimeter":
                                            valueinSquareunit = amount / Square_centimeter;

                                            break;

                                        case "Square Kilometer":
                                            valueinSquareunit = amount / Square_kilometer;
                                            break;

                                        case "Square Milimeter":
                                            valueinSquareunit = amount / Square_milimeter;
                                            break;

                                        case "are":
                                            valueinSquareunit = amount / Are;
                                            break;

                                        case "Hectare":
                                            valueinSquareunit = amount / Hectare;
                                            break;


                                    }

                                    switch (toUnit) {
                                        case "Square Meter":
                                            result = valueinSquareunit * Square_meter;

                                            break;

                                        case "Square decimeter":
                                            result = valueinSquareunit * Square_decimeter;

                                            break;

                                        case "Square Centimeter":
                                            result = valueinSquareunit * Square_centimeter;

                                            break;

                                        case "Square Kilometer":
                                            result = valueinSquareunit * Square_kilometer;
                                            break;

                                        case "Square Milimeter":
                                            result = valueinSquareunit * Square_milimeter;
                                            break;

                                        case "are":
                                            result = valueinSquareunit * Are;
                                            break;

                                        case "Hectare":
                                            result = valueinSquareunit * Hectare;
                                            break;


                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;
                            case 3:

                                do {
                                    double Hectoliter = 0.01;
                                    double Cubic_meter = 0.001;
                                    double Cubic_centimeter = 1000;
                                    double Deciliter = 10;
                                    double Centiliter = 100;
                                    double Cubic_decimeter = 1;
                                    double Liter = 1;
                                    double Cubic_milimeter = 1000000;
                                    double Milliliter = 1000;


                                    HashMap<Integer, String> volumeUnits = new HashMap<Integer, String>();

                                    volumeUnits.put(1, "Hectoliter");
                                    volumeUnits.put(2, "Cubic Meter");
                                    volumeUnits.put(3, "Cubic Centimeter");
                                    volumeUnits.put(4, "Deciliter");
                                    volumeUnits.put(5, "Centiliter");
                                    volumeUnits.put(6, "Cubic Decimeter");
                                    volumeUnits.put(7, "Liter");
                                    volumeUnits.put(8, "Cubic_milimeter");
                                    volumeUnits.put(9, "Milliliter");


                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Hectoliter (hl) ");
                                    System.out.println("2: Cubic Meter (m^3) ");
                                    System.out.println("3: Cubic Centimeter (cm^3)");
                                    System.out.println("4: Deciliter (dl)");
                                    System.out.println("5: Centiliter (cl)");
                                    System.out.println("6: Cubic Decimeter (dm^3)");
                                    System.out.println("7: Liter (l)");
                                    System.out.println("8: Cubic_milimeter (mm^3)");
                                    System.out.println("9: Milliliter (ml)");


                                    String fromUnit = volumeUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    System.out.println("1: Hectoliter (hl) ");
                                    System.out.println("2: Cubic Meter (m^3) ");
                                    System.out.println("3: Cubic Centimeter (cm^3)");
                                    System.out.println("4: Deciliter (dl)");
                                    System.out.println("5: Centiliter (cl)");
                                    System.out.println("6: Cubic Decimeter (dm^3)");
                                    System.out.println("7: Liter (l)");
                                    System.out.println("8: Cubic_milimeter (mm^3)");
                                    System.out.println("9: Milliliter (ml)");

                                    String toUnit = volumeUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinLiter = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Hectoliter":
                                            valueinLiter = amount / Hectoliter;

                                            break;

                                        case "Cubic Meter":
                                            valueinLiter = amount / Cubic_meter;

                                            break;

                                        case "Cubic Centimeter":
                                            valueinLiter = amount / Cubic_centimeter;

                                            break;

                                        case "Deciliter":
                                            valueinLiter = amount / Deciliter;
                                            break;

                                        case "Centiliter":
                                            valueinLiter = amount / Centiliter;
                                            break;

                                        case "Cubic Decimeter":
                                            valueinLiter = amount / Cubic_decimeter;
                                            break;

                                        case "Liter":
                                            valueinLiter = amount / Liter;
                                            break;

                                        case "Cubic_milimeter":
                                            valueinLiter = amount / Cubic_milimeter;
                                            break;

                                        case "Milliliter":
                                            valueinLiter = amount / Milliliter;
                                            break;

                                    }

                                    switch (toUnit) {
                                        case "Hectoliter":
                                            result = valueinLiter * Hectoliter;

                                            break;

                                        case "Cubic Meter":

                                            result = valueinLiter * Cubic_meter;

                                            break;

                                        case "Cubic Centimeter":
                                            result = valueinLiter * Cubic_centimeter;

                                            break;

                                        case "Deciliter":
                                            result = valueinLiter * Deciliter;
                                            break;

                                        case "Centiliter":
                                            result = valueinLiter * Centiliter;
                                            break;

                                        case "Cubic Decimeter":
                                            result = valueinLiter * Cubic_decimeter;
                                            break;

                                        case "Liter":
                                            result = valueinLiter * Liter;
                                            break;

                                        case "Cubic_milimeter":
                                            result = valueinLiter * Cubic_milimeter;
                                            break;

                                        case "Milliliter":
                                            result = valueinLiter * Milliliter;
                                            break;

                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;

                            case 4:
                                do {

                                    double Speed_of_light = 9.265555555555562968E-10;
                                    double Kilometer_per_second = 0.000277777777777778;
                                    double Mile_per_hour = 0.621371111111111608208;
                                    double Mach = 0.0008162777777777784308;
                                    double Inch_per_second = 10.936133055555564304462;
                                    double Meter_per_second = 0.277777777777778;
                                    double Kilometer_per_hour = 1;

                                    HashMap<Integer, String> speedUnits = new HashMap<Integer, String>();

                                    speedUnits.put(1, "Speed of light");
                                    speedUnits.put(2, "Kilometer/second");
                                    speedUnits.put(3, "Mile/hour");
                                    speedUnits.put(4, "Mach");
                                    speedUnits.put(5, "Inch/second");
                                    speedUnits.put(6, "Meter/second");
                                    speedUnits.put(7, "Kilometer/hour");

                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Speed of light (c) ");
                                    System.out.println("2: Kilometer/second  (km/s) ");
                                    System.out.println("3: Mile/hour (mph)");
                                    System.out.println("4: Mach (ma)");
                                    System.out.println("5: Inch/second (in/s)");
                                    System.out.println("6: Meter/second(m/s)");
                                    System.out.println("7: Kilometer/hour (km/h)");

                                    String fromUnit = speedUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    System.out.println("1: Speed of light (c) ");
                                    System.out.println("2: Kilometer/second  (km/s) ");
                                    System.out.println("3: Mile/hour (mph)");
                                    System.out.println("4: Mach (ma)");
                                    System.out.println("5: Inch/second (in/s)");
                                    System.out.println("6: Meter/second(m/s)");
                                    System.out.println("7: Kilometer/hour (km/h)");

                                    String toUnit = speedUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinkiloperhour = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Speed of light":
                                            valueinkiloperhour = amount / Speed_of_light;

                                            break;

                                        case "Kilometer/second":
                                            valueinkiloperhour = amount / Kilometer_per_second;

                                            break;

                                        case "Mile/hour":
                                            valueinkiloperhour = amount / Mile_per_hour;

                                            break;

                                        case "Mach":
                                            valueinkiloperhour = amount / Mach;
                                            break;

                                        case "Inch/second":
                                            valueinkiloperhour = amount / Inch_per_second;
                                            break;

                                        case "Meter/second":
                                            valueinkiloperhour = amount / Meter_per_second;
                                            break;

                                        case "Kilometer/hour":
                                            valueinkiloperhour = amount / Kilometer_per_hour;
                                            break;


                                    }

                                    switch (toUnit) {
                                        case "Speed of light":
                                            result = valueinkiloperhour * Speed_of_light;

                                            break;

                                        case "Kilometer/second":
                                            result = valueinkiloperhour * Kilometer_per_second;

                                            break;

                                        case "Mile/hour":
                                            result = valueinkiloperhour * Mile_per_hour;

                                            break;

                                        case "Mach":
                                            result = valueinkiloperhour * Mach;
                                            break;

                                        case "Inch/second":
                                            result = valueinkiloperhour * Inch_per_second;
                                            break;

                                        case "Meter/second":
                                            result = valueinkiloperhour * Meter_per_second;
                                            break;

                                        case "Kilometer/hour":
                                            result = valueinkiloperhour * Kilometer_per_hour;
                                            break;


                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;

                            case 5:
                                do {

                                    double Gram = 1000;
                                    double Microgram = 1000000000;
                                    double Quintal = 0.01;
                                    double Carat = 5000;
                                    double Ton = 0.001;
                                    double Milligram = 1000000;
                                    double Kilogram = 1;


                                    HashMap<Integer, String> weightUnits = new HashMap<Integer, String>();

                                    weightUnits.put(1, "Gram");
                                    weightUnits.put(2, "Microgram");
                                    weightUnits.put(3, "Quintal");
                                    weightUnits.put(4, "Carat");
                                    weightUnits.put(5, "Ton");
                                    weightUnits.put(6, "Milligram");
                                    weightUnits.put(7, "Kilogram");


                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Gram (g)");
                                    System.out.println("2: Microgram (mg)");
                                    System.out.println("3: Quintal (q)");
                                    System.out.println("4: Carat (ct)");
                                    System.out.println("5: Ton (t)");
                                    System.out.println("6: Milligram (mg)");
                                    System.out.println("7: Kilogram (kg)");


                                    String fromUnit = weightUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    System.out.println("1: Gram (g)");
                                    System.out.println("2: Microgram (mg)");
                                    System.out.println("3: Quintal (q)");
                                    System.out.println("4: Carat (ct)");
                                    System.out.println("5: Ton (t)");
                                    System.out.println("6: Milligram (mg)");
                                    System.out.println("7: Kilogram (kg)");

                                    String toUnit = weightUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinKilogram = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Gram":
                                            valueinKilogram = amount / Gram;

                                            break;

                                        case "Microgram":
                                            valueinKilogram = amount / Microgram;

                                            break;

                                        case "Quintal":
                                            valueinKilogram = amount / Quintal;

                                            break;

                                        case "Carat":
                                            valueinKilogram = amount / Carat;
                                            break;

                                        case "Ton":
                                            valueinKilogram = amount / Ton;
                                            break;

                                        case "Milligram":
                                            valueinKilogram = amount / Milligram;
                                            break;

                                        case "Kilogram":
                                            valueinKilogram = amount / Kilogram;
                                            break;

                                    }

                                    switch (toUnit) {
                                        case "Gram":
                                            result = valueinKilogram * Gram;

                                            break;

                                        case "Microgram":
                                            result = valueinKilogram * Microgram;

                                            break;

                                        case "Quintal":
                                            result = valueinKilogram * Quintal;

                                            break;

                                        case "Carat":
                                            result = valueinKilogram * Carat;
                                            break;

                                        case "Ton":
                                            result = valueinKilogram * Ton;
                                            break;

                                        case "Milligram":
                                            result = valueinKilogram * Milligram;
                                            break;

                                        case "Kilogram":
                                            result = valueinKilogram * Kilogram;
                                            break;

                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;

                            case 6:
                                do {


                                    HashMap<Integer, String> temperatureUnits = new HashMap<Integer, String>();

                                    temperatureUnits.put(1, "Degree Ranking");
                                    temperatureUnits.put(2, "Degree Celsius");
                                    temperatureUnits.put(3, "Degree Reaumur");
                                    temperatureUnits.put(4, "Degree Fahrenheit");
                                    temperatureUnits.put(5, "Kelvin");

                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Degree Ranking (R)");
                                    System.out.println("2: Degree Celsius (C)");
                                    System.out.println("3: Degree Reaumur (Re)");
                                    System.out.println("4: Degree Fahrenheit (F)");
                                    System.out.println("5: Kelvin (K)");

                                    String fromUnit = temperatureUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    System.out.println("1: Degree Ranking (R)");
                                    System.out.println("2: Degree Celsius (C)");
                                    System.out.println("3: Degree Reaumur (Re)");
                                    System.out.println("4: Degree Fahrenheit (F)");
                                    System.out.println("5: Kelvin (K)");

                                    String toUnit = temperatureUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinCelsius = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Degree Ranking":
                                            valueinCelsius = (amount - 491.67) * (5 / 9);
                                            break;

                                        case "Degree Celsius":
                                            valueinCelsius = amount * 1;
                                            break;

                                        case "Degree Reaumur":
                                            valueinCelsius = amount * 5 / 4;

                                            break;

                                        case "Degree Fahrenheit":
                                            valueinCelsius = (amount - 32) * 5 / 9;
                                            break;

                                        case "Kelvin":
                                            valueinCelsius = amount - 273.15;
                                            break;

                                    }

                                    switch (toUnit) {
                                        case "Degree Ranking":
                                            result = (valueinCelsius + 273.15) * 9 / 5;
                                            break;

                                        case "Degree Celsius":
                                            result = valueinCelsius;
                                            break;

                                        case "Degree Reaumur":
                                            result = valueinCelsius * 4 / 5;
                                            break;

                                        case "Degree Fahrenheit":
                                            result = (valueinCelsius * 9 / 5) + 32;
                                            break;

                                        case "Kelvin":
                                            result = valueinCelsius + 273.15;
                                            break;

                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;
                            case 7:
                                do {

                                    double Joule_per_second = 1000;
                                    double British_thermal_unit_per_Second = 0.9478171;
                                    double Metric_horsepower = 1.3596216;
                                    double Kilogram_meter_per_second = 101.9716213;
                                    double kilocalorie_per_second = 0.239;
                                    double Watt = 1000;
                                    double Imperial_horsepower = 1.3410221;
                                    double Foot_pound_per_second = 737.5621489;
                                    double Newton_meter_per_second = 1000;
                                    double Kilowatt = 1;


                                    HashMap<Integer, String> powerUnits = new HashMap<Integer, String>();

                                    powerUnits.put(1, "Joule/second");
                                    powerUnits.put(2, "British thermal unit/Second");
                                    powerUnits.put(3, "Metric horsepower");
                                    powerUnits.put(4, "Kilogram meter/second");
                                    powerUnits.put(5, "kilocalorie/second");
                                    powerUnits.put(6, "Watt");
                                    powerUnits.put(7, "Imperial horsepower");
                                    powerUnits.put(8, "Foot pound/second ");
                                    powerUnits.put(9, "Newton meter/second");
                                    powerUnits.put(10, "Kilowatt");

                                    System.out.println("Select fromUnit :");

                                    powerUnits.put(1, "Joule/second (J/s)");
                                    powerUnits.put(2, "British thermal unit/Second (Btu/s");
                                    powerUnits.put(3, "Metric horsepower (PS)");
                                    powerUnits.put(4, "Kilogram meter/second (kgm/s)");
                                    powerUnits.put(5, "kilocalorie/second (kcal/s)");
                                    powerUnits.put(6, "Watt (W)");
                                    powerUnits.put(7, "Imperial horsepower (hp)");
                                    powerUnits.put(8, "Foot pound/second (ft.lb/s)");
                                    powerUnits.put(9, "Newton meter/second (N.m/s)");
                                    powerUnits.put(10, "Kilowatt (kW)");


                                    String fromUnit = powerUnits.get(scan.nextInt());

                                    System.out.println("Select toUnit :");

                                    powerUnits.put(1, "Joule/second (J/s)");
                                    powerUnits.put(2, "British thermal unit/Second (Btu/s");
                                    powerUnits.put(3, "Metric horsepower (PS)");
                                    powerUnits.put(4, "Kilogram meter/second (kgm/s)");
                                    powerUnits.put(5, "kilocalorie/second (kcal/s)");
                                    powerUnits.put(6, "Watt (W)");
                                    powerUnits.put(7, "Imperial horsepower (hp)");
                                    powerUnits.put(8, "Foot pound/second (ft.lb/s)");
                                    powerUnits.put(9, "Newton meter/second (N.m/s)");
                                    powerUnits.put(10, "Kilowatt (kW)");

                                    String toUnit = powerUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinKilowatt = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Joule/second":
                                            valueinKilowatt = amount / Joule_per_second;

                                            break;

                                        case "British thermal unit/Second":
                                            valueinKilowatt = amount / British_thermal_unit_per_Second;

                                            break;

                                        case "Metric horsepower":
                                            valueinKilowatt = amount / Metric_horsepower;

                                            break;

                                        case "Kilogram meter/second":
                                            valueinKilowatt = amount / Kilogram_meter_per_second;
                                            break;

                                        case "kilocalorie/second":
                                            valueinKilowatt = amount / kilocalorie_per_second;
                                            break;

                                        case "Watt":
                                            valueinKilowatt = amount / Watt;
                                            break;

                                        case "Imperial horsepower":
                                            valueinKilowatt = amount / Imperial_horsepower;
                                            break;
                                        case "Foot pound/second":
                                            valueinKilowatt = amount / Foot_pound_per_second;
                                            break;
                                        case "Newton meter/second":
                                            valueinKilowatt = amount / Newton_meter_per_second;
                                            break;
                                        case "Kilowatt":
                                            valueinKilowatt = amount / Kilowatt;
                                            break;

                                    }

                                    switch (toUnit) {
                                        case "Joule/second":
                                            result = valueinKilowatt * Joule_per_second;

                                            break;

                                        case "British thermal unit/Second":
                                            result = valueinKilowatt * British_thermal_unit_per_Second;

                                            break;

                                        case "Metric horsepower":
                                            result = valueinKilowatt * Metric_horsepower;

                                            break;

                                        case "Kilogram meter/second":
                                            result = valueinKilowatt * Kilogram_meter_per_second;
                                            break;

                                        case "kilocalorie/second":
                                            result = valueinKilowatt * kilocalorie_per_second;
                                            break;

                                        case "Watt":
                                            result = valueinKilowatt * Watt;
                                            break;

                                        case "Imperial horsepower":
                                            result = valueinKilowatt * Imperial_horsepower;
                                            break;
                                        case "Foot pound/second":
                                            result = valueinKilowatt * Foot_pound_per_second;
                                            break;
                                        case "Newton meter/second":
                                            result = valueinKilowatt * Newton_meter_per_second;
                                            break;
                                        case "Kilowatt":
                                            result = valueinKilowatt * Kilowatt;
                                            break;

                                    }
                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();


                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;
                            case 8:

                                do {

                                    double Millimeter_of_water = 10197.16;
                                    double Pounds_per_square_foot = 2088.543512;
                                    double Kilogram_force_per_square_centimeter = 1.0197;
                                    double Pounds_per_square_inch = 14.503774;
                                    double Millimeter_of_mercury = 750.0617;
                                    double Bar = 1;
                                    double Inch_of_mercury = 29.53;
                                    double millibar = 1000;
                                    double Hectopascal = 1000;
                                    double Standard_atmosphere = 0.986923;
                                    double Kilopascal = 100;
                                    double Kilogram_force_per_square_meter = 10197.1621;
                                    double Megapascal = 0.1;


                                    HashMap<Integer, String> pressureUnits = new HashMap<Integer, String>();

                                    pressureUnits.put(1, "Millimeter of water");
                                    pressureUnits.put(2, "Pounds square foot");
                                    pressureUnits.put(3, "Kilogram force/square centimeter");
                                    pressureUnits.put(4, "Pounds/square inch");
                                    pressureUnits.put(5, "Millimeter of mercury");
                                    pressureUnits.put(6, "Bar");
                                    pressureUnits.put(7, "Inch of mercury");
                                    pressureUnits.put(8, "millibar");
                                    pressureUnits.put(9, "Hectopascal");
                                    pressureUnits.put(10, "Standard atmosphere");
                                    pressureUnits.put(11, "Kilopascal");
                                    pressureUnits.put(12, "Kilogram force/square meter");
                                    pressureUnits.put(13, "Megapascal");


                                    System.out.println("Select fromUnit :");

                                    System.out.println("1: Millimeter of water (mmH2O");
                                    System.out.println("2: Pounds/square foot (psf)");
                                    System.out.println("3: Kilogram force/square centimeter (kgf/cm^2)");
                                    System.out.println("4: Pounds/square inch (psi)");
                                    System.out.println("5: Millimeter of mercury (mmHg)");
                                    System.out.println("6: Bar");
                                    System.out.println("7: Inch of mercury (inHg)");
                                    System.out.println("8: millibar (mbar)");
                                    System.out.println("9: Hectopascal (hPa)");
                                    System.out.println("10: Standard atmosphere (atm)");
                                    System.out.println("11: Kilopascal (kPa)");
                                    System.out.println("12: Kilogram force/square meter (kgf/m^2)");
                                    System.out.println("13: Megapascal (MPa)");


                                    String fromUnit = pressureUnits.get(scan.nextInt());

                                    System.out.println("1: Millimeter of water (mmH2O");
                                    System.out.println("2: Pounds/square foot (psf)");
                                    System.out.println("3: Kilogram force/square centimeter (kgf/cm^2)");
                                    System.out.println("4: Pounds/square inch (psi)");
                                    System.out.println("5: Millimeter of mercury (mmHg)");
                                    System.out.println("6: Bar");
                                    System.out.println("7: Inch of mercury (inHg)");
                                    System.out.println("8: millibar (mbar)");
                                    System.out.println("9: Hectopascal (hPa)");
                                    System.out.println("10: Standard atmosphere (atm)");
                                    System.out.println("11: Kilopascal (kPa)");
                                    System.out.println("12: Kilogram force/square meter (kgf/m^2)");
                                    System.out.println("13: Megapascal (MPa)");

                                    String toUnit = pressureUnits.get(scan.nextInt());

                                    System.out.println("Amount you wish to convert");
                                    double amount = scan.nextFloat();
                                    double valueinBar = 0.0;
                                    double result = 0.0;


                                    switch (fromUnit) {
                                        case "Millimeter_of_water":
                                            valueinBar = amount / Millimeter_of_water;

                                            break;

                                        case "Pounds_per_square_foot":
                                            valueinBar = amount / Pounds_per_square_foot;

                                            break;

                                        case "Kilogram_force_per_square_centimeter":
                                            valueinBar = amount / Kilogram_force_per_square_centimeter;

                                            break;

                                        case "Pounds_per_square_inch":
                                            valueinBar = amount / Pounds_per_square_foot;
                                            break;

                                        case "Millimeter_of_mercury":
                                            valueinBar = amount / Millimeter_of_mercury;
                                            break;

                                        case "Bar":
                                            valueinBar = amount / Bar;
                                            break;

                                        case "Inch_of_mercury":
                                            valueinBar = amount / Inch_of_mercury;
                                            break;
                                        case "millibar":
                                            valueinBar = amount / millibar;
                                            break;
                                        case "Hectopascal":
                                            valueinBar = amount / Hectopascal;
                                            break;
                                        case "Standard_atmosphere":
                                            valueinBar = amount / Standard_atmosphere;
                                            break;
                                        case "Kilopascal":
                                            valueinBar = amount / Kilopascal;
                                            break;
                                        case "Kilogram_force_per_square_meter":
                                            valueinBar = amount / Kilogram_force_per_square_meter;
                                            break;
                                        case "Megapascal":
                                            valueinBar = amount / Megapascal;
                                            break;

                                    }

                                    switch (toUnit) {
                                        case "Millimeter_of_water":
                                            result = valueinBar * Millimeter_of_water;

                                            break;

                                        case "Pounds_per_square_foot":
                                            result = valueinBar * Pounds_per_square_foot;

                                            break;

                                        case "Kilogram_force_per_square_centimeter":
                                            result = valueinBar * Kilogram_force_per_square_centimeter;

                                            break;

                                        case "Pounds_per_square_inch":
                                            result = valueinBar * Pounds_per_square_foot;
                                            break;

                                        case "Millimeter_of_mercury":
                                            result = valueinBar * Millimeter_of_mercury;
                                            break;

                                        case "Bar":
                                            result = valueinBar * Bar;
                                            break;

                                        case "Inch_of_mercury":
                                            result = valueinBar * Inch_of_mercury;
                                            break;
                                        case "millibar":
                                            result = valueinBar * millibar;
                                            break;
                                        case "Hectopascal":
                                            result = valueinBar * Hectopascal;
                                            break;
                                        case "Standard_atmosphere":
                                            result = valueinBar * Standard_atmosphere;
                                            break;
                                        case "Kilopascal":
                                            result = valueinBar * Kilopascal;
                                            break;
                                        case "Kilogram_force_per_square_meter":
                                            result = valueinBar * Kilogram_force_per_square_meter;
                                            break;
                                        case "Megapascal":
                                            result = valueinBar * Megapascal;
                                            break;

                                    }

                                    System.out.println("Result : " + result);

                                    System.out.println("Do you want to Continue Y/N:");
                                    unityn = scanner.next();
                                } while (unityn.equals("Y") || unityn.equals("y"));

                                break;

                        }

                        System.out.println("Do you want to Continue Y/N:");
                        Unityn = scanner.next();
                    } while (Unityn.equals("Y") || Unityn.equals("y"));

                   break;

            }
            System.out.println("Do you want to Continue to main menu (Y/N):");
            allyn = scanner.next();
        } while (allyn.equals("Y") || allyn.equals("y"));
    }






    private static void sendHttpGetRequest(String fromCurrency_code, String toCurrency_code, double amount) throws IOException {

        DecimalFormat f = new DecimalFormat("00.00");
        String GET_URL  = "https://api.exchangeratesapi.io/latest?base=" + toCurrency_code +"&symbols" + fromCurrency_code;
        URL url = new URL(GET_URL);

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

        int responseCode = httpURLConnection.getResponseCode();


        if (responseCode == httpURLConnection.HTTP_OK){

            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer responce = new StringBuffer();

            while ((inputLine = in.readLine()) != null){
                responce.append(inputLine);
            }in.close();
            JSONObject obj = new JSONObject(responce.toString());
            Double exchangeRate = obj.getJSONObject("rates").getDouble(fromCurrency_code);
            System.out.println("Exchange Rate = " + exchangeRate);
            System.out.println();
            System.out.println(amount + "  " +fromCurrency_code + " = " + amount/exchangeRate + "  " +toCurrency_code);
        }
        else {
            System.out.println(" GET request failed ");
        }
    }


}
