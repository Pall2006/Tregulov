package kataAcademy;
import kataAcademy.MyException;

import java.util.Scanner;

class Roman {
   static String[] values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "+", "-", "/", "*"};
    static int countRoman = 0;
    static int countArabian = 0;
    static  int roman1 = 0;
    static  int roman2 = 0;
    static  int arabian1 = 0;
    static   int arabian2 = 0;
    static  int result = 0;
    static    String resultTotal;
    static   String resultRoman = " ";
    public static String calc(String st) {

        try {
            if (st.length() == 0) {
                throw new MyException();
            }
            String[] array = st.split(" ");
            if (array.length != 3)
                throw new MyException();
            String firstValue = array[0].toUpperCase();
            String operation = array[1];
            String secondValue = array[2].toUpperCase();
            switch (firstValue) {
                case "I":
                    countRoman += 1;
                    roman1 = 1;
                    break;
                case "II":
                    countRoman += 1;
                    roman1 = 2;
                    break;
                case "III":
                    countRoman += 1;
                    roman1 = 3;
                    break;
                case "IV":
                    countRoman += 1;
                    roman1 = 4;
                    break;
                case "V":
                    countRoman += 1;
                    roman1 = 5;
                    break;
                case "VI":
                    countRoman += 1;
                    roman1 = 6;
                    break;
                case "VII":
                    countRoman += 1;
                    roman1 = 7;
                    break;
                case "VIII":
                    countRoman += 1;
                    roman1 = 8;
                    break;
                case "IX":
                    countRoman += 1;
                    roman1 = 9;
                    break;
                case "X":
                    countRoman += 1;
                    roman1 = 10;
                    break;
                case "1":
                    countArabian += 1;
                    arabian1 = 1;
                    break;
                case "2":
                    countArabian += 1;
                    arabian1 = 2;
                    break;
                case "3":
                    countArabian += 1;
                    arabian1 = 3;
                    break;
                case "4":
                    countArabian += 1;
                    arabian1 = 4;
                    break;
                case "5":
                    countArabian += 1;
                    arabian1 = 5;
                    break;
                case "6":
                    countArabian += 1;
                    arabian1 = 6;
                    break;
                case "7":
                    countArabian += 1;
                    arabian1 = 7;
                    break;
                case "8":
                    countArabian += 1;
                    arabian1 = 8;
                    break;
                case "9":
                    countArabian += 1;
                    arabian1 = 9;
                    break;
                case "10":
                    countArabian += 1;
                    arabian1 = 10;
                    break;
                default:
                    throw new MyException();

            }
            switch (secondValue) {
                case "I":
                    countRoman += 1;
                    roman2 = 1;
                    break;
                case "II":
                    countRoman += 1;
                    roman2 = 2;
                    break;
                case "III":
                    countRoman += 1;
                    roman2 = 3;
                    break;
                case "IV":
                    countRoman += 1;
                    roman2 = 4;
                    break;
                case "V":
                    countRoman += 1;
                    roman2 = 5;
                    break;
                case "VI":
                    countRoman += 1;
                    roman2 = 6;
                    break;
                case "VII":
                    countRoman += 1;
                    roman2 = 7;
                    break;
                case "VIII":
                    countRoman += 1;
                    roman2 = 8;
                    break;
                case "IX":
                    countRoman += 1;
                    roman2 = 9;
                    break;
                case "X":
                    countRoman += 1;
                    roman2 = 10;
                    break;
                case "1":
                    countArabian += 1;
                    arabian2 = 1;
                    break;
                case "2":
                    countArabian += 1;
                    arabian2 = 2;
                    break;
                case "3":
                    countArabian += 1;
                    arabian2 = 3;
                    break;
                case "4":
                    countArabian += 1;
                    arabian2 = 4;
                    break;
                case "5":
                    countArabian += 1;
                    arabian2 = 5;
                    break;
                case "6":
                    countArabian += 1;
                    arabian2 = 6;
                    break;
                case "7":
                    countArabian += 1;
                    arabian2 = 7;
                    break;
                case "8":
                    countArabian += 1;
                    arabian2 = 8;
                    break;
                case "9":
                    countArabian += 1;
                    arabian2 = 9;
                    break;
                case "10":
                    countArabian += 1;
                    arabian2 = 10;
                    break;
                default:
                    throw new MyException();

            }
            if (countArabian == 2) {
                switch (operation) {
                    case "+":
                        result = arabian1 + arabian2;
                        break;
                    case "-":
                        result = arabian1 - arabian2;
                        break;
                    case "*":
                        result = arabian1 * arabian2;
                        break;
                    case "/":
                        result = arabian1 / arabian2;
                        break;
                    default:
                        throw new MyException();
                }

            } else if (countRoman == 2) {
                switch (operation) {
                    case "+":
                        result = roman1 + roman2;
                        break;
                    case "-":
                        result = roman1 - roman2;
                        break;
                    case "*":
                        result = roman1 * roman2;
                        break;
                    case "/":
                        result = roman1 / roman2;
                        break;
                    default:
                        throw new MyException();
                }
                if (result >= 1) {
                    switch (result) {
                        case 1:
                            resultTotal = "I";
                            break;
                        case 2:
                            resultTotal = "II";
                            break;
                        case 3:
                            resultTotal = "III";
                            break;
                        case 4:
                            resultTotal = "IV";
                            break;
                        case 5:
                            resultTotal = "V";
                            break;
                        case 6:
                            resultTotal = "VI";
                            break;
                        case 7:
                            resultTotal = "VII";
                            break;
                        case 8:
                            resultTotal = "VIII";
                            break;
                        case 9:
                            resultTotal = "IX";
                            break;
                        case 10:
                            resultTotal = "X";
                            break;
                        case 11:
                            resultTotal = "XI";
                            break;
                        case 12:
                            resultTotal = "XII";
                            break;
                        case 13:
                            resultTotal = "XIII";
                            break;
                        case 14:
                            resultRoman = "XIV";
                            break;
                        case 15:
                            resultTotal = "XV";
                            break;
                        case 16:
                            resultTotal = "XVI";
                            break;
                        case 17:
                            resultTotal = "XVII";
                            break;
                        case 18:
                            resultTotal = "XVIII";
                            break;
                        case 19:
                            resultTotal = "XIX";
                            break;
                        case 20:
                            resultTotal = "XX";
                            break;
                        case 21:
                            resultTotal = "XXI";
                            break;
                        case 24:
                            resultTotal = "XXIV";
                            break;
                        case 25:
                            resultTotal = "XXV";
                            break;
                        case 27:
                            resultTotal = "XXVII";
                            break;
                        case 28:
                            resultTotal = "XXVIII";
                            break;
                        case 30:
                            resultTotal = "XXX";
                            break;
                        case 32:
                            resultTotal = "XXXII";
                            break;
                        case 35:
                            resultTotal = "XXXV";
                            break;
                        case 36:
                            resultTotal = "XXXVI";
                            break;
                        case 40:
                            resultTotal = "XL";
                            break;
                        case 42:
                            resultTotal = "XLII";
                            break;
                        case 45:
                            resultTotal = "XLV";
                            break;
                        case 48:
                            resultTotal = "XLVIII";
                            break;
                        case 49:
                            resultTotal = "XLIX";
                            break;
                        case 50:
                            resultTotal = "L";
                            break;
                        case 54:
                            resultTotal = "LIV";
                            break;
                        case 56:
                            resultTotal = "LVI";
                            break;
                        case 60:
                            resultTotal = "LX";
                            break;
                        case 63:
                            resultTotal = "LXIII";
                            break;
                        case 64:
                            resultTotal = "LXIV";
                            break;
                        case 70:
                            resultTotal = "LXX";
                            break;
                        case 72:
                            resultTotal = "LXXII";
                            break;
                        case 80:
                            resultTotal = "LXXX";
                            break;
                        case 81:
                            resultTotal = "LXXXI";
                            break;
                        case 90:
                            resultTotal = "XC";
                            break;
                        case 100:
                            resultTotal = "C";
                            break;
                    }
                } else {
                    throw new MyException();
                }
            } else {
                throw new MyException();
            }
            if (countArabian == 2) {
                resultTotal = String.valueOf(result);

            } else {
                System.out.println("Правильный ответ = " + resultRoman);
            }


        } catch (MyException e) {
            System.out.println("Вы ввели не правильное математическое выражение");
        }
        return resultTotal;
    }
}