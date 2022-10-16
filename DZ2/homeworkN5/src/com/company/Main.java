package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "сассс сацйуацу впвыпа сасцасцйк 1233-3123-5434-5435 фыацуаа богдан";
    String[] words = str.split("\\s+");
    String[] wordsContainA = new String[words.length];
    int maxLength = 0;
    int maxIndex = 0;

    for(int i = 0; i < words.length; i++){
        if(maxLength <= words[i].length()){
            maxLength = words[i].length();
            maxIndex = i;
        }
    }


    for (int i = 0; i < words.length; i++){
        int symbolCount = 0;
        for(int j = 0; j < words[i].length(); j++){
            if(words[i].charAt(j) == 'с'){
                symbolCount++;
            }
            if(symbolCount == 3){
                symbolCount -= 3; //не понимаю как без этого костыля(голова в огне)
                System.out.println(words[i]);
            }
        }
    }
        System.out.println("--------------------------------------------------------");

    for(int i = 0; i < words.length; i++){                            //задание 7
        char lastSymbol = words[i].charAt(words[i].length() - 1);
        if(lastSymbol == 'а'){
            System.out.println(words[i] + " ");
        }
    }
        System.out.println("--------------------------------------------------------");
    String searchWord = "богдан";                        //задание 9
    int searchWordID = str.indexOf(searchWord);
    if(searchWordID != -1){
        System.out.println("первый символ в искомом слове: " + searchWord.charAt(0));
    } else {System.out.println("искомого слова нет в строке(");}

        System.out.println("--------------------------------------------------------");
        System.out.println("самое большое слово: " + words[maxIndex]); //задание 6
    }
}
