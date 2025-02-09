package diamond.developer.expenses.domains.usecase.read_datastore

import diamond.developer.expenses.domains.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLimitDurationUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(): Flow<Int>{
        return dataStoreRepository.readLimitDurationFromDataStore()
    }

}