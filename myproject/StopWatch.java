/*
 * Design a test program that measures the execution time of 
 *  sorting 100,000 random numbers using selection sort.
 */

class StopWatch{
    private long startTime;
    private long endTime;
    
    //no-arg constructor
    StopWatch(){
        startTime = System.currentTimeMillis();
    }
   
    // setter and getters
    void setStartT(){
       startTime = System.currentTimeMillis();
    }
    
    void setEndT(){
        endTime = System.currentTimeMillis();
    }
    
    long getStartT(){
        return startTime;
    }
    
    long getEndT(){
        return endTime;
    } 
    //get elapsed time
    long getElapsedTime(){
        return getEndT() - getStartT();
    }
}
