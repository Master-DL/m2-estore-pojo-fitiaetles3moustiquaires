package services;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    double getPrice(Object item) throws UnknownItemException;
    int order(IStore store, Object item, int qty) throws UnknownItemException;
}

