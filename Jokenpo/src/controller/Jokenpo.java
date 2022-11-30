package controller;

public class Jokenpo {
	
	public static String JKP(int a , int b){
        switch(a){
            case 1:
                a = 0;
                if(b == 1){
                b = 0;
                }else if(b == 2){
                b = 1;
                }else{
                b = -1;
                }
                break;
            case 2:
                    a = 0;
                if(b == 1){
                b = -1;
                }else if(b == 2){
                b = 0;
                }else{
                b = 1;
                }
                break;
            case 3:
                    a = 0;
                if(b == 1){
                b = 1;
                }else if(b == 2){
                b = -1;
                }else{
                b = 0;
                }
                break;
        }
        String res;
        if( a == b){
        res = "Empate";
        }else if(a > b){
        res = "vencedor";
        }else{
        res ="Perdedor";
        }
        
        return res;

    }
	
	public static String Ppt(int num) {
			
		String res = switch(num) {
		case 1 -> "Pedra";
		case 2 -> "papel";
		case 3 -> "Tesoura";
		default -> throw new IllegalArgumentException("Unexpected value: " + num);
		};
		
		return res;
		}

}
