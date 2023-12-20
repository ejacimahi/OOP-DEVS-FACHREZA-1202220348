public class Bioskop {
   int baris = 5;
   int kolom = 10;
   int[][] ini_array = new int[baris][kolom];

    for(int b=0; b<baris; b++){
        for (int k=0; k< kolom; k++ ){
            System.out.println(ini_array[b][k] + " ");
        }
        System.out.println();
    }
}



    // TO DO: Create Private Attributes of rows and assign rows to 5
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    
    // TO DO: Create 2 dimensional array to store seat reservation status
 