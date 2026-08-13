public class ScholarshipDistribution {
    static int totalStudents(int n,int budget,int[] req){
        java.util.Arrays.sort(req);
        int students=0,currBudget=0;
        for(int sch: req){
            if(currBudget+sch<=budget){
                currBudget+=sch;
                students++;
            }
            else break;
        }
        return students;
    }

    static void main() {
        int[] req = {3,5,7,2}; // 2,3,5,7
        System.out.println(totalStudents(4,10,req));
    }
}
