class StringPlayer {
    public static void main(String[] args) {

// reverse("canobalisit");
        var str = "honalulu";
        System.out.println(str.indexOf('u',2));
        System.out.println(str.substring(4));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(0));
    }

//    public static String reverse(String s) {
//        String r = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            r += s.charAt(i);
//        }
//        System.out.printf(r,'\n');
//        return r;
//    }

    protected String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        System.out.printf(r,'\n');
        return r;
    }


}