package demo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service("bankService")
public class BankServiceImpl implements BankService {

	// Can use property setter DI:
	@Autowired
	private BankRepository repository;

	// Or can use constructor DI:
    /*
    private BankRepository repository;

    @Autowired
    public BankServiceImpl(BankRepository repository) {
        this.repository = repository;
    }
	*/

	
    @Override
	public void depositIntoAccount(int accountId, double amount) {
		System.out.printf("In BankServiceImpl.depositIntoAccount(%d, %.2f)\n", accountId, amount);
		repository.doDeposit(accountId, amount);
	}

	@Override
	public void withdrawFromAccount(int accountId, double amount) {
		System.out.printf("In BankServiceImpl.withdrawFromAccount(%d, %.2f)\n", accountId, amount);
		repository.doWithdraw(accountId, amount);
	}

	@Override
	public void transferFunds(int fromAccountId, int toAccountId, double amount) {
		System.out.printf("In BankServiceImpl.transferFunds(%d, %d, %.2f)\n", fromAccountId, toAccountId, amount);
		repository.doWithdraw(fromAccountId, amount);
		repository.doDeposit(toAccountId, amount);
	}
}
