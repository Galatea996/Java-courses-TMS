package HomeWork6.Task3;

public class DisBankomat {
    Nam20 num20;
    Nam50 num50;
    Nam100 num100;



    public DisBankomat(){
        num20 = new Nam20();
        num50 = new Nam50();
        num100 = new Nam100();
    }
    int addingMoney(){
        num20.put20();
        num50.put50();
        num100.put100();
        int sum = num20.sum20 + num50.sum50 + num100.sum100;
        System.out.println("Добавлено в АТМ: " + sum);
        return sum;
    }

   public boolean isWithdrawMoney(int sum, int howMuchToWithdraw){
        if(sum > howMuchToWithdraw){
            return true;
        }else {
            return false;
        }
   }
   public int withdrawMoney(boolean isWithdrawMoney,  int sum, int howMuchToWithdraw) {
       if (isWithdrawMoney == true) {
           sum = sum - howMuchToWithdraw;
           return sum;
       } else {
           return sum;
       }
   }
}


