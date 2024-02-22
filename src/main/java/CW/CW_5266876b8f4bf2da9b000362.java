package CW;

public class CW_5266876b8f4bf2da9b000362 {
    public static String whoLikesIt(String... names) {
        if (names.length == 0) return "no one likes this";
        if (names.length == 1) return names[0] + " likes this";
        String result="";
        for (String el : names){
            if (el.equals(names[names.length-1])){
                result = result.substring(0, result.length() - 2) + " and " + el + " like this";
                break;
            }
            if (names.length>=4 && names[2].equals(el)){
                result =  result.substring(0, result.length() - 2) + " and " + (names.length - 2) + " others like this";
                break;
            }
            System.out.println(result);
            result += el + ", ";

        }
//        switch (names.length) {
//            case 0: return "no one likes this";
//            case 1: return String.format("%s likes this", names[0]);
//            case 2: return String.format("%s and %s like this", names[0], names[1]);
//            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
//            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));

    }
}
