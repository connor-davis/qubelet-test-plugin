package test;

import io.qubelet.qubelet.plugin.QubeletPlugin;

public class QubeletTestPlugin extends QubeletPlugin {
    @Override
    public void onLoad() {
        getLogger().info("Woww, custom onload!");
    }
}
