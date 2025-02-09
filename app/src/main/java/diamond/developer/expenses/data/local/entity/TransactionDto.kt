package diamond.developer.expenses.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import diamond.developer.expenses.domains.models.Transaction
import java.util.Date

@Entity(tableName = "transaction_table")
data class TransactionDto(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Int = 0,
    @ColumnInfo(name = "timestamp")
    val date: Date,
    @ColumnInfo(name = "entry_date")
    val dateOfEntry: String,
    @ColumnInfo(name = "amount")
    val amount: Double,
    @ColumnInfo(name = "category")
    val category: String,
    @ColumnInfo(name = "account")
    val account: String,
    @ColumnInfo(name = "transaction_type")
    val transactionType: String,
    @ColumnInfo(name = "transaction_title")
    val title: String
){
    fun toTransaction(): Transaction = Transaction(
        date = date,
        dateOfEntry = dateOfEntry,
        amount = amount,
        category = category,
        account = account,
        transactionType = transactionType,
        title = title
    )

}