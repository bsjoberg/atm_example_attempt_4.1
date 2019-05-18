package nicebank;

public interface Teller {

	public void withdrawFrom(Account account, int dollars) throws InsufficientFundsException;

	public String notDispensedReason();
	
}
