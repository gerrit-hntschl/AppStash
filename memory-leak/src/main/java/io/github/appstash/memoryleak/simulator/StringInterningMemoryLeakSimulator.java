package io.github.appstash.memoryleak.simulator;

import java.util.UUID;

/**
 * @author zutherb
 */
public final class StringInterningMemoryLeakSimulator extends AbstractMemoryLeakSimulator {

    @Override
    protected void doLeakSimulation() {
        UUID.randomUUID().toString().intern();
    }
}
