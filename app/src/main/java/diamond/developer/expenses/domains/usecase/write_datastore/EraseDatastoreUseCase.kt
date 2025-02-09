package diamond.developer.expenses.domains.usecase.write_datastore

import diamond.developer.expenses.domains.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EraseDatastoreUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(){
        return dataStoreRepository.eraseDataStore()
    }

}