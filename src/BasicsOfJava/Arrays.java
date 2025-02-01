package BasicsOfJava;

public class Arrays {
    public static void main(String[] args){
        int [] marks = new int[5];//Initialisation of an array, index starts from 0

        marks[1]=5;
        marks[0]=53;
        marks[2]=15;
        marks[3]=54;

        System.out.println("Printing using naive method");
        System.out.println(marks[0]);

        int [] AnotherWayOfInitialisation = {3,5,6,2};
        System.out.println(AnotherWayOfInitialisation[1]);
// Same way van be made for other variables as well

        System.out.println("\n--------------------------------------------------");


        System.out.println("Array Length");
        System.out.println(AnotherWayOfInitialisation.length);

        System.out.println("\n--------------------------------------------------");


        System.out.println("Printing all elements using traversal method");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }


        System.out.println("\n--------------------------------------------------");



        System.out.println("Printing Reverse of an array");
        for(int a = marks.length -1; a>=0; --a){
            System.out.print(marks[a] + " ");
        }

        System.out.println("\n--------------------------------------------------");


        //Printing using for-each loop, when index doesn't matter
        System.out.println("Printing using for-each loop");
        for(int element : marks){
            System.out.print(element + " ");
        }




        System.out.println("\n--------------------------------------------------");
        System.out.println("Learning Multidimensional array");


        //MULTIDIMENSIONAL ARRAY (array of array)
        /* arr[0] --> [ 1 ] [ 2 ] [ 3 ] [ 4 ]
                        |
           arr[1] --> [ 5 ] [ 6 ] [ 7 ] [ 8 ]
                        |
           arr[2] --> [ 9 ] [ 10 ] [ 11 ] [ 12 ]

           Now to access 9 it would be array[0][0][0] = 9, first it gives 1, then 5 than 9
         */

        int [][] flats = new int [4][4]; //2D array
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[0][3]=104;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        flats[1][3]=204;
        flats[2][0]=301;
        flats[2][1]=302;
        flats[2][2]=303;
        flats[2][3]=304;
        flats[3][0]=401;
        flats[3][1]=402;
        flats[3][2]=403;
        flats[3][3]=404;

        for(int b=0; b<flats.length; b++){
            for(int c=0; c<flats.length; c++){
                System.out.print(flats[b][c] + " ");
            }
            System.out.println("\n.................");

        }
    }
}
