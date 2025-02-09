package diamond.developer.expenses.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import diamond.developer.expenses.data.local.converters.DateConverter
import diamond.developer.expenses.data.local.entity.AccountDto
import diamond.developer.expenses.data.local.entity.TransactionDto

@TypeConverters(value = [DateConverter::class])
@Database(
    entities = [
        TransactionDto::class,
    AccountDto::class
    ],
    exportSchema = true,
    version = 1
)
abstract class TransactionDatabase: RoomDatabase() {
    abstract val transactionDao: TransactionDao
}