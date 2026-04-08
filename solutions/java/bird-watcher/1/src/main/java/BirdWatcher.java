
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        int TODAY = birdsPerDay[birdsPerDay.length - 1];
        return TODAY;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        int TODAY = birdsPerDay[birdsPerDay.length - 1]++;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for (int day: birdsPerDay){
            if (day == 0){
                return true;
            }
        }
        return false;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        
        int birds_that_visited = 0;
        
        if (numberOfDays <= birdsPerDay.length - 1){      
            for (int i = 0; i < numberOfDays; i++){
                birds_that_visited += birdsPerDay[i];
            }
            return birds_that_visited;
        }else{
            for (int i = 0; i < birdsPerDay.length ; i++){
                birds_that_visited += birdsPerDay[i];
            }
            return birds_that_visited;

        }
        
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
            int busyDays = 0;
            for (int i = 0; i < birdsPerDay.length ; i++){
                if (birdsPerDay[i]>=5){
                busyDays++;    
                }
            }
        
            return busyDays;

        }
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    
}
