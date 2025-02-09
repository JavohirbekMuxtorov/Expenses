package diamond.developer.expenses.domains.usecase.write_datastore

import diamond.developer.expenses.domains.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EditLimitKeyUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(enabled: Boolean){
        return dataStoreRepository.writeLimitKeyToDataStore(enabled)
    }

}