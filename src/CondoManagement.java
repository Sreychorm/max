import java.util.Scanner;

public class CondoManagement {
    public static void main(String[] args) {
        int opt,floor=0,room=0,searchfloor=0;
        int choice = 0;
        String ownerName;
        String condo[][]=new String[][]{};
        boolean isCondition = false;

        Scanner input = new Scanner(System.in);
        //input floor & Room
        do {
            System.out.println("-----------Set up Condo-------------");
            System.out.print("input floor : ");
            floor = input.nextInt();
            if (floor > 0) {
                System.out.print("input room: ");
                room = input.nextInt();
                if (room > 0) {
                    isCondition=true;
                    condo = new String[floor][room];
                    System.out.println("Successfully Set up Condo ");
                    System.out.println("Total Floor: " + floor + " Floor" + ((floor >= 2) ? "s" : ""));
                    System.out.println("Total Room: " + room + " Room" + ((room >= 2) ? "s" : ""));
                    System.out.println("Total Condo: " + (floor * room));
                } else System.out.println("Room Number Cannot be Zero or Negative");
            } else System.out.println("Floor Number Cannot be Zero or Negative");
            System.out.println("--------------------------------------------");
        }while (!isCondition);

        // Select Option
                do {
                    System.out.println("1. Buy Condo");
                    System.out.println("2. Sell Condo");
                    System.out.println("3. Search Condo");
                    System.out.println("4. Display Information");
                    System.out.println("5. Exit");
                    System.out.print("Pls Select Option below from (1-6) ->");
                    opt = input.nextInt();
                    switch (opt){
                        case 1:
                            System.out.println("--------Buying Condo---------");
                            System.out.print("Choose Floor: ");
                            int selectFloor = input.nextInt();
                            if (selectFloor>0 && selectFloor<=floor){
                                System.out.print("Choose Room: ");
                                int selectRoom = input.nextInt();
                                if (selectRoom>0 && selectRoom<=room){
                                    if((condo[selectFloor-1][selectRoom-1])!=null){
                                        System.out.println("The Condo is not Available.....!");
                                    }else {
                                        System.out.print("Enter Owner: ");
                                        String owner = input.next();
                                        condo[selectFloor-1][selectRoom-1]= owner;
                                    }
                                }else System.out.print("Floor room for 1 -"+ room);
                            } else System.out.println("Floor number for 1 -"+ floor);
                            System.out.println(" Press \"Enter\" to continue..... ");
                            Scanner enter1 = new Scanner(System.in);
                            enter1.nextLine();
                            break;
                        case 2:
                            System.out.println("--------Sell Condo---------");
                            System.out.print("Choose Floor: ");
                            int sellFloor = input.nextInt();
                            System.out.print("Choose Floor: ");
                            int sellRoom = input.nextInt();
                            if((condo[sellFloor-1][sellRoom-1])==null){
                                System.out.println("No Owner Yet!");
                            }else {
                                System.out.println("Owner: "+ condo[sellFloor-1][sellRoom-1]);
                                System.out.print("Press 1 to sell // Press 0 to cancel");
                                choice=input.nextInt();
                                if(choice==1) {
                                    condo[sellFloor - 1][sellRoom - 1] = null;
                                    System.out.println("Condo is Sold");
                                }else System.out.println("in considering to sell");
                            }
                            System.out.println(" Press \"Enter\" to continue..... ");
                            Scanner enter2 = new Scanner(System.in);
                            enter2.nextLine();
                            break;
                        case 3:
                            int inneropt;
                            do{
                                System.out.println("--------------Search Condo--------------");
                                System.out.println("1. Search by Name");
                                System.out.println("2. Search by Floor");
                                System.out.println("3. Exit");
                                System.out.print("Select your option: ");
                                inneropt=input.nextInt();
                                switch (inneropt){
                                    case 1:
                                        System.out.println("--------->Search By name");
                                        System.out.print("input Owner Name: ");
                                        ownerName = input.next();
                                        boolean isName=false;
                                        for (int i=1; i<=condo.length; i++){
                                            for (int j=1; j<=condo[i-1].length; j++){
                                                if (condo[i-1][j-1]!=null){
                                                    if (condo[i-1][j-1].equals(ownerName)){


                                                        isName=true;
                                                        System.out.println("The room belong to "+ ownerName+ " is at floor "+ i +" room "+j );
                                                    }
                                                }

                                            }
                                        }
                                        if(!isName)System.out.println(ownerName+" Have No Condo Yet");

                                        break;
                                    case 2:
                                        System.out.println("--------->Search By Floor");
                                        System.out.print("input Floor number: ");
                                        searchfloor=input.nextInt();
                                        System.out.print("Floor "+searchfloor+":");
                                        for (int j=0; j<condo[searchfloor-1].length; j++){
                                            System.out.print(" "+condo[searchfloor-1][j]);
                                        }
                                        System.out.println("");
                                        break;
                                    default:
                                }
                            }while (inneropt!=3);
                            System.out.println(" Press \"Enter\" to continue..... ");
                            Scanner enter3 = new Scanner(System.in);
                            enter3.nextLine();
                            break;
                        case 4:
                            System.out.println("-----------Condo Information---------------");
                            for(int i=0; i<condo.length;i++){
                                System.out.print("Floor "+(i+1)+": ");
                                for(int j=0;j<condo[i].length;j++){
                                    System.out.print(" "+condo[i][j]);
                                }
                                System.out.println();
                            }
                            System.out.println(" Press \"Enter\" to continue..... ");
                            Scanner enter4 = new Scanner(System.in);
                            enter4.nextLine();
                            break;
                        default:
                    }
                } while (opt != 5);

    }
}
