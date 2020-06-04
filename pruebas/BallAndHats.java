package pruebas;


/* 
 //PRUEBA EN JS
 var getHat=function(a,b){   
    
    var n=a.indexOf("o"); 
	if(b==0) {return n;}
    var c = (n==1)?++b:b; 
    return c%2; 
};   

//test JS
getHat("0..",101);
 */

public class BallAndHats {

	public int getHat(String hats, int numSwaps) {
	    
	    int n = hats.indexOf('o');
	    
	    if(numSwaps == 0) return n;
	    
	    int c = (n==1)?++numSwaps:numSwaps;
	    
	    return c%2;
	}

}
