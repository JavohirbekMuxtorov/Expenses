package diamond.developer.expenses.domains.usecase

import android.text.format.DateFormat
import java.util.Date
import javax.inject.Inject

open class GetFormattedUseCase @Inject constructor() {

    open operator fun invoke(date: Date): String {
        return getFormatteDate(date)
    }
    fun getFormatteDate(date: Date): String {
        val dayOfWeek = DateFormat.format("EEE",date)
        val day = DateFormat.format("dd",date)
        val monthAttr = DateFormat.format("MMM",date)

        return "$dayOfWeek $day $monthAttr"
    }
}