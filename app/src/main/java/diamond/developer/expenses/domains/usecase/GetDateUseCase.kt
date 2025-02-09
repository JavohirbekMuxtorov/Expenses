package diamond.developer.expenses.domains.usecase

import java.text.SimpleDateFormat
import java.util.Calendar
import javax.inject.Inject

open class GetDateUseCase @Inject constructor() {
    private fun getDate(): String{
        return SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().time)
    }
}