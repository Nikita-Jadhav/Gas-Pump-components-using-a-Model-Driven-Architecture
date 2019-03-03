package Strategy;

import DataRepository.DataStore;

/*
    Abstract StorePrices action strategy
 */
public abstract class StorePrices {
    DataStore data;

    public StorePrices(DataStore data) {
        this.data = data;
    }

    public abstract void storePrices();
}
