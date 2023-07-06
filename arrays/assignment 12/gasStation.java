public class gasStation {
    public static int canCommpleteCircuit(int []gas,int []cost){
        int travelCost = 0;
        int deficientCost = 0;
        int startingPoint=-1;
        for(int i = 0;i < gas.length;i++){
            travelCost += gas[i]-cost[i];
            if(travelCost<0){
                deficientCost += travelCost;
                travelCost = 0;
                startingPoint = -1;
            }else if(startingPoint==-1){
                startingPoint = i;
            }
        }
        if(travelCost+deficientCost>=0){
            return startingPoint;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []gas= {5,1,2,3,4};
        int []cost= {4,4,1,5,1};
        System.out.println(canCommpleteCircuit(gas, cost));
    }
}
