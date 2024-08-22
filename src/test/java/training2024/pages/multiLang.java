package training2024.pages;


public class multiLang {

    public static void main(String[] args) {

        MultiValueHashMap<String, Integer> map = new MultiValueHashMap<>();
        map.put("key1", 10);
        System.out.println(map.get("key1"));
        
    }

}
