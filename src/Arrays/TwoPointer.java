package Arrays;

public class TwoPointer {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return result.toString().trim();
    }

    public String reverseWords2(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == ' ' || j == arr.length - 1){
                reverse(arr, i, (j == arr.length - 1) ? j : j - 1);
                i = j + 1;
            }
        }
        return new String(arr);
    }

    public char[] reverse(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }



}