package diamond.developer.expenses.domains.usecase

import diamond.developer.expenses.domains.models.Currency
import java.util.Locale
import javax.inject.Inject

class GetCurrencyUseCase @Inject constructor() {
    operator fun invoke():List<Currency>{
        val currencies = mutableListOf<Currency>()
        val countries = mutableListOf<String>()
        val allLocal = Locale.getAvailableLocales()

        allLocal.forEach { locale->
            val countryName = locale.displayCountry
            try {
                val countryCode = java.util.Currency.getInstance(locale).currencyCode
                val currency = java.util.Currency.getInstance(countryCode)
                val currencySymbol = currency.getSymbol(locale)

                val currencyModel = Currency(countryName,countryCode,currencySymbol)

                if (countryName.trim().isNotEmpty() && !countries.contains(countryName)){
                    countries.add(countryName)
                    currencies.add(currencyModel)
                }
            }catch (e : Exception){}
        }
        return currencies.sortedBy { it.country }
    }
}