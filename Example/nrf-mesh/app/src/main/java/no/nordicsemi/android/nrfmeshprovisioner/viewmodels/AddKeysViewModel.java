package no.nordicsemi.android.nrfmeshprovisioner.viewmodels;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import no.nordicsemi.android.meshprovisioner.transport.ProvisionedMeshNode;
import no.nordicsemi.android.nrfmeshprovisioner.keys.AppKeysActivity;
import no.nordicsemi.android.nrfmeshprovisioner.keys.NetKeysActivity;

/**
 * ViewModel for {@link NetKeysActivity}, {@link AppKeysActivity}
 */
public class AddKeysViewModel extends KeysViewModel {

    @Inject
    AddKeysViewModel(@NonNull final NrfMeshRepository nrfMeshRepository) {
        super(nrfMeshRepository);
    }

    /**
     * Checks if the key has been added to the node
     *
     * @param keyIndex index of the key
     * @return true if added or false otherwise
     */
    public boolean isNetKeyAdded(final int keyIndex) {
        final ProvisionedMeshNode node = getSelectedMeshNode().getValue();
        if (node != null) {
            return node.getAddedNetKeyIndexes().contains(keyIndex);
        }
        return false;
    }

    /**
     * Checks if the key has been added to the node
     *
     * @param keyIndex index of the key
     * @return true if added or false otherwise
     */
    public boolean isAppKeyAdded(final int keyIndex) {
        final ProvisionedMeshNode node = getSelectedMeshNode().getValue();
        if (node != null) {
            return node.getAddedAppKeyIndexes().contains(keyIndex);
        }
        return false;
    }

}
