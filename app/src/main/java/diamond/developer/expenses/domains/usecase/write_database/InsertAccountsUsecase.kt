package diamond.developer.expenses.domains.usecase.write_database

import diamond.developer.expenses.data.local.entity.AccountDto
import diamond.developer.expenses.domains.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class InsertAccountsUsecase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    suspend operator fun invoke(accounts: List<AccountDto>){
        transactionRepository.insertAccount(accounts)
    }

}