
import java.util.Arrays;

public class swift {







        public static Boolean isPalindrome(String text){

            String[] x;;
            x=text.split("(?!^)");
            System.out.println(Arrays.toString(x));


            int arrLength=x.length;


            for(int i=1; i<arrLength;i++) {


                if (x[i-1].equals(x[arrLength-i])) {

                    continue;

                }
                else {
                    return false;
                }

            }

            return true;






        }


        public static int minSplit(int amount) {
            int raodenoba=amount;
            int temp=0;
            int a=raodenoba/ 50;



            temp= raodenoba % 50;

            int b= temp /20 ;

            temp= temp % 20;

            int c = temp /10;

            temp= temp % 10;

            int d = temp /5;


            return a+b+c+d;






        }


        public static int notContains(int[] array) {

            int[] x= array;
            int arrLength=x.length;
            int minDadebiti=0;

            Arrays.sort(x);


            // 1: davalagot masivi, movchrat masividan dadebiti ricxvebis mxare ,3: gavaketot axali masivi naturaluri ricxvebit, 4: vnaxot mochrili masivis pirveli wevri ertze meti xoaraa  5: shevadarot axali masivi originals da pirvelive gansxvavebuli wevri axali masividan iqneba pasuxi


            //1:
            for(int i=0; i<arrLength;i++) {

                if ( x[i]>0) {

                    minDadebiti=i;

                    break;


                }
                else {

                    continue;
                }


            }

            int[] positiveMassive= Arrays.copyOfRange(x, minDadebiti, arrLength);




            //3:
            int[] newMassive = new int[arrLength-minDadebiti];
            int newMassiveLength=newMassive.length;

            for (int i = 1; i < newMassiveLength+1; ++i) {
                newMassive[i-1] = i;
            }

            //System.out.println(Arrays.toString(newMassive));



            //4:
            if (positiveMassive[0]>1) {

                return 1;
            }

            //5:

            for(int i=0; i<newMassiveLength;i++) {

                if ( positiveMassive[i]==newMassive[i]) {

                    continue;
                }
                else {

                    return newMassive[i];
                }

            }






            return 0;




        }

        public static int countVariants(int stairsCount) {

            int num= stairsCount;


            if(num==1 || num ==0) {
                return 1;
            }
            else {
                return countVariants(num-1)+countVariants(num-2);
            }



        }

        public static Boolean isProperly(String sequence){

            int firstCount=0;
            int lastCount=0;


            //პირველივე სიმბოლო ხხომ არაა არასწორი
            if (sequence.substring(0, 1).equals(")")){

                return false;
            }

//  დავთვალოთ "(" და ")" შეხვედრის რაოდენობა. თუ ")" სიმბოლო მეტია რომელიღაც მონაკვეთზე, მათემატიკურად არასწორია. სწორია თუ ეს პირობა სრულდება და ბოლოს სიმბოლოების რაოდენობა ტოლია
            for(int i=1 ; i<sequence.length()+1;i++) {

                if (sequence.substring(i-1, i).equals("(")){

                    firstCount++;


                }
                if (sequence.substring(i-1, i).equals(")")){

                    lastCount++;

                }


                if (lastCount>firstCount) {

                    return false;
                }


            }

            if (firstCount==lastCount) {

                return true;
            }


            return false;



        }
















        public static void main(String[] args) {


            //თითო ხაზი თითო დავალების გაშვებისთვისაა


            //  System.out.println(isPalindrome("racecar"));
            //  System.out.println(minSplit(65));

            //	int[] tmp= {-5,10,-10,15,1,2,3,4,5,6,7};   		System.out.println(notContains(tmp));

//		System.out.println(countVariants(4));
            System.out.println(isProperly(")))((("));























        }
    }














