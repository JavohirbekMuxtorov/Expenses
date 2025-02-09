package diamond.developer.expenses.domains.usecase.read_datastore

import diamond.developer.expenses.domains.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetOnboardingUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(): Flow<Boolean>{
        return dataStoreRepository.readOnboardingKeyFromDataStore()
    }

}