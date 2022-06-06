class Alphabet {
    public static void main(String[] args) {
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) //can count alphabet
        {
            System.out.print(c);
        }
        System.out.println();
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);//int gets char value here by type-casting
        }
        System.out.println();

    }

}