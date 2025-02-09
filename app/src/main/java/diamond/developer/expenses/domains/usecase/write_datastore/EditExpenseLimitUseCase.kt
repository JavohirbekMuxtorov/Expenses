package diamond.developer.expenses.domains.usecase.write_datastore

import diamond.developer.expenses.domains.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EditExpenseLimitUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(amount: Double){
        return dataStoreRepository.writeExpenseLimitToDataStore(amount)
    }

}