
//Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
public boolean scoresIncreasing(int[] scores) {
  boolean order = true;
  for(int i=0; i < scores.length-1; i++){
    if(scores[i]>scores[i+1]){
      order = false;
    }
  }
  return order;
}



//Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
public boolean scores100(int[] scores) {
  int check = 100;
  boolean together = false;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]==scores[i+1] && scores[i] == check){
      together = true;
    }
  }
  return together;
}


//Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
public boolean scoresClump(int[] scores) {
  int diff = 2;
  boolean most2 = false;
  for(int i=0;i<scores.length-2;i++){
    if(scores[i+1]-scores[i] <= 2 && scores[i+2]-scores[i+1] <=2 && scores[i+2]-scores[i] <= 2){
      most2 = true;
    }
  }
  return most2;
}


/*Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method 
int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.*/

public int scoresAverage(int[] scores) {
  int firstHalf = average(scores, 0, scores.length/2 - 1);
  
  int secondHalf = average(scores, scores.length/2, scores.length-1);

  if (firstHalf > secondHalf){
    return firstHalf;
  }else{
    return secondHalf;
  }
  
}

public int average(int[] scores, int start, int end){
  int sum = 0;
  int count = 0;
  for(int i = start; i <= end ; i++){
    sum += scores[i];
    count++;
  }
  return sum/count;
  
}


//Given an array of strings, return the count of the number of strings with the given length.

public int wordsCount(String[] words, int len) {
  int count = 0;
  for(int i = 0; i <= words.length-1; i++){
    if(words[i].length() == len){
      count++;
    }
  }
  return count;
}


//Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

public String[] wordsFront(String[] words, int n) {
  String[] list = new String[n];
  for(int i = 0; i < n ; i++){
    list[i] = words[i];
  }
  return list;
}



//Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> omit = new ArrayList<String>();
  
  for(int i = 0; i < words.length ; i++){
    if(words[i].length() != len){
      omit.add(words[i]);
    }
  }
  return omit;
}


//Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

public boolean hasOne(int n) {

while (n != 0){
  if(n % 10 == 1){
    return true;
  }
  n /= 10;
}
return false;

}


//We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.



