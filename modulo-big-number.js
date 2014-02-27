/*:
	@include:
		{
			"work": "work"
		}
	@end-include
*/
moduloBigNumber = function moduloBigNumber( dividend, divisor, callback ){
	/*:
		@meta-configuration:
			{
				"numbers": "string|number..."
			}
		@end-meta-configuration
	*/
	work( "javac moduloBigNumber.java && java moduloBigNumber " + numbers.join( " " ), callback );
};