import java.util.Scanner;

public class Transaction {



    public static void main(String[]args){
        while(true) {
            Scanner select = new Scanner(System.in);
            int DialCode;
            String Menu =("Menu \n" +
                    "1.Transfer money \n" +
                    "2.MoMoPay & PayBill \n" +
                    "3.Airtime & Bundle \n" +
                    "4.Allow Cash out \n" +
                    "5.Financial Services \n" +
                    "6.My Wallet");
            String TransferMoney = "TransferMoney \n" +
                    "1. Momo User \n"+
                    "2. Non Momo User \n"+
                    "3.Send with care\n"+
                    "4.Favorite \n"+
                    "5.Other Network \n"+
                    "6.Bank Account \n"+
                    "0. Back ";

            System.out.println("Dial your transaction code $(*170#)");
            DialCode = select.nextInt();
            if (DialCode == 170) {
                System.out.println(Menu);

                System.out.println("Select to continue process :");
                int reply = select.nextInt();
                if (reply == 1){
                    System.out.println(TransferMoney);
                } else if (reply == 2) {
                    System.out.println("1.Momo Pay \n"+
                            "2. Pay Bill \n"+
                            "3.GhQR\n"+
                            "4.Fuels \n"+
                            "5.Ghana.Gov \n"+
                            "0. Back ");

                } else if (reply == 3) {
                    System.out.println("Airtime & Bundles" +
                            "1. Airtime\n"+
                            "2.Internet Bundles \n"+
                            "3.Fixed Broadband\n"+
                            "4.Schedule Airtime\n"+
                            "5.Just4U\n"+
                            "0. Back ");
                } else if (reply == 4) {
                    System.out.println(" Allow Cash Out \n"+
                            "1.Yes\n"+
                            "2. No\n"+
                            "0. Back ");
                } else if (reply == 5) {
                    System.out.println("Financial Services\n"+
                            "1. Bank Services\n"+
                            "2.Savings \n"+
                            "3.Loans\n"+
                            "4.Pensions and Investments\n"+
                            "5.Insurance\n"+
                            "6. Trade Shares\n"+
                            "0. Back ");
                } else if (reply == 6) {
                    System.out.println("My Wallet\n"+
                            "1. Check Balance \n"+
                            "2.Allow Cash Out \n"+
                            "3.My Approvals\n"+
                            "4.Report Frauds\n"+
                            "5.Statements\n"+
                            "6. Change&Reset Pin\n"+
                            "#. for Next ");
                }else if(reply== 0){
                    System.out.println(Menu);
                }else {
                    System.out.println("Can not retrieve");
                }

            }
         break;
        }

        
    }
}