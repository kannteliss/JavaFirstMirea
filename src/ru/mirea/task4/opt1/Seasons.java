package ru.mirea.task4.opt1;

public enum Seasons {
    Winter(-10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    Spring(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    Summer(24) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    Autumn(7) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };


    private final int AverageTemperature;

    Seasons(int averageTemp){
        this.AverageTemperature = averageTemp;
    }

    public int getAverageTemperature(){
        return AverageTemperature;
    }

    public abstract String getDescription();

}