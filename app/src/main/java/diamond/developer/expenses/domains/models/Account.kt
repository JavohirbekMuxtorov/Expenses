package diamond.developer.expenses.domains.models

data class Account(
    val account: String,
    val amount: Double,
    val income: Double,
    val expense: Double,
)