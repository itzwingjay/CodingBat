
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



