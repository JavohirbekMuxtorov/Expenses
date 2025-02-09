package diamond.developer.expenses.domains.models

data class Currency(
    val country: String = String(),
    val countryCode: String = String(),
    val currencySymbol: String = String(),
)
