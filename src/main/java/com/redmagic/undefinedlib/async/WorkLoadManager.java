package com.redmagic.undefinedlib.async;

import lombok.AllArgsConstructor;

import java.util.ArrayDeque;

@AllArgsConstructor
public class WorkLoadManager implements Runnable {
    private static final int MAX_MS_PER_TICK = 10;
    private static final int MAX_NANOS_PER_TICK = MAX_MS_PER_TICK * 1000000;
    private final ArrayDeque<WorkLoad> workloads = new ArrayDeque<>();

    public void addWorkload(WorkLoad workload) {
        this.workloads.add(workload);
    }

    @Override
    public void run() {
        long stopTime = System.nanoTime() + MAX_NANOS_PER_TICK;
        WorkLoad workload;

        while (System.nanoTime() < stopTime && !workloads.isEmpty() && (workload = workloads.poll()) != null) {
            workload.compute();
        }
    }
}
