public class TestingBreak {
    public static void main(String[] args){

        // print even number
//        for (int i=1;i<=10;i++){
//            if (i%2==1) continue;
//            System.out.println(i);
//        }

        //break label
//        int count=0;
//        start:{
//            for (int i=0;i<=10;i++){
//                for (int j=0;j<=10;j++){
//                    if(i==5) break start;
//                }
//                count++;
//            }
//        }
//        System.out.println(count);

        String[] listname= {"chorm", "null", "me"};
        for (int i=0; i<listname.length; i++){
            if(listname[i].equals("null")) continue;
            System.out.println(listname[i]);
        }

        // label continue
//        start:{
//            for (int i=0; i<5; i++){
//                System.out.println("-----------------------");
//                for(int j=0;j<10;j++){
//                    System.out.println("#");
//                    if(j>=i) continue start;
//                }
//                System.out.println("end");
//            }
//        }


        skip:
            for (int i=0; i<=5; i++){
                for(int j=0;j<=5;j++){
                    if(i==3) continue skip;
                    System.out.println("J value is "+ j);
                }
                System.out.println("--------------------------");
                System.out.println("I value is: " +i);
            }

    }
}
