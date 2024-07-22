public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        int[] Heights = heights;
        String[] Names = names;
        boolean swapper;
        int temp;
        String tempname;
        do {
            swapper = false;
            for (int a = 0; a < Heights.length-1; a++) { // change a > Height.lenght-1 for descending order
                if (Heights[a] > Heights[a + 1]) {
                    temp = Heights[a];
                    Heights[a] = Heights[a + 1];
                    Heights[a + 1] = temp;
                    tempname = Names[a];
                    Names[a] = Names[a + 1];
                    Names[a + 1] = tempname;
                    swapper = true;
                }

            }
        } while (swapper);

        return Names; 
    }

    public static void main(String[] args){
             SortThePeople s = new SortThePeople();
             String[] names ={"Mary","John","Emma"};
             int[] heights ={180,165,170};
             String[] sorted=s.sortPeople(names,heights);
             int sortedlength=sorted.length;
for(int a=sortedlength-1;a>=0;a--){
    System.out.println(sorted[a]);
}
             
           
        
    }
}