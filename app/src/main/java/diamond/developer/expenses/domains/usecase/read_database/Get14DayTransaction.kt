package diamond.developer.expenses.domains.usecase.read_database

import diamond.developer.expenses.data.local.entity.TransactionDto
import diamond.developer.expenses.domains.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Get14DayTransaction @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    operator fun invoke(transactionType: String): Flow<List<TransactionDto>>{
        return transactionRepository.get14DayTransaction(transactionType)
    }

}