class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i=0;
        int note1=0;
        int note2=0;
        int note3=0;
        while(i<bills.length){
                if(bills[i]==5){
                    note1+=5;
                }
                else if(bills[i]==10){
                    if(note1>=5){
                        note2+=10;
                        note1-=5;
                    }
                    else{
                        break;
                    }
                }
                else if(bills[i]==20){
                   if(note1!=0 && note2!=0){
                     if(note1+note2>=15){
                        note3+=20;
                        note2-=10;
                        note1-=5;
                    }
                    else{
                        break;
                    }
                   }
                   else if(note1>=15){
                        note3+=20;
                        note1-=15;
                    }
                   else{
                    break;
                   }
                }
                i++;
        }
        if(i==bills.length){
            return true;
        }
        return false;
    }
        
  }

