package com.company.structural.Adapter;

public class PCToComputerGameAdapter extends ComputerGame implements PCGame{


    public PCToComputerGameAdapter(String name, PegiAgeRating pegiAgeRating, Double budgetInMillionsOfDollars, Integer minimumGpuMemoryInMegabytes,
                                   Integer diskSpaceNeededInGB, Integer ramNeededInGb, Integer coresNeeded, Double coreSpeedInGhz) {
        super(name, pegiAgeRating, budgetInMillionsOfDollars, minimumGpuMemoryInMegabytes,
                diskSpaceNeededInGB, ramNeededInGb, coresNeeded, coreSpeedInGhz);
    }

    @Override
    public String getTitle() {
        return getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (getPegiAgeRating()) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        throw new RuntimeException("Unsupported PEGI rating");
    }

    @Override
    public boolean isTripleAGame() {
        return getBudgetInMillionsOfDollars()>50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(getMinimumGpuMemoryInMegabytes()
                ,getDiskSpaceNeededInGB(),getRamNeededInGb(),getCoreSpeedInGhz(),getCoresNeeded());
    }
}
