package diamond.developer.expenses.domains.usecase.read_database

import diamond.developer.expenses.data.local.entity.AccountDto
import diamond.developer.expenses.data.local.entity.TransactionDto
import diamond.developer.expenses.domains.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMonthlyExpTransactionUsecase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    operator fun invoke(): Flow<List<TransactionDto>>{
        return transactionRepository.getMonthlyExpTransaction()
    }

}