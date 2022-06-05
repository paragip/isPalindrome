public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234543211));
    }

    public static boolean isPalindrome(int number){
// új változókat vezetek be:
        int originalNumber = number;
        int reverseNumber = 0;
        int lastDigit;

        while(number != 0) { // amíg az eredeti szám el nem fogy number/10 műveletek ismétlődése során
            lastDigit = number % 10; // kiszedni az utolsó számjegyet
            reverseNumber *= 10; // a megfordított számot szorozni 10-zel
            reverseNumber += lastDigit; // a megfordított számot bővíteni a fenti utolsó számjeggyel
            number /= 10; // az eredeti számot osztani 10-zel, hogy a kiszedett utolsó számjegy eltűnjön
        }

        if (reverseNumber == originalNumber) { // a megfordított és az eredeti szám összehasonlítása
            return true;
            } else {
            return false;
        }

    }
}
