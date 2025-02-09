package diamond.developer.expenses.data.repository

import diamond.developer.expenses.data.TransactionDao
import diamond.developer.expenses.data.local.entity.AccountDto
import diamond.developer.expenses.data.local.entity.TransactionDto
import diamond.developer.expenses.domains.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TransactionRepositoryImpl @Inject constructor(
    private val transactionDao: TransactionDao
): TransactionRepository {
    override suspend fun insertTransaction(transaction: TransactionDto) {
        transactionDao.insertTransaction(transaction)
    }

    override suspend fun insertAccount(accounts: List<AccountDto>) {
        transactionDao.insertAccount(accounts)
    }

    override fun getDailyTransactions(entryDate: String): Flow<List<TransactionDto>> {
        return transactionDao.getDailyTransaction(entryDate)
    }

    override fun getTransactionByAccount(accountType: String): Flow<List<TransactionDto>> {
        return transactionDao.getTransactionByAccount(accountType)
    }

    override fun getAccount(account: String): Flow<AccountDto> {
        return transactionDao.getAccount(account)
    }

    override fun getAccounts(): Flow<List<AccountDto>> {
        return transactionDao.getAccounts()
    }

    override fun getAllTransaction(): Flow<List<TransactionDto>> {
        return getAllTransaction()
    }

    override fun eraseTransaction() {
        transactionDao.eraseTransaction()
    }

    override fun getCurrentDayExpTransaction(): Flow<List<TransactionDto>> {
        return transactionDao.getCurrentDayExpTransaction()
    }

    override fun getWeeklyExpTransaction(): Flow<List<TransactionDto>> {
        return transactionDao.getWeeklyExpTransaction()
    }

    override fun getMonthlyExpTransaction(): Flow<List<TransactionDto>> {
        return transactionDao.getMonthlyExpTransaction()
    }

    override fun get3DayTransaction(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.get3DayExpTransaction(transactionType)
    }

    override fun get7DayTransaction(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.get7DayExpTransaction(transactionType)
    }

    override fun get14DayTransaction(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.get14DayExpTransaction(transactionType)
    }

    override fun startMonthTransaction(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.getStartOfMonthTransaction(transactionType)
    }

    override fun getLastMonthTransaction(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.getLastMonthTransaction(transactionType)
    }

    override fun getTransactionByTypes(transactionType: String): Flow<List<TransactionDto>> {
        return transactionDao.getTransactionByType(transactionType)
    }
}