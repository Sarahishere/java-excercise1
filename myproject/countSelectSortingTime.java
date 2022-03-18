class countSelectSortingTime {
   
    public static void main(String[]args){
       int [] randomNumArray = randomNumArray(100000); // generate random array
       StopWatch watch = new StopWatch(); // create stopwatch object
       watch.setStartT();//get start time
       sortNumber(randomNumArray);//sort the array
       watch.setEndT();//get end time
       long timeSpent = watch.getElapsedTime();// get the elapsed time
        System.out.println("The time spent to sort 100000 numbers are "
        + timeSpent + " milliseconds !");
   }
    
   //generate 100,000 random integer and store the values in array
   static int[] randomNumArray( int num){
      int[] ranArray = new int[num];  
      for(int i = 0; i< ranArray.length;i++){
          ranArray[i] = (int)(Math.random()*(num));
      } 
      return ranArray;
    }
    
    //selection sort the elements 
    static int[] sortNumber( int[] numArray){
        for(int i = 0; i < numArray.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < numArray.length; j++){
                if(numArray[minIndex] < numArray[j]){
                    minIndex = j; 
                    //swap the two elements
                    int temp = numArray[i];
                    numArray[i] = numArray[minIndex];
                    numArray[j] = temp;
                }
            }
        
        }
        
        return numArray;
        
    } 
    
    
    
    
}
