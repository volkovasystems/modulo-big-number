import java.math.BigInteger;
public class moduloBigNumber{
	public static void main( String... numbers ){
		try{
			BigInteger dividend = new BigInteger( numbers[ 0 ] );
			BigInteger divisor = new BigInteger( numbers[ 1 ] );
			BigInteger number = dividend.mod( divisor );			
			System.out.print( number.toString( ) );
		}catch( Exception exception ){
			System.err.print( exception.getMessage( ) );
		}
	}
}