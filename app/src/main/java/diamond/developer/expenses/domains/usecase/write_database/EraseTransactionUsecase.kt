package diamond.developer.expenses.domains.usecase.write_database

import diamond.developer.expenses.domains.repository.TransactionRepository
import javax.inject.Inject

class EraseTransactionUsecase @Inject constructor(
    val transactionRepository: TransactionRepository
) {
    operator fun invoke(){
        transactionRepository.eraseTransaction()
    }
}