package diamond.developer.expenses.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import diamond.developer.expenses.domains.models.Account

@Entity(tableName = "accounts_table")
data class AccountDto(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Int = 0,
    @ColumnInfo(name = "account")
    val accountType: String,
    @ColumnInfo(name = "balance")
    val balance: Double,
    @ColumnInfo(name = "income")
    val income: Double,
    @ColumnInfo(name = "expense")
    val expense: Double,
) {
    fun toAccount(): Account = Account(
        account = accountType,
        amount = balance,
        income = income,
        expense = expense
    )
}
